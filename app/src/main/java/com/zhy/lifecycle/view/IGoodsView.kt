package com.zhy.lifecycle.view

import com.zhy.lifecycle.base.IBaseView
import com.zhy.lifecycle.domain.Goods

interface IGoodsView : IBaseView {

    fun showGoodsView(goods: MutableList<Goods>)
}