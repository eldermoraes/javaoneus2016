#!/bin/bash

cd /app
if [ -z "$(ls -A)" ]
then
    git clone https://github.com/eldermoraes/javaoneus2016.git
fi
cd javaoneus2016
git pull
cd app/javaonedb

echo $(pwd)
/usr/bin/gradle/bin/gradle "${@:2}"
