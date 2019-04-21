package com.mckornfield.todolist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recyclerview_todo_view.view.*

class TodoAdapter(val todoStore: TodoStore) : RecyclerView.Adapter<TodoAdapter.TextHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_todo_view, parent, false))
    }

    override fun getItemCount(): Int {
        return todoStore.todoList.size
    }

    override fun onBindViewHolder(holder: TextHolder, index: Int) {
        val todo = todoStore.todoList.get(index)
        val updateFunc = {
            notifyDataSetChanged()
            todoStore.todoList.removeAt(index)
        }
        holder.bindTodo(todo, index, updateFunc)
    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        lateinit var todo: String
        var index: Int = 0
        lateinit var notifier: () -> String

        init {
            v.setOnClickListener(this)
        }

        fun bindTodo(todo: String, index: Int, notifier: () -> String) {
            val formattedTodo = "- $todo"
            this.todo = formattedTodo
            this.index = index
            itemView.todoTextView.text = formattedTodo
            this.notifier = notifier
        }

        override fun onClick(v: View?) {
            notifier()
        }

    }
}