package com.toylysapplication.app.modules.balancemore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.toylysapplication.app.modules.balancemore.`data`.model.BalanceMoreModel
import org.koin.core.KoinComponent

class BalanceMoreVM : ViewModel(), KoinComponent {
  val balanceMoreModel: MutableLiveData<BalanceMoreModel> = MutableLiveData(BalanceMoreModel())

  var navArguments: Bundle? = null
}
