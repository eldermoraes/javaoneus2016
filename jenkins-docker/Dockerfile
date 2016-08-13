FROM jenkins:latest
MAINTAINER "Andre Tadeu de Carvalho <andre.tadeu.de.carvalho@gmail.com>"

COPY plugins.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt

VOLUME [ "/var/jenkins_home" ]
