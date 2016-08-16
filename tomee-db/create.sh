docker create --name hostdb1 -p 8080:8080 --link postgresdb:postgresdb --link cassandradb:cassandradb tomee-db
docker create --name hostdb2 -p 8081:8080 --link postgresdb:postgresdb --link cassandradb:cassandradb tomee-db
docker create --name hostdb3 -p 8082:8080 --link postgresdb:postgresdb --link cassandradb:cassandradb tomee-db
docker create --name loadbalancerdb -p 80:80 --link hostdb1:hostdb1 --link hostdb2:hostdb2 --link hostdb3:hostdb3 --env-file ./env-load.list jasonwyatt/nginx-loadbalancer
