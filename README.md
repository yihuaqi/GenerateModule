# GenerateModule
A demo that shows that Module class generated by annotation processor cannot be recognized by dagger.

Implement an annotation processor `DaggerModuleGenerator` to generate a module class automatically.

The generated class GeneratedModule.java is identically to HandwrittenModule.java, but using GeneratedModule.class in PrinterComponent won't compile while changing to HandwrittenModule.class will work.
