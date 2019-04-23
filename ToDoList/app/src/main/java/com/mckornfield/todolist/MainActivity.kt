package com.mckornfield.todolist

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: TodoAdapter
    val todoStore: TodoStore = TodoStore()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        fab.setOnClickListener { view ->
            val intent = Intent(view.context, CreateTodo::class.java)
            startActivity(intent)
            
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_delete_all -> {
                val prefs = getSharedPreferences(CreateTodo.PREF_STRING, Context.MODE_PRIVATE)
                prefs.edit().putStringSet(CreateTodo.TODO_KEY, setOf()).apply()
                updateRecycler()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun updateTodos() {
        val todos = CreateTodo.getTodos(this)
        todoStore.todoList = todos.toMutableList()
    }

    fun updateRecycler(){

        updateTodos()

        layoutManager = LinearLayoutManager(this)
        todoRecyclerView.layoutManager = layoutManager

        adapter = TodoAdapter(todoStore)
        todoRecyclerView.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        println("In on resume")
        updateRecycler()
    }
}
