package com.toylysapplication.app.modules.account.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToyly: String? = MyApp.getInstance().resources.getString(R.string.lbl_toyly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtrpCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_843_000_rp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtrpCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_843_000_rp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQRCodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_qr_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBarcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_barcode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFingerprint: String? = MyApp.getInstance().resources.getString(R.string.lbl_fingerprint)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMail: String? = MyApp.getInstance().resources.getString(R.string.lbl_mail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_toylyashyyev_gm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)

)
