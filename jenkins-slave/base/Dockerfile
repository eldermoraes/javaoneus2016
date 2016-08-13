FROM debian:jessie
MAINTAINER "Andre Tadeu de Carvalho <andre.tadeu.de.carvalho@gmail.com>"

# Install wget, OpenJDK-8 and OpenSSH
RUN echo 'deb http://httpredir.debian.org/debian jessie-backports main' > \
    /etc/apt/sources.list.d/jessie-backports.list && \
    apt-get -qq update && \
    DEBIAN_FRONTEND="noninteractive" apt-get install -yqq --no-install-recommends \
openjdk-8-jre-headless

# Set user jenkins to the image
RUN useradd -m -d /home/jenkins -s /bin/sh jenkins &&\
    echo "jenkins:jenkins" | chpasswd

# Standard SSH port
EXPOSE 22

# Default command
CMD ["/usr/sbin/sshd", "-D"]
