# java9modules-demo
A simple boilerplate project that combines Java 9 modules, gradle, IntelliJ settings and tests

# Notes
* > To use Java 9 modularity, each Java 9 module needs to correspond to an IntelliJ IDEA module.
    * https://blog.jetbrains.com/idea/2017/03/support-for-java-9-modules-in-intellij-idea-2017-1/

* Java 9 modules hello world:
    * http://openjdk.java.net/projects/jigsaw/quick-start

* Project structure with multiple modules and unit tests:
    * https://blog.senacor.com/unit-testing-with-java-9-jigsaw-and-junit/

* Switching between Java versions:
```
alias j9="export JAVA_HOME=`/usr/libexec/java_home -v 9`; java -version"
alias j8="export JAVA_HOME=`/usr/libexec/java_home -v 1.8`; java -version"
```