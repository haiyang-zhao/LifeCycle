package com.zhy.lifecycle.model

import com.zhy.lifecycle.R
import com.zhy.lifecycle.domain.Goods


class GoodsModel : IGoodsModel {
    override fun loadGoodsData(onLoadListener: OnLoadListener) {
        onLoadListener.onComplete(getData())
    }


    private fun getData(): MutableList<Goods> {
        //这里的数据来源于网络或数据库或其它地方
        val data: MutableList<Goods> =
            mutableListOf(
                Goods(R.drawable.s1, "一星", "****"),
                Goods(R.drawable.s2, "一星", "****"),
                Goods(R.drawable.s3, "一星", "****"),
                Goods(R.drawable.s4, "一星", "****"),
                Goods(R.drawable.s5, "一星", "****"),
                Goods(R.drawable.s6, "一星", "****"),
                Goods(R.drawable.s7, "一星", "****"),
                Goods(R.drawable.s8, "一星", "****"),
                Goods(R.drawable.s9, "一星", "****"),
            )
        data.add(Goods(R.drawable.s9, "一星", "****"))

        //发送消息
//        LiveDataBus.getInstance().with("list", ArrayList::class.java).postValue(data)
        return data
    }
}