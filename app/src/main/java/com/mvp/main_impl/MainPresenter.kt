package com.mvp.main_impl

class MainPresenter : MainContract.Presenter {

    private var view: MainContract.View? = null

    override fun loginUser(email: String, password: String) {
        view?.let { mvpView->
            when {
                email.trim().isEmpty() -> {
                    mvpView.error("Incorrect Email")
                }
                password.trim().isEmpty() -> {
                    mvpView.error("Incorrect Password")
                }
                else -> {
                    mvpView.loadData("Login successful")
                }
            }
        }
    }

    override fun detachView() {
        view = null
    }

    override fun attachView(view: MainContract.View) {
        this.view = view
    }
}