package com.toylysapplication.app.modules.transaction.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityTransactionBinding
import com.toylysapplication.app.modules.account.ui.AccountActivity
import com.toylysapplication.app.modules.transaction.`data`.viewmodel.TransactionVM
import kotlin.String
import kotlin.Unit

class TransactionActivity : BaseActivity<ActivityTransactionBinding>(R.layout.activity_transaction)
    {
  private val viewModel: TransactionVM by viewModels<TransactionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.transactionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnOk.setOnClickListener {
      val destIntent = AccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TRANSACTION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TransactionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
