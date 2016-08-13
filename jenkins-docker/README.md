# jenkins
Docker image of Jenkins with docker-jenkins plugin to be installed in the container start.

## How to build
To build this image, just enter the following command in your shell:

```{bash}
docker build -t <Your Docker Hub ID>/jenkins-docker .
```

## How to use
To run this image, just enter the following command in your shell:

```bash
docker run -d --name jenkins -p 8080:8080 -p 50000:50000 <Your Docker Hub ID>/jenkins-docker
```

If you need further setup, please read the documentation from the Official Docker Jenkins image: https://github.com/jenkinsci/docker
