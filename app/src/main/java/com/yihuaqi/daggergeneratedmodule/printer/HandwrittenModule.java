package com.yihuaqi.daggergeneratedmodule.printer;

import com.yihuaqi.daggergeneratedmodule.printer.impl.PrinterImplModule;

import dagger.Module;

@Module(
        includes = { PrinterImplModule.class }
)
public class HandwrittenModule {
}
