package com.toylysapplication.app.modules.registorlogin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityRegistOrLoginBinding
import com.toylysapplication.app.modules.otp.ui.OtpActivity
import com.toylysapplication.app.modules.registorlogin.`data`.viewmodel.RegistOrLoginVM
import kotlin.String
import kotlin.Unit

class RegistOrLoginActivity :
    BaseActivity<ActivityRegistOrLoginBinding>(R.layout.activity_regist_or_login) {
  private val viewModel: RegistOrLoginVM by viewModels<RegistOrLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registOrLoginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = OtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGIST_OR_LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistOrLoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
