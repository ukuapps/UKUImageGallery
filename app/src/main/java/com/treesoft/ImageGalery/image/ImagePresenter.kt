package com.treesoft.ImageGalery.image

class ImagePresenter {
    private var view: ImageView? = null

    fun attach(view: ImageView) {
        this.view = view
    }

    fun detach() {
        this.view = null
    }
}