package com.toylysapplication.app.modules.balance.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.toylysapplication.app.modules.balance.`data`.model.BalanceModel
import org.koin.core.KoinComponent

class BalanceVM : ViewModel(), KoinComponent {
  val balanceModel: MutableLiveData<BalanceModel> = MutableLiveData(BalanceModel())

  var navArguments: Bundle? = null
}
