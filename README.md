# Gradle HelloWorld Example

### System Requirements

JDK 7 or Higher

On macOS, Xcode is needed to build.

On Ubuntu 16.04 (64-bit), install following build tools

```
apt install git
apt install g++
apt install libcap-dev
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

To build and execute native console executable, Natie binary will be in `bin` directory.

```
./gradlew launchConsole
```