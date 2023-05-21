package com.toylysapplication.app.modules.balancemore.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityBalanceMoreBinding
import com.toylysapplication.app.modules.balancemore.`data`.viewmodel.BalanceMoreVM
import com.toylysapplication.app.modules.qr.ui.QrActivity
import kotlin.String
import kotlin.Unit

class BalanceMoreActivity : BaseActivity<ActivityBalanceMoreBinding>(R.layout.activity_balance_more)
    {
  private val viewModel: BalanceMoreVM by viewModels<BalanceMoreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.balanceMoreVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.framePict.setOnClickListener {
      val destIntent = QrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCard.setOnClickListener {
      val destIntent = QrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BALANCE_MORE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BalanceMoreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
