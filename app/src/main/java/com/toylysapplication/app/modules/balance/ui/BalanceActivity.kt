package com.toylysapplication.app.modules.balance.ui

import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityBalanceBinding
import com.toylysapplication.app.modules.account.ui.AccountActivity
import com.toylysapplication.app.modules.balance.`data`.viewmodel.BalanceVM
import kotlin.String
import kotlin.Unit

class BalanceActivity : BaseActivity<ActivityBalanceBinding>(R.layout.activity_balance) {
  private val viewModel: BalanceVM by viewModels<BalanceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.balanceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameButtonnavigati.setOnClickListener {
      val destIntent = AccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BALANCE_ACTIVITY"

  }
}
