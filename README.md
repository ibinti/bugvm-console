# Gradle HelloWorld Example

### System Requirements

JDK 7 or Higher

On macOS, Xcode is needed to build.

On Ubuntu 16.04 (64-bit), install following minimum build tools

```
apt install git
apt install g++
apt install libcap-dev
```

You may need following build tools depending on your Ubuntu.
 
 ```
 apt install git
 apt install cmake
 apt install g++
 apt install libcap-dev
 apt install zlib1g-dev
 apt install openjdk-8-jdk
 apt install g++-multilib
 apt install gcc-multilib
 apt install libxml2-dev
 ```


### Example

```
git clone https://github.com/bugvm/bugvm-helloworld
cd bugvm-helloworld
```

To run the app

```
./gradlew run
```

To build and execute native console executable.

```
./gradlew launchConsole
```