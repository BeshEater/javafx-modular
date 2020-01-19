package com.besheater.javafxmodular;

/**
 * Workaround for creating uber-jar file
 * https://stackoverflow.com/questions/52653836/maven-shade-javafx-runtime-components-are-missing
 * Code from sample repo
 * https://github.com/openjfx/samples/tree/master/CommandLine/Non-modular/Maven
 */

public class Launcher {

    public static void main(String[] args) {
        App.main(args);
    }
}
