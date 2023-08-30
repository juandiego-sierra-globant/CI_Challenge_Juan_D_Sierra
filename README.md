# CI_Challenge_Juan_D_Sierra

## Project Description

This project revolves around the utilization of the Main.java code within a Jenkins pipeline. The primary objective is to harness the capabilities of environment variables in the Java code. By seamlessly integrating these variables into the Jenkins pipeline, the project aims to achieve dynamic and automated updates based on the environment variable values.

## How It Works

1. **Code Setup:** The `Main.java` code is crafted to interact with environment variables. The relevant environment variable is employed as a dynamic placeholder. This is an example of the source code:

```java
String variableValue = System.getenv("variableName");
System.out.println("Mensaje con variable de entorno: " + variableValue);

jajaja


