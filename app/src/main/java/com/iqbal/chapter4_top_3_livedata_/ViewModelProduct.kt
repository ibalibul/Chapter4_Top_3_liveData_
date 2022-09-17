package com.iqbal.chapter4_top_3_livedata_

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct: ViewModel() {

    val list = arrayListOf(
        DataProduct("wew",R.drawable.ic_launcher_background,12,"description",23),
        DataProduct("wew",R.drawable.ic_launcher_background,12,"description",23),
        DataProduct("wew",R.drawable.ic_launcher_background,12,"description",23),
        DataProduct("wew",R.drawable.ic_launcher_background,12,"description",23),


    )

    val product: MutableLiveData<List<DataProduct>> = MutableLiveData()

    fun getProduct(){
        product.value = list
    }


}