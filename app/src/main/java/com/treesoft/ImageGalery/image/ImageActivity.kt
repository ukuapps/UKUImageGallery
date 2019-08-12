package com.treesoft.ImageGalery.image

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.treesoft.ImageGalery.R

class ImageActivity : AppCompatActivity() , ImageView{

    var presenter = ImagePresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
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
