package com.zhy.lifecycle.presenter

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import com.zhy.lifecycle.base.BasePresenter
import com.zhy.lifecycle.domain.Goods
import com.zhy.lifecycle.model.GoodsModel
import com.zhy.lifecycle.model.OnLoadListener
import com.zhy.lifecycle.view.IGoodsView

class GoodsPresenter<T : IGoodsView> : BasePresenter<T>() {

    private val tag = "mactty"
    private val iGoodsModel = GoodsModel()


    fun fetch() {
        iGoodsModel.loadGoodsData(object : OnLoadListener {
            override fun onComplete(goods: MutableList<Goods>) {
                (iGoodsView?.get() as IGoodsView).showGoodsView(goods)
            }

            override fun onError(msg: String) {
            }

        })
    }

    override fun onCreateX(owner: LifecycleOwner) {
        super.onCreateX(owner)
        Log.d(tag, "create")
    }

    override fun onDestroyX(owner: LifecycleOwner) {
        super.onDestroyX(owner)
        Log.d(tag, "destroy")
    }

}