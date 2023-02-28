package com.ebookfrenzy.savename.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.jar.Attributes.Name

class MainViewModel : ViewModel() {

    //    private var Name = ""
    var Name: MutableLiveData<String> = MutableLiveData()
    var result: MutableLiveData<String> = MutableLiveData("")


    fun setAmount() {
        Name.let {
            if (!it.value.equals("")) {


                result.value += "\n"+ Name.value
            } else {
                result.value
            }
        }


    }

    // TODO: Implement the ViewModel
}

