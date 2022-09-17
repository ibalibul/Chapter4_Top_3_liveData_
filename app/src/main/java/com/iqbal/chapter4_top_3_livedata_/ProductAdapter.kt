package com.iqbal.chapter4_top_3_livedata_

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iqbal.chapter4_top_3_livedata_.databinding.ItemProductBinding

class ProductAdapter(var listProduct : ArrayList<DataProduct>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>(){

    class ViewHolder(var binding : ItemProductBinding): RecyclerView.ViewHolder(binding.root) {
       fun bindproduct(itemProduct : DataProduct){
           binding.product = itemProduct
       }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindproduct(listProduct[position])
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }

    fun setDataProduct(itemData : ArrayList<DataProduct>){
        this.listProduct = itemData
    }
}