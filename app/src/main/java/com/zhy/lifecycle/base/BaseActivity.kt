package com.zhy.lifecycle.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<T : BasePresenter<V>, V : IBaseView> : AppCompatActivity() {

    lateinit var presenter: T

    @Suppress("UNCHECKED_CAST")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
        presenter.attachView(this as V)

        registerSDK()
        init()
    }

    abstract fun createPresenter(): T


    protected open fun init() {}
    protected open fun registerSDK() {}
    protected open fun unRegisterSDK() {}

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
        unRegisterSDK()
    }
}