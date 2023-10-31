package com.example.gmailapp.ui.primary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrimaryViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Primary Fragment"
    }
    val text: LiveData<String> = _text
    }
