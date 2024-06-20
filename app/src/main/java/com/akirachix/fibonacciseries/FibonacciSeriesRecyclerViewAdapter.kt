package com.akirachix.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.akirachix.fibonacciseries.databinding.FibonacciItemBinding

class FibonacciSeriesRecyclerViewAdapter(private val fibonacciList: List<Int>):
    RecyclerView.Adapter<FibonacciSeriesRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =

            LayoutInflater.from(parent.context)
                .inflate(R.layout.fibonacci_item, parent, false)
        return ViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fibonacciList[position])
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.tvNumbers)

        fun bind(fibonacciNumber: Int) {
            textView.text = fibonacciNumber.toString()
        }
    }


}
