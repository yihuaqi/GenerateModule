package com.yihuaqi.daggergeneratedmodule.printer

import com.yihuaqi.GeneratedModule
import dagger.Component

@Component(modules = [(GeneratedModule::class)])
interface PrinterComponent {
    fun printer(): IPrinter
}