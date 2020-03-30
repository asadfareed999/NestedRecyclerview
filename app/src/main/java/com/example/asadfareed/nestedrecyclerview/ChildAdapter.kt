package com.example.asadfareed.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChildAdapter() : RecyclerView.Adapter<ChildAdapter.ViewHolder>() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ChildAdapter
    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.child_recycler, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return 8
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems() {

        }
    }
}