package com.toylysapplication.app.modules.transaction.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TransactionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionDet: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_det)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt17Agustus2022: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_17_agustus_2022)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorHondaDel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_motor_honda_del)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100000: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100000One: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCredit: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt100000Two: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt843000: String? = MyApp.getInstance().resources.getString(R.string.lbl_843_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_need_pri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt265614813719328: String? =
      MyApp.getInstance().resources.getString(R.string.msg_265614813719328)

)
