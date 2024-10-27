plugins {
    id("java")
    id("org.springframework.boot") version "3.3.5" // ability to run spring project from gradle
    id("io.spring.dependency-management") version "1.1.6" // возможность не писаать версии в dependency
    id("org.flywaydb.flyway") version "6.4.3"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql")
    implementation("org.flywaydb:flyway-database-postgresql:10.20.1")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}