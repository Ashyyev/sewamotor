package com.toylysapplication.app.modules.qr.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class QrModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanForPaymen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scan_for_paymen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnotherPayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_another_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBarcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_barcode)

)
