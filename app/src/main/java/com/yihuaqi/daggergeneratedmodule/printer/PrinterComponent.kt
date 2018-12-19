package com.yihuaqi.daggergeneratedmodule.printer

import dagger.Component

@Component(modules = [(HandwrittenModule::class)])
interface PrinterComponent {
    fun printer(): IPrinter
}