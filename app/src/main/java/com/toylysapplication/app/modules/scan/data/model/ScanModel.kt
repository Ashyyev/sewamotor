package com.toylysapplication.app.modules.scan.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBye: String? = MyApp.getInstance().resources.getString(R.string.lbl_bye)

)
