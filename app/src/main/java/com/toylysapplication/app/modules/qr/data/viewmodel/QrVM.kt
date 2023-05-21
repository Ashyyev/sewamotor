package com.toylysapplication.app.modules.qr.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.toylysapplication.app.modules.qr.`data`.model.QrModel
import org.koin.core.KoinComponent

class QrVM : ViewModel(), KoinComponent {
  val qrModel: MutableLiveData<QrModel> = MutableLiveData(QrModel())

  var navArguments: Bundle? = null
}
