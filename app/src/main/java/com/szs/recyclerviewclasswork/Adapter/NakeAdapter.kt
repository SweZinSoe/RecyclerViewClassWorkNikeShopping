package com.szs.recyclerviewclasswork.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyclerviewclasswork.R
import com.szs.recyclerviewclasswork.model.Nike
import kotlinx.android.synthetic.main.nike_items.view.*

class NikeViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

    var noCount = itemView.findViewById<TextView>(R.id.txt_NoCount)
    var name = itemView.findViewById<TextView>(R.id.txt_Type_Name)
    var price = itemView.findViewById<TextView>(R.id.txt_price)
    var image = itemView.findViewById<ImageView>(R.id.img_Nike)

}

class NikeAdapter(val nikeLists: ArrayList<Nike>) : RecyclerView.Adapter<NikeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NikeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.nike_items, parent, false)
        return NikeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return nikeLists.size
    }

    override fun onBindViewHolder(holder: NikeViewHolder, position: Int) {
        holder.noCount.text = nikeLists[position].numberCount
        holder.image.setImageResource(nikeLists[position].image)
        holder.name.text = nikeLists[position].typeName
        holder.price.text = nikeLists[position].price
    }


}