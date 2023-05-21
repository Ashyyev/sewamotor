package com.toylysapplication.app.modules.otp.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOTPVerificatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_verificatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseEnterOT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_ot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendOTPAgai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resend_otp_agai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendOTP: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend_otp)

)
