package com.toylysapplication.app.modules.qr.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityQrBinding
import com.toylysapplication.app.modules.home.ui.HomeActivity
import com.toylysapplication.app.modules.qr.`data`.viewmodel.QrVM
import com.toylysapplication.app.modules.transaction.ui.TransactionActivity
import kotlin.String
import kotlin.Unit

class QrActivity : BaseActivity<ActivityQrBinding>(R.layout.activity_qr) {
  private val viewModel: QrVM by viewModels<QrVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.qrVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePngItem1747424.setOnClickListener {
      val destIntent = TransactionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameButtonnavigati.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "QR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QrActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
