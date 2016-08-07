# qlik/gradle

A Java development image with Gradle and Git installed.

## How to build

The Docker image can be built using the following command

```{bash}
docker build -t <your Docker Hub ID>/gradle-git .
```

where the dot is the current folder, assuming you are running the docker command
from the same folder of the Dockerfile. If you want a specific Gradle version,
build the image with this command instead:

```{bash}
docker build -t <your Docker Hub ID>/gradle-git --build-arg GRADLE_VERSION=<Gradle version> .
```

You can run a Docker container by using the following command:

```{bash}
docker run -d --name <Place a name> <your Docker Hub ID>/gradle-git <gradle tasks>
```

, for example:

```{bash}
docker run -d --name gradle-git johndoe/gradle-git clean build test
```

## License

This image packages [Gradle](https://github.com/gradle/gradle), which is licensed under the [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0) license.
