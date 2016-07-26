FROM postgres:9.6

COPY docker-entrypoint-initdb.d/init-user-db.sh /docker-entrypoint-initdb.d/init-user-db.sh
RUN chmod 777 /docker-entrypoint-initdb.d/init-user-db.sh

#COPY docker-entrypoint-initdb.d/z-create.sql /docker-entrypoint-initdb.d/z-create.sql

RUN localedef -i en_US -c -f UTF-8 -A /usr/share/locale/locale.alias en_US.UTF-8
ENV LANG en_US.utf8

