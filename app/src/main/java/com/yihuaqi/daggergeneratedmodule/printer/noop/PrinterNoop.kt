package com.yihuaqi.daggergeneratedmodule.printer.noop

import android.util.Log
import com.yihuaqi.daggergeneratedmodule.printer.IPrinter
import javax.inject.Inject

class PrinterNoop @Inject constructor() : IPrinter {
    override fun print() {
        Log.d("Printer", "I'm noop")
    }
}