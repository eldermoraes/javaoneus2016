FROM java:8-jdk
MAINTAINER Dave Henderson <dhenderson@gmail.com>

ARG GRADLE_VERSION=2.6

WORKDIR /usr/bin
RUN curl -sLO https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-all.zip && \
    unzip gradle-${GRADLE_VERSION}-all.zip && \
    ln -s gradle-${GRADLE_VERSION} gradle && \
    rm gradle-${GRADLE_VERSION}-all.zip

ENV GRADLE_HOME /usr/bin/gradle
ENV PATH $PATH:$GRADLE_HOME/bin

RUN mkdir /app
WORKDIR /app

RUN apt-get -qq update && apt-get install -yqq git && \
    cd /app && git clone https://github.com/eldermoraes/javaoneus2016.git && \
    cd javaoneus2016/app/javaonedb

COPY start.sh /start.sh
RUN chmod +x /start.sh
ENTRYPOINT [ "/start.sh" ]
CMD [ "-version" ]
