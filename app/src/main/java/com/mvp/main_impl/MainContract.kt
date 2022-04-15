package com.mvp.main_impl

import com.mvp.mvp.BaseContract

interface MainContract {

    interface View : BaseContract.View {
        fun loadData(message: String)
        fun error(message: String)
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun loginUser(email: String, password: String)
    }
}