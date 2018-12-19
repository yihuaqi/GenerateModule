package com.yihuaqi.daggergeneratedmodule.printer.impl

import com.yihuaqi.daggergeneratedmodule.printer.IPrinter
import dagger.Binds
import dagger.Module

@Module
abstract class PrinterImplModule {
    @Binds abstract fun bindPrinter(printer: PrinterImpl): IPrinter
}