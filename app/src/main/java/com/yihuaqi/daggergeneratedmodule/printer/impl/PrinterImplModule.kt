package com.yihuaqi.daggergeneratedmodule.printer.impl

import com.yihuaqi.daggergeneratedmodule.printer.IPrinter
import com.yihuaqi.module_core.ModuleImpl
import dagger.Binds
import dagger.Module

@Module
@ModuleImpl(className = "Printer")
abstract class PrinterImplModule {
    @Binds abstract fun bindPrinter(printer: PrinterImpl): IPrinter
}