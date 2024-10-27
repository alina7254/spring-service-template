package org.ruslan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

// without Gradle:
// javac Main.java -> Main.class - компилирует код в байткод
// java Main - запускает программу

// Gradle
// gradle build
// gradle run

// Gradle with Spring plugin
// gradle bootRun

// Maven
// mvn compile