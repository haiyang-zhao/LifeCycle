package com.zhy.lifecycle.model

import com.zhy.lifecycle.domain.Goods

interface IGoodsModel {
    fun loadGoodsData(onLoadListener: OnLoadListener)
}

interface OnLoadListener {
    fun onComplete(goods: MutableList<Goods>)
    fun onError(msg: String)
}