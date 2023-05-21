package com.toylysapplication.app.modules.first.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderwelcomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaricobaaplik: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mari_coba_aplik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageIllustrationFi: String? = ""

)
