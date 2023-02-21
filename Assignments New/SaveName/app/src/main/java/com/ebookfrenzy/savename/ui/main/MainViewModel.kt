package com.ebookfrenzy.savename.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var Name = ""
    private var result="\n "
    fun setAmount(value: String) {
        this.Name = value
        result += Name+"\n"
    }
    fun getResult(): String {
        return result
    }
    // TODO: Implement the ViewModel
}