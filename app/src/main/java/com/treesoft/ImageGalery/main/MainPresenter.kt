package com.treesoft.ImageGalery.main

class MainPresenter {
    private var view: MainView? = null

    fun attach(view: MainView) {
        this.view = view
    }

    fun detach() {
        this.view = null
    }
}