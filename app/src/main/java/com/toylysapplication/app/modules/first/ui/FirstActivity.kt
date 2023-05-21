package com.toylysapplication.app.modules.first.ui

import android.net.Uri
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.base.BaseActivity
import com.toylysapplication.app.databinding.ActivityFirstBinding
import com.toylysapplication.app.modules.first.`data`.model.ImageSliderSliderwelcomeModel
import com.toylysapplication.app.modules.first.`data`.viewmodel.FirstVM
import com.toylysapplication.app.modules.registorlogin.ui.RegistOrLoginActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class FirstActivity : BaseActivity<ActivityFirstBinding>(R.layout.activity_first) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.toylysapplication.app/drawable/img_illustrationfi")


  private val imageSliderSliderwelcomeItems: ArrayList<ImageSliderSliderwelcomeModel> =
      arrayListOf(ImageSliderSliderwelcomeModel(imageIllustrationFi =
  imageUri.toString()),ImageSliderSliderwelcomeModel(imageIllustrationFi =
  imageUri.toString()))


  private val viewModel: FirstVM by viewModels<FirstVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderwelcomeAdapter = SliderwelcomeAdapter(imageSliderSliderwelcomeItems,true)
    binding.imageSliderSliderwelcome.adapter = sliderwelcomeAdapter
    binding.imageSliderSliderwelcome.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorCheckmark.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorCheckmark.updateIndicatorCounts(binding.imageSliderSliderwelcome.indicatorCount)
    binding.firstVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = RegistOrLoginActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun onPause(): Unit {
      binding.imageSliderSliderwelcome.pauseAutoScroll()
      super.onPause()
    }

    override fun onResume(): Unit {
      super.onResume()
      binding.imageSliderSliderwelcome.resumeAutoScroll()
    }

    override fun setUpClicks(): Unit {
      binding.btnGetStarted.setOnClickListener {
        val destIntent = RegistOrLoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "FIRST_ACTIVITY"

    }
  }
