package com.toylysapplication.app.modules.homeone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityHomeOneBinding
import com.toylysapplication.app.modules.account.ui.AccountActivity
import com.toylysapplication.app.modules.game.ui.GameActivity
import com.toylysapplication.app.modules.homeone.`data`.model.HomeOneRowModel
import com.toylysapplication.app.modules.homeone.`data`.viewmodel.HomeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeOneActivity : BaseActivity<ActivityHomeOneBinding>(R.layout.activity_home_one) {
  private val viewModel: HomeOneVM by viewModels<HomeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeOneAdapter = HomeOneAdapter(viewModel.homeOneList.value?:mutableListOf())
    binding.recyclerHomeOne.adapter = homeOneAdapter
    homeOneAdapter.setOnItemClickListener(
    object : HomeOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeOneRowModel) {
        onClickRecyclerHomeOne(view, position, item)
      }
    }
    )
    viewModel.homeOneList.observe(this) {
      homeOneAdapter.updateData(it)
    }
    binding.homeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageDownloadOne.setOnClickListener {
      val destIntent = GameActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIGPOSTPROMO.setOnClickListener {
      val destIntent = GameActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFrameThree.setOnClickListener {
      val destIntent = AccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHomeOne(
    view: View,
    position: Int,
    item: HomeOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
