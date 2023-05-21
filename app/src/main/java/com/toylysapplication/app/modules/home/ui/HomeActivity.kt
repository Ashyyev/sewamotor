package com.toylysapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityHomeBinding
import com.toylysapplication.app.modules.home.`data`.model.MenubuttonRowModel
import com.toylysapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.toylysapplication.app.modules.transaction.ui.TransactionActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val menubuttonAdapter = MenubuttonAdapter(viewModel.menubuttonList.value?:mutableListOf())
    binding.recyclerMenubutton.adapter = menubuttonAdapter
    menubuttonAdapter.setOnItemClickListener(
    object : MenubuttonAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MenubuttonRowModel) {
        onClickRecyclerMenubutton(view, position, item)
      }
    }
    )
    viewModel.menubuttonList.observe(this) {
      menubuttonAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnOk.setOnClickListener {
      val destIntent = TransactionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTopUpsu.setOnClickListener {
      val destIntent = TransactionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerMenubutton(
    view: View,
    position: Int,
    item: MenubuttonRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
