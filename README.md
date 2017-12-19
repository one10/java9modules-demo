# java9modules-demo
A simple boilerplate project that combines Java 9 modules, gradle, IntelliJ settings and unit tests

# How to run
* Install JDK 9 and gradle
* Clone this project, run ```gradle idea```, open project in IntelliJ
    * Note: "calling gradle idea and using IDEA's importer are mutually exclusive" - if you run ```gradle idea```, then don't use IntelliJ gradle importer
        * https://github.com/gradle/gradle/issues/2813
* Take a look at the file structure: ```tree .```

# Notes
* > To use Java 9 modularity, each Java 9 module needs to correspond to an IntelliJ IDEA module.
    * https://blog.jetbrains.com/idea/2017/03/support-for-java-9-modules-in-intellij-idea-2017-1/

* Jigsaw/Java 9 modules hello world:
    * http://openjdk.java.net/projects/jigsaw/quick-start

* Project structure with multiple modules and unit tests:
    * https://blog.senacor.com/unit-testing-with-java-9-jigsaw-and-junit/

* Gradle and Java 9 modules:
    * https://guides.gradle.org/building-java-9-modules/
    
* Switching between Java versions:
```
alias j9="export JAVA_HOME=`/usr/libexec/java_home -v 9`; java -version"
alias j8="export JAVA_HOME=`/usr/libexec/java_home -v 1.8`; java -version"
```
