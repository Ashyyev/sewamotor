package com.toylysapplication.app.modules.first.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.toylysapplication.app.databinding.SlideritemFirst1Binding
import com.toylysapplication.app.modules.first.`data`.model.ImageSliderSliderwelcomeModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderwelcomeAdapter(
  val dataList: ArrayList<ImageSliderSliderwelcomeModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderwelcomeModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemFirst1Binding) {
      binding.imageSliderSliderwelcomeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemFirst1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
