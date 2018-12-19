package com.yihuaqi.daggergeneratedmodule

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yihuaqi.daggergeneratedmodule.printer.DaggerPrinterComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerPrinterComponent.create().printer().print()
    }
}
