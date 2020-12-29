package com.rishabh.dukaanandroidassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.rishabh.dukaanandroidassignment.R

class OrderDetailsListAdapter(val context: Context): androidx.recyclerview.widget.RecyclerView.Adapter<OrderDetailsListAdapter.MyViewHolder>() {
    lateinit var rowView: View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent?.getContext())
            .inflate(R.layout.pending_item_list, parent, false)
        rowView = itemView
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        if(position == 0){
            holder.textViewOrderId.text =context.resources.getString(R.string.order1)
        }else if(position ==1){
            holder.textViewOrderId.text =context.resources.getString(R.string.order2)
            holder.textViewItemCost.text= context.resources.getString(R.string.costitem2)
            holder.textViewDate.text = context.resources.getString(R.string.dateitem2)
            holder.textViewPaymentMethod.background = context.resources.getDrawable(R.drawable.text_view_border_red)
            holder.textViewPaymentMethod.text = context.resources.getString(R.string.paid)
            holder.textViewPaymentMethod.setTextColor(context.resources.getColor(R.color.red))

        }else if(position ==2){
            holder.textViewOrderId.text =context.resources.getString(R.string.order3)
            holder.textViewItemCost.text= context.resources.getString(R.string.costitem3)
            holder.textViewDate.text = context.resources.getString(R.string.dateitem3)
            holder.textButton.visibility = View.GONE
            holder.textViewPaymentMethod.text = context.getResources().getColor(R.color.black).toString()
            holder.textViewPaymentMethod.background = context.resources.getDrawable(R.drawable.text_view_border_red)
            holder.textViewPaymentMethod.text = context.resources.getString(R.string.paid)
            holder.textViewPaymentMethod.setTextColor(context.resources.getColor(R.color.red))
        }

    }

    inner class MyViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

        var textViewOrderId: TextView
        var imageViewItem: ImageView
        var textViwItemQuantity: TextView
        var textViewItemCost:TextView
        var textViewDate:TextView
        var textViewPaymentMethod:TextView
        var textButton: Button

        init {
            textViewOrderId = itemView.findViewById(R.id.textViewOrderId)
            imageViewItem = itemView.findViewById(R.id.imageViewItem)
            textViwItemQuantity=itemView.findViewById(R.id.textViwItemQuantity)
            textViewItemCost=itemView.findViewById(R.id.textViewItemCost)
            textViewDate=itemView.findViewById(R.id.textViewDate)
            textButton=itemView.findViewById(R.id.textButton)
            textViewPaymentMethod = itemView.findViewById(R.id.textViewPaymentMethod)
        }

    }
}