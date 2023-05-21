package com.toylysapplication.app.modules.homeone.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTranfer: String? = MyApp.getInstance().resources.getString(R.string.lbl_tranfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInternet: String? = MyApp.getInstance().resources.getString(R.string.lbl_internet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWallet: String? = MyApp.getInstance().resources.getString(R.string.lbl_wallet)

)
