# javafx-modular
Basic javafx modular app example projects.

It can be used to quickly set up a working project structure for a new JavaFX app.

Contains `.fxml` `.css` `.properties` `.png` files sample usage patterns.

Additionaly supports creating runtime image with non modular dependencies using 
[ModiTect](https://github.com/moditect/moditect) and [javafx-maven-plugin](https://github.com/openjfx/javafx-maven-plugin)

### To run app:
```
mvn clean javafx:run
```

### To build cross-platform uder-jar:
```
mvn clean package -P uberjar
```
Produced uber-jar will be located in `/uber-jar` folder

### To build runtime image for current platform:
```
mvn clean compile javafx:jlink
```
Produced runtime image will be located in `/target/app-image` or same but archived in `/target/app-image-archive.zip`
To run runtime image launch `app-image/bin/run-app` file
