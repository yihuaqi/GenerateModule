package com.yihuaqi.daggergeneratedmodule.printer.noop

import com.yihuaqi.daggergeneratedmodule.printer.IPrinter
import dagger.Binds
import dagger.Module

@Module
abstract class PrinterNoopModule {
    @Binds abstract fun bindPrinter(printer: PrinterNoop): IPrinter
}