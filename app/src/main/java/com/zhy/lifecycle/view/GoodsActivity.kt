package com.zhy.lifecycle.view

import android.os.Bundle
import android.widget.ListView
import com.zhy.lifecycle.R
import com.zhy.lifecycle.adapter.GoodsAdapter
import com.zhy.lifecycle.base.BaseActivity
import com.zhy.lifecycle.domain.Goods
import com.zhy.lifecycle.presenter.GoodsPresenter

class GoodsActivity : BaseActivity<GoodsPresenter<IGoodsView>, IGoodsView>(), IGoodsView {


    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goods)
        listView = findViewById(R.id.listView)
        presenter.attachView(this)
        presenter.fetch()


    }

    override fun init() {
        super.init()
        lifecycle.addObserver(presenter)
    }

    override fun createPresenter(): GoodsPresenter<IGoodsView> {
        return GoodsPresenter()
    }

    override fun showGoodsView(goods: MutableList<Goods>) {
        listView.adapter = GoodsAdapter(this, goods)
    }

    override fun showErrorMessage(msg: String) {
    }
}