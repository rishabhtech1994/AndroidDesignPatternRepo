package com.rishabh.dukaanandroidassignment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rishabh.dukaanandroidassignment.R
import com.rishabh.dukaanandroidassignment.adapter.OrderCategoriesAdapter
import com.rishabh.dukaanandroidassignment.adapter.OrderDetailsListAdapter
import com.rishabh.dukaanandroidassignment.data.OrderCategory
import com.rishabh.dukaanandroidassignment.data.OrderCategoryData


class DashboardMainFragment : Fragment() {
    private lateinit var horizontal_recycler_view: RecyclerView
    private lateinit var recycler_view_orders_details: RecyclerView
    private val horizontalList: ArrayList<OrderCategory>? = arrayListOf()
    private var horizontalAdapter: OrderCategoriesAdapter? = null
    lateinit var orderDetailsListAdapter: OrderDetailsListAdapter

    companion object {
        const val CLASS_NAME = "DashboardMainContentFragment"
        fun newInstance(): Fragment {
            return DashboardMainFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View =
            inflater.inflate(R.layout.dashboard_main_fragment_layout, container, false)

        /**********************Adapter setting for the Horizontal scroll ************************/
        for (i in 0 until OrderCategoryData.nameArray.size) {
            horizontalList!!.add(
                OrderCategory(OrderCategoryData.nameArray.get(i))
            )
        }
        horizontal_recycler_view = rootView.findViewById(R.id.recycler_view_active_orders_types)
        horizontalAdapter = OrderCategoriesAdapter(activity!!, horizontalList)
        val horizontalLayoutManagaer =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        horizontal_recycler_view.layoutManager = horizontalLayoutManagaer
        horizontal_recycler_view.adapter = horizontalAdapter


        /**********************Adapter setting for the Vertical scroll ************************/
        recycler_view_orders_details = rootView.findViewById(R.id.recycler_view_orders_details)
        orderDetailsListAdapter = OrderDetailsListAdapter(activity!!)
        val mLayoutManager = androidx.recyclerview.widget.LinearLayoutManager(
            activity,
            androidx.recyclerview.widget.LinearLayoutManager.VERTICAL,
            false
        )
        recycler_view_orders_details.layoutManager = mLayoutManager
        recycler_view_orders_details.itemAnimator =
            androidx.recyclerview.widget.DefaultItemAnimator()
        recycler_view_orders_details.adapter = orderDetailsListAdapter

        return rootView
    }


}