package com.toylysapplication.app.modules.game.`data`.model

import com.toylysapplication.app.R
import com.toylysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GameModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMotor: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseYourMot: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_mot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFavorite: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotorEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_motor_8)

)
