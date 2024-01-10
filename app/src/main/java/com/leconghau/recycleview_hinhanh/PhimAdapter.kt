package com.leconghau.recycleview_hinhanh

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhimAdapter(private val dsPhim: List<Phim>)
    : RecyclerView.Adapter<PhimAdapter.PhimViewH>() {

        var onItemClick : (Phim, Int) -> Unit = { _ , _  -> }
       inner class PhimViewH(itemView: View): RecyclerView.ViewHolder(itemView) {
            val imgPhim = itemView.findViewById<ImageView>(R.id.imgPhim)
            val tvTenPhim = itemView.findViewById<TextView>(R.id.tvTenPhim)
            val tvTheLoai = itemView.findViewById<TextView>(R.id.tvTheloai)

           init {
               itemView.rootView.setOnClickListener {
                   onItemClick.invoke(dsPhim[layoutPosition], layoutPosition)
               }
           }

            fun onBind(phim: Phim){
                tvTenPhim.text = phim.tenPhim
                tvTheLoai.text = phim.theLoai
                imgPhim.setImageResource(phim.hinh)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhimViewH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.danh_muc_phim,parent,false)
        return PhimViewH(itemView)
    }

    override fun getItemCount(): Int = dsPhim.size

    override fun onBindViewHolder(holder: PhimViewH, position: Int) {
        holder.onBind(dsPhim[position])
    }

}