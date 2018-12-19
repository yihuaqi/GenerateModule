package com.yihuaqi.processor;

import com.google.auto.service.AutoService;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;
import com.yihuaqi.module_core.ModuleImpl;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

import dagger.Module;

@AutoService(Processor.class)
public class DaggerModuleGenerator extends AbstractProcessor {

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        HashSet<String> result = new HashSet<>();
        result.add(ModuleImpl.class.getCanonicalName());
        return result;
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {

        if (roundEnvironment.getElementsAnnotatedWith(ModuleImpl.class).size() == 0) {
            return false;
        }

        Element moduleImpl = (Element) roundEnvironment.getElementsAnnotatedWith(ModuleImpl.class).toArray()[0];

        TypeSpec generatedModule = TypeSpec.classBuilder("GeneratedModule")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(AnnotationSpec.builder(Module.class)
                        .addMember("includes", "{ $T.class }", moduleImpl)
                        .build())
                .build();
        JavaFile moduleFile = JavaFile.builder("com.yihuaqi", generatedModule).build();
        try {
            moduleFile.writeTo(processingEnv.getFiler());
        } catch (IOException e) {
            // ignore
        }
        return false;
    }
}
