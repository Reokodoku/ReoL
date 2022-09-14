# ReoL

ReoL is a library made for develop easier Minecraft's plugins.

**WARNING**: this library is written with Paper, so you cannot write code with other Minecraft server forks, like Spigot (otherwise he will give you an error).

The version of the library is Paper 1.19.2.

# Implementing ReoL in your plugin

You need to download the JAR file and import it as a dependency.

## Gradle

```kotlin
dependencies {
    implementation(files("ReoL-X.x.jar"))
}
```

## Maven

**WARNING**: this method is deprecated!

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>me.reokodoku</groupId>
      <artifactId>reol</artifactId>
      <version>X.x</version>
      <scope>system</scope>
      <systemPath>${java.home}/lib/ReoL-X-x.jar</systemPath>
    </dependency>
  </dependencies>
</project>
```

You can use this maven command to add the JAR file into your local Maven repository.

```shell
mvn install:install-file \
   -Dfile="ReoL-X-x.jar" \
   -DgroupId="me.reokodoku" \
   -DartifactId="reol" \
   -Dversion="X.x" \
   -Dpackaging="jar" \
   -DgeneratePom=true
```
