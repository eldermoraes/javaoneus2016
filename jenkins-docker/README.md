# jenkins
Docker image of Jenkins with docker-jenkins plugin to be installed in the container start.

## How to build
To build this image, just enter the following command in your terminal:

```{bash}
docker build -t <Your Docker Hub ID>/jenkins-docker .
```

## How to use
To run this image, just enter the following command in your terminal:

```bash
docker run -d --name jenkins -p 8080:8080 -p 50000:50000 <Your Docker Hub ID>/jenkins-docker
```

In case you want to have a persistent $JENKINS_HOME folder in the host, first you
 have to create a folder where the container can write in it (probably you will
have to set it to 0777), and then run the command:

```bash
docker run -d --name jenkins -p 8080:8080 -p 50000:50000 -v <path to your folder with full permissions>:/var/jenkins_home <Your Docker Hub ID>/jenkins-docker
```

If you need further setup, please read the documentation from the Official Docker Jenkins image: https://github.com/jenkinsci/docker
