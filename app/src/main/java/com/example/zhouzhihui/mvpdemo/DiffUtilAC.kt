package com.example.zhouzhihui.mvpdemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import nz.co.trademe.mapme.MapMeAdapter


/**
 * Created by 周智慧 on 2017/9/22.
 */
class DiffUtilAC : AppCompatActivity() {
    var fage: MapMeAdapter<Any>? = null
    lateinit var recyclerView: RecyclerView
    internal lateinit var mAdapter: HomeAdapter
    companion object {
        fun start(activity: Activity) {
            val intent = Intent(activity, DiffUtilAC::class.java)
            activity.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAdapter = HomeAdapter()
        var root = FrameLayout(this)
        recyclerView = RecyclerView(this)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.setAdapter(mAdapter)
        root.addView(recyclerView, FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT))

        setContentView(root)
    }


    internal inner class HomeAdapter : RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val holder = MyViewHolder(LayoutInflater.from(this@DiffUtilAC).inflate(R.layout.item_home, parent, false))
            return holder
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.tv.setText("${position + 1}")
        }

        override fun getItemCount(): Int {
            return 20
        }

        internal inner class MyViewHolder(view: View) : ViewHolder(view) {
            var tv: TextView
            init {
                tv = view.findViewById<TextView>(R.id.id_num) as TextView
            }
        }
    }
}