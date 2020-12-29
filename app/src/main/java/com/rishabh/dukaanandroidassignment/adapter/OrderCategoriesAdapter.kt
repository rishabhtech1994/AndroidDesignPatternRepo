package com.rishabh.dukaanandroidassignment.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rishabh.dukaanandroidassignment.R
import com.rishabh.dukaanandroidassignment.data.OrderCategory


class OrderCategoriesAdapter(var context: Context,  horizontalList: ArrayList<OrderCategory>?) :
    RecyclerView.Adapter<OrderCategoriesAdapter.MyViewHolder>() {
    private var horizontalList: ArrayList<OrderCategory>? = null
    init {
        this.horizontalList = horizontalList
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewName: TextView
        init {
            textViewName = itemView.findViewById(R.id.txtView)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, listPosition: Int) {
        val textViewName = holder.textViewName
        textViewName.setText(horizontalList?.get(listPosition)?.name)

        if(listPosition > 0){
            holder.textViewName.background = context.resources.getDrawable(R.drawable.rounded_button_white)
            holder.textViewName.setTextColor(context.resources.getColor(R.color.black))
        }
    }

    override fun getItemCount(): Int {
        return horizontalList!!.size
    }
}