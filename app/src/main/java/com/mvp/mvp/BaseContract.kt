package com.mvp.mvp

class BaseContract {
    interface Presenter<in T> {
        fun detachView()
        fun attachView(view: T)
    }

    interface View {}
}