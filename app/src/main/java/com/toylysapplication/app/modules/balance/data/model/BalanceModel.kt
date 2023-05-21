package com.toylysapplication.app.modules.balance.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BalanceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt843000: String? = MyApp.getInstance().resources.getString(R.string.lbl_843_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRentHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_rent_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1009221010: String? = MyApp.getInstance().resources.getString(R.string.msg_10_09_22_10_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSewa: String? = MyApp.getInstance().resources.getString(R.string.lbl_sewa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100000: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0401230402: String? = MyApp.getInstance().resources.getString(R.string.msg_04_01_23_04_02)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSewaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sewa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100000One: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_000)

)
