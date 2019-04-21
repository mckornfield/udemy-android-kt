package com.mckornfield.tipcalculator

import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mckornfield.emojidictionary2.EmojiDetailActivity
import com.mckornfield.emojidictionary2.R
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class EmojiAdapter(val emojis: ArrayList<String>) : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false))
    }

    override fun getItemCount(): Int {
        return emojis.count()
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        val emoji = emojis[position]
        holder.bindEmoji(emoji)
    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        init {
//            v.setOnClickListener(this)
        }

        var view: View = v

        var emoji: String = ""

        fun bindEmoji(emoji: String) {
            this.emoji = emoji
            view.itemTextView.text = emoji
        }

        override fun onClick(v: View?) {
            val detailIntent = Intent(view.context, EmojiDetailActivity::class.java)
            detailIntent.putExtra("emoji",emoji)
            startActivity(view.context, detailIntent, null)
        }

    }
}