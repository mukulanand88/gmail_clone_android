package com.example.gmailapp.ui.allinboxes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AllInboxViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is All Inbox Fragment"
    }
    val text: LiveData<String> = _text
    }
