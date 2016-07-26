# JavaOne US 2016

To build our Postgres image (based on [this](postgres/Dockerfile) Dockerfile)

```
docker build -t postgres-javaone .
```

To create and run a new container based on the image created:

```
docker run --name postgresdb -p 5432:5432 postgres-javaone
```

To build our Postgres image (based on [this](tomee-db/Dockerfile) Dockerfile)

```
docker build -t tomee-db --build-arg WAR_FILE=javaonedb.war .
```

To create three new containers basead on the image created and link them to the Postgres container:

```
docker create --name hostdb1 -p 8080:8080 --link postgresdb:postgresdb tomee-db
docker create --name hostdb2 -p 8081:8080 --link postgresdb:postgresdb tomee-db
docker create --name hostdb3 -p 8082:8080 --link postgresdb:postgresdb tomee-db
```

To create a NGINX container (based on [this](tomee-db/env-load.list) env file):

```
docker create --name loadbalancerdb -p 80:80 --link hostdb1:hostdb1 --link hostdb2:hostdb2 --link hostdb3:hostdb3 --env-file ./env-load.list jasonwyatt/nginx-loadbalancer
```

To start all those just created containers:

```
docker start hostdb1
docker start hostdb2
docker start hostdb3
docker start loadbalancerdb
```

Then an application called "javaonedb" will be available to be accessed thru your browser (check "docker-machine ip" command to see the IP that Docker is using).
