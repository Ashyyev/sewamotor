package com.toylysapplication.app.modules.registorlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.toylysapplication.app.modules.registorlogin.`data`.model.RegistOrLoginModel
import org.koin.core.KoinComponent

class RegistOrLoginVM : ViewModel(), KoinComponent {
  val registOrLoginModel: MutableLiveData<RegistOrLoginModel> =
      MutableLiveData(RegistOrLoginModel())

  var navArguments: Bundle? = null
}
