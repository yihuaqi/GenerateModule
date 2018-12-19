package com.yihuaqi.daggergeneratedmodule.printer.impl

import android.util.Log
import com.yihuaqi.daggergeneratedmodule.printer.IPrinter
import javax.inject.Inject

class PrinterImpl @Inject constructor(): IPrinter {
    override fun print() {
        Log.d("printer", "I'm printerImpl")
    }

}