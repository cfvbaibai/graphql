plugins {
    id("org.springframework.boot") version "2.4.0"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

group = "com.graphql-java.tutorial"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.graphql-java:graphql-java:11.0")
    implementation("com.graphql-java:graphql-java-spring-boot-starter-webmvc:1.0")
    implementation("com.google.guava:guava:26.0-jre")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
