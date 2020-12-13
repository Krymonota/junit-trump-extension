# JUnit Trump Extension ![Build Status](https://github.com/Krymonota/junit-trump-extension/workflows/tests/badge.svg) [![License](https://img.shields.io/github/license/Krymonota/junit-trump-extension.svg?style=flat-square)](https://github.com/Krymonota/junit-trump-extension/blob/master/LICENSE) 
This extension for JUnit 5 acts like there are no tests, because if you don't have any, they can't fail, right?

Sample JUnit Results (no matter how many tests you've developed!):
`Tests run: 0, Failures: 0, Errors: 0, Skipped: 0`

## Adding the dependency to your project
<details>
  <summary>As Maven dependency</summary>

```xml
<repositories>
    <repository>
        <id>junit-trump-extension</id>
        <url>https://mymavenrepo.com/repo/v3i97KuHAZF1V0yF9mn0/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>id.niklas</groupId>
        <artifactId>junit-trump-extension</artifactId>
        <version>1.0.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
</details>
<details>
  <summary>As Gradle dependency</summary>

```gradle
allprojects {
    repositories {
        maven { url 'https://mymavenrepo.com/repo/v3i97KuHAZF1V0yF9mn0/' }
    }
}

dependencies {
    testImplementation 'id.niklas:junit-trump-extension:1.0.0'
}
```
</details>
<details>
  <summary>As SBT dependency</summary>

```scala
resolvers += "junit-trump-extension" at "https://mymavenrepo.com/repo/v3i97KuHAZF1V0yF9mn0"

libraryDependencies += "id.niklas" % "junit-trump-extension" % "1.0.0" % "test"
```
</details>

## Registering the JUnit extension
There are three ways to register this JUnit extension:
1. Enable automatic detection extension by setting the system property `junit.jupiter.extensions.autodetection.enabled=true` (either in your `pom.xml` or as a VM option).<br>
Then add a [`/META-INF/services/org.junit.jupiter.api.extension.Extension`](https://github.com/Krymonota/junit-trump-extension/blob/master/src/test/resources/META-INF/services/org.junit.jupiter.api.extension.Extension) file and specify `id.niklas.junit_trump_extension.JUnitTrumpExtension` as its sole content.
2. Register the extension declaratively by annotating test classes with `@ExtendWith(JUnitTrumpExtension.class)`.
3. Register the extension programmatically by adding a static field to your test classes:<br>
`@RegisterExtension`<br>
`static JUnitTrumpExtension trumpExtension = new JUnitTrumpExtension();`

Check out the [`src/test` directory](https://github.com/Krymonota/junit-trump-extension/blob/master/src/test/) to see an example.

## Credits
This project was inspired by [icanhazstring/phpunit-trump-extension](https://github.com/icanhazstring/phpunit-trump-extension) who originally had the idea to provide a PHPUnit Trump Extension.

## License
This project is licensed under the MIT License. See the [LICENSE](https://github.com/Krymonota/junit-trump-extension/blob/master/LICENSE) file for details.