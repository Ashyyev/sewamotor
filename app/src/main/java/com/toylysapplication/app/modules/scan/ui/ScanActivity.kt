package com.toylysapplication.app.modules.scan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityScanBinding
import com.toylysapplication.app.modules.scan.`data`.viewmodel.ScanVM
import kotlin.String
import kotlin.Unit

class ScanActivity : BaseActivity<ActivityScanBinding>(R.layout.activity_scan) {
  private val viewModel: ScanVM by viewModels<ScanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
