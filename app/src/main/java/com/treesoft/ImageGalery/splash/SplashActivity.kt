package com.treesoft.ImageGalery.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.treesoft.ImageGalery.R
import com.treesoft.ImageGalery.Splash.SplashView

class SplashActivity : AppCompatActivity(), SplashView {

    var presenter = SplashPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    //**************** LiveCicle *******************
    override fun onStart() {
        super.onStart()
        presenter.attach(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.detach()
    }
}
