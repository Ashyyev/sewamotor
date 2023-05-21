package com.toylysapplication.app.modules.home.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHello: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToyly: String? = MyApp.getInstance().resources.getString(R.string.lbl_toyly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoPremium: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_premium)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpgradetoprem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upgrade_to_prem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtX: String? = MyApp.getInstance().resources.getString(R.string.lbl_x)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtXOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_x)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtO: String? = MyApp.getInstance().resources.getString(R.string.lbl_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeature: String? = MyApp.getInstance().resources.getString(R.string.lbl_feature)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentSuccess: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpecialPromo: String? = MyApp.getInstance().resources.getString(R.string.lbl_special_promo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewall: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)

)
