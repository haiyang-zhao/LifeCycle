package com.zhy.lifecycle.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import java.lang.ref.WeakReference

open class BasePresenter<in T : IBaseView> : LifecycleObserver {

    var iGoodsView: WeakReference<*>? = null

    fun attachView(view: T) {
        iGoodsView = WeakReference(view)
    }

    fun detachView() {
        iGoodsView?.clear()
        iGoodsView = null
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    open fun onCreateX(owner: LifecycleOwner) {

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    open fun onStartX(owner: LifecycleOwner) {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    open fun onResumeX(owner: LifecycleOwner) {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    open fun onPauseX(owner: LifecycleOwner) {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    open fun onStopX(owner: LifecycleOwner) {

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    open fun onDestroyX(owner: LifecycleOwner) {

    }
}