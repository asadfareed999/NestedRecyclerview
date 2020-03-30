package com.example.asadfareed.nestedrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.old_item.view.*

class ParentAdapter(mainActivity: MainActivity) : RecyclerView.Adapter<ParentAdapter.ViewHolder>() {

    val context:Context=mainActivity


    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        if (viewType==1) {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.parent_recycler, parent, false)
            return ViewHolder(v)
        }else{
            val v = LayoutInflater.from(parent.context).inflate(R.layout.old_item, parent, false)
            return ViewHolder(v)
        }
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindItems()
    }
    fun getViewTypeCount(): Int {
        return 2
    }

    override fun getItemViewType(position: Int): Int {
        if(position==0){
            return 1
        }
        else{
            return 2
        }
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return 8
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var recyclerView: RecyclerView
        private lateinit var adapter: ChildAdapter
        private lateinit var textView: TextView
        fun bindItems() {
            if (adapterPosition==0){
                adapter = ChildAdapter()
                recyclerView = itemView.findViewById(R.id.rv_child)
                recyclerView.layoutManager = LinearLayoutManager(itemView.context, RecyclerView.HORIZONTAL, false)
                recyclerView.adapter = adapter
            }else{
                textView=itemView.child_textView
                textView.text="hello........."
            }
        }
    }
}