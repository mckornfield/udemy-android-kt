package com.mckornfield.todolist

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_todo.*

class CreateTodo : AppCompatActivity() {

    companion object {
        @JvmStatic
        val PREF_STRING = "com.mckornfield.todolist.prefs"
        @JvmStatic
        val TODO_KEY = "todostrings"

        fun getTodos(activity: AppCompatActivity): MutableSet<String> {
            val prefs = activity.getSharedPreferences(PREF_STRING, Context.MODE_PRIVATE)
            val todos = prefs.getStringSet(TODO_KEY, mutableSetOf())
            return todos ?: mutableSetOf()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_todo)
        var title: String
        saveButton.setOnClickListener {
            if (importantCheckbox.isChecked) {
                title = "❗ " + titleEditText.text.toString()
            } else {
                title = titleEditText.text.toString()
            }

            editTodo(title)
            finish()
        }
    }

    private fun editTodo(title: String) {
        val todos = getTodos(this)
        todos.add(title)
        val prefs = getSharedPreferences(PREF_STRING, Context.MODE_PRIVATE)
        prefs.edit().putStringSet(TODO_KEY, todos).apply()
    }

}
