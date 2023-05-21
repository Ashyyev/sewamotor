package com.toylysapplication.app.modules.scan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.toylysapplication.app.modules.scan.`data`.model.ScanModel
import org.koin.core.KoinComponent

class ScanVM : ViewModel(), KoinComponent {
  val scanModel: MutableLiveData<ScanModel> = MutableLiveData(ScanModel())

  var navArguments: Bundle? = null
}
