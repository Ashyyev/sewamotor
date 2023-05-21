package com.toylysapplication.app.modules.game.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityGameBinding
import com.toylysapplication.app.modules.balancemore.ui.BalanceMoreActivity
import com.toylysapplication.app.modules.game.`data`.viewmodel.GameVM
import com.toylysapplication.app.modules.homeone.ui.HomeOneActivity
import kotlin.String
import kotlin.Unit

class GameActivity : BaseActivity<ActivityGameBinding>(R.layout.activity_game) {
  private val viewModel: GameVM by viewModels<GameVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gameVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHondascoopymo.setOnClickListener {
      val destIntent = BalanceMoreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnfavorite.setOnClickListener {
      val destIntent = BalanceMoreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBack.setOnClickListener {
      val destIntent = HomeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "GAME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GameActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
