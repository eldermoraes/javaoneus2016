FROM andretadeu/jenkins-slave
MAINTAINER "Andre Tadeu de Carvalho <andre.tadeu.de.carvalho@gmail.com>"

ARG GRADLE_VERSION=2.6

RUN apt-get -qq update && \
DEBIAN_FRONTEND="noninteractive" apt-get install -yqq --no-install-recommends apt-utils curl unzip git

WORKDIR /usr/bin
RUN curl -sLO https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-all.zip && \
    unzip gradle-${GRADLE_VERSION}-all.zip && \
    ln -s gradle-${GRADLE_VERSION} gradle && \
    rm gradle-${GRADLE_VERSION}-all.zip

ENV GRADLE_HOME /usr/bin/gradle
ENV PATH $PATH:$GRADLE_HOME/bin

RUN mkdir /app
WORKDIR /app

CMD [ "gradle", "-version" ]
