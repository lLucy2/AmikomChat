package com.example.amikomchat

// MyAdapter.kt
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterCafe(private val context: Context, private val itemList: List<ListItem>) :
    RecyclerView.Adapter<AdapterCafe.MyViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cafe, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.titleTextView.text = currentItem.title
        holder.detailTextView.text = currentItem.detail

        holder.itemView.setOnClickListener {
            onItemClickListener?.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.CafeImage)
        val titleTextView: TextView = itemView.findViewById(R.id.CafeTitle)
        val detailTextView: TextView = itemView.findViewById(R.id.CafeDetail)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.onItemClickListener = listener
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}
