package com.mckornfield.emojidictionary2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.mckornfield.tipcalculator.EmojiAdapter
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    lateinit var layoutManager: LinearLayoutManager

    lateinit var adapter: EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        layoutManager = GridLayoutManager(this, 5)
        recyclerView.layoutManager = layoutManager
        adapter = EmojiAdapter(
            arrayListOf(
                "😀",
                "😁",
                "😂",
                "🤣",
                "😃",
                "😄",
                "😅",
                "😆",
                "😉",
                "😊",
                "😋",
                "😎",
                "😍",
                "😘",
                "🥰",
                "😗",
                "😙",
                "😚",
                "☺️",
                "🙂",
                "🤨",
                "😐",
                "😑"
            )
        )
        recyclerView.adapter = adapter
    }
}
