package com.toylysapplication.app.modules.balancemoreone.ui

import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityBalanceMoreOneBinding
import com.toylysapplication.app.modules.balancemoreone.`data`.viewmodel.BalanceMoreOneVM
import com.toylysapplication.app.modules.qr.ui.QrActivity
import kotlin.String
import kotlin.Unit

class BalanceMoreOneActivity :
    BaseActivity<ActivityBalanceMoreOneBinding>(R.layout.activity_balance_more_one) {
  private val viewModel: BalanceMoreOneVM by viewModels<BalanceMoreOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.balanceMoreOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearTopUpsu.setOnClickListener {
      val destIntent = QrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnOk.setOnClickListener {
      val destIntent = QrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BALANCE_MORE_ONE_ACTIVITY"

  }
}
