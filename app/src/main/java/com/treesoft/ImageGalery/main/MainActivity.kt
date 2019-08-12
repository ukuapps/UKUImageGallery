package com.treesoft.ImageGalery.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.treesoft.ImageGalery.R

class MainActivity : AppCompatActivity() , MainView{

    var presenter = MainPresenter()

    override fun showError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
