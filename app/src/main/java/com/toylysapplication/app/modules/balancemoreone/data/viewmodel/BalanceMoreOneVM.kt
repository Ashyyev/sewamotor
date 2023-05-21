package com.toylysapplication.app.modules.balancemoreone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.toylysapplication.app.modules.balancemoreone.`data`.model.BalanceMoreOneModel
import org.koin.core.KoinComponent

class BalanceMoreOneVM : ViewModel(), KoinComponent {
  val balanceMoreOneModel: MutableLiveData<BalanceMoreOneModel> =
      MutableLiveData(BalanceMoreOneModel())

  var navArguments: Bundle? = null
}
