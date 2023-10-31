package com.example.gmailapp.ui.primary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gmailapp.R
import com.example.gmailapp.ui.allinboxes.model.Gmail

class PrimaryViewModel : ViewModel() {
    private val _gmailList = MutableLiveData<List<Gmail>>()

    val gmailList: LiveData<List<Gmail>> = _gmailList

    fun getGmailList(){
        val list = arrayListOf<Gmail>()

        val gmail1 = Gmail(R.drawable.twitter_logo,"BHEL Recruitment","BHEL General Duty Medical Officer Recruitment","We saw your profile on Indeed and thought")
        val msg = Gmail(R.drawable.amazon_logo,"Amazon","Graet Indian Festival","Buy your pending item at minimum price")
        val msg2 = Gmail(R.drawable.facebook_logo,"Facebook","Meet your Freiend","Some new suggestion to add in your friendlist")


        for(i in 1..15)
        {
            if(i%2==0){
                list.add(gmail1)
            }
            else if(i%3==0){
                list.add(msg2)
            }
            else{
                list.add(msg)
            }
        }
        _gmailList.value =list

    }
    }
