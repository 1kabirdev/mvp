package com.mvp.main_impl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.mvp.R

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter()
        presenter.attachView(this)
        presenter.loginUser("kabir@gmail.com", "123456789")
    }

    override fun loadData(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun error(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }
}