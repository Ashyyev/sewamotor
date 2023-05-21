package com.toylysapplication.app.modules.transaction.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.toylysapplication.app.modules.transaction.`data`.model.TransactionModel
import org.koin.core.KoinComponent

class TransactionVM : ViewModel(), KoinComponent {
  val transactionModel: MutableLiveData<TransactionModel> = MutableLiveData(TransactionModel())

  var navArguments: Bundle? = null
}
