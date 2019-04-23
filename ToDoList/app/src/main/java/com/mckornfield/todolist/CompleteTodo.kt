package com.mckornfield.todolist

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_complete_todo.*

class CompleteTodo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_todo)

        val todo = intent.extras.getString("title")
        todoTextView.text = todo

        completeButton.setOnClickListener {
            val todos = CreateTodo.getTodos(this)
            todos.remove(todo!!)

            val prefs = getSharedPreferences(CreateTodo.PREF_STRING, Context.MODE_PRIVATE)
            prefs.edit().putStringSet(CreateTodo.TODO_KEY, todos).apply()
            finish()
        }
    }
}
