package com.treesoft.ImageGalery.splash

import com.treesoft.ImageGalery.Splash.SplashView

class SplashPresenter {
    private var view: SplashView? = null

    fun attach(view: SplashView) {
        this.view = view
    }

    fun detach() {
        this.view = null
    }
}