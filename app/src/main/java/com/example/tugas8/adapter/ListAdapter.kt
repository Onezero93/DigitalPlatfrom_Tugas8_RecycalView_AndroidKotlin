package com.example.crycelview_list.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas8.List_Detail
import com.example.tugas8.databinding.ItemListBinding
import com.example.tugas8.model.DataList

class ListAdapter(private val content: Context): RecyclerView.Adapter<ListAdapter.AplikasiViewHolder>() {
    private val list = ArrayList<DataList>()
    fun setData(listParams: List<DataList>) {
        list.clear()
        list.addAll(listParams)
        notifyDataSetChanged()
    }
    inner class AplikasiViewHolder(private val binding: ItemListBinding)
        : RecyclerView.ViewHolder(binding.root){

        fun bind(data: DataList){
            binding.image.setImageResource(data.image)
            binding.title.text = data.nama
            binding.des.text = data.des
            binding.star.text = data.rating.toString()
            itemView.setOnClickListener{
                val intent = Intent(content,List_Detail::class.java)
                intent.putExtra("imag",data.image)
                intent.putExtra("nama",data.nama)
                intent.putExtra("desc",data.des)
                intent.putExtra("reting",data.rating)
                content.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AplikasiViewHolder (
        ItemListBinding.inflate(LayoutInflater.from(content),parent,false)
    )

    override fun onBindViewHolder(holder: AplikasiViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}