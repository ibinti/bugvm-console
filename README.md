# Gradle HelloWorld Example

To run HelloWorld Java Example with Systtem JRE
Change mainClassName in build.gradle to "FireJava", and then
./gradlew run

To run HelloWorld Groovy Example with Systtem JRE
Change mainClassName in build.gradle to "FireGroovy", and then
./gradlew run

To run HelloWorld Scala Example with Systtem JRE
Change mainClassName in build.gradle to "FireScala", and then
./gradlew run

# BugVM Compiling
This example assumes that BugVM 1.1.19-SNAPSHOT is installed and Environment set as in https://bugvm.com/helloworld-console-app/. 1.2.*-SNAPSHOT may not work due to some known issues that have not been resolved yet.

Compile the Java Example with BugVM and then run the native console executable

To execute native console executable for Java Example
./gradlew runJava

To execute native console executable for Scala Example
./gradlew runScala
