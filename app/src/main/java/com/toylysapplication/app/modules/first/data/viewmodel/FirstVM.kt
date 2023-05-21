package com.toylysapplication.app.modules.first.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.toylysapplication.app.modules.first.`data`.model.FirstModel
import org.koin.core.KoinComponent

class FirstVM : ViewModel(), KoinComponent {
  val firstModel: MutableLiveData<FirstModel> = MutableLiveData(FirstModel())

  var navArguments: Bundle? = null
}
