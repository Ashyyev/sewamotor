package com.toylysapplication.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.toylysapplication.app.R
import com.toylysapplication.app.databinding.RowMenubuttonBinding
import com.toylysapplication.app.modules.home.`data`.model.MenubuttonRowModel
import kotlin.Int
import kotlin.collections.List

class MenubuttonAdapter(
  var list: List<MenubuttonRowModel>
) : RecyclerView.Adapter<MenubuttonAdapter.RowMenubuttonVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMenubuttonVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_menubutton,parent,false)
    return RowMenubuttonVH(view)
  }

  override fun onBindViewHolder(holder: RowMenubuttonVH, position: Int) {
    val menubuttonRowModel = MenubuttonRowModel()
    // TODO uncomment following line after integration with data source
    // val menubuttonRowModel = list[position]
    holder.binding.menubuttonRowModel = menubuttonRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MenubuttonRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MenubuttonRowModel
    ) {
    }
  }

  inner class RowMenubuttonVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMenubuttonBinding = RowMenubuttonBinding.bind(itemView)
  }
}
