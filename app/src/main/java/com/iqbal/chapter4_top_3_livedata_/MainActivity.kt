package com.iqbal.chapter4_top_3_livedata_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iqbal.chapter4_top_3_livedata_.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vmProduct : ViewModelProduct
    lateinit var adapterProduct : ProductAdapter
    lateinit var rvproduct : RecyclerView
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

//        Init dan

        vmProduct = ViewModelProvider(this).get(ViewModelProduct::class.java)
        adapterProduct = ProductAdapter(ArrayList())


//        observe livedata
        vmProduct.getProduct()
        vmProduct.product.observe(this, Observer {
            adapterProduct.setDataProduct(it as ArrayList<DataProduct>)
        })

        rvproduct = findViewById(R.id.rvProduct)
        binding.rvProduct.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvProduct.adapter = adapterProduct


    }
}