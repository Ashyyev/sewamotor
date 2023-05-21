package com.toylysapplication.app.modules.balancemoreone.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BalanceMoreOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMotor: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHargasewa: String? = MyApp.getInstance().resources.getString(R.string.lbl_harga_sewa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHariCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hari)
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
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_minggu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSewaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sewa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt500000: String? = MyApp.getInstance().resources.getString(R.string.lbl_500_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPilihanberhasi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilihan_berhasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_minggu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSewaTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sewa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt900000: String? = MyApp.getInstance().resources.getString(R.string.lbl_900_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBulanCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_bulan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSewaThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_sewa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1500000: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_500_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelvalue: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_bsi_mobile)

)
