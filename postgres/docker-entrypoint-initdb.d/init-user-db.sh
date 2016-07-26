#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE SEQUENCE public.SQ_DATA;
    ALTER TABLE SQ_DATA OWNER TO postgres;
    
    CREATE TABLE public.DATA
	(
  		cod_data numeric NOT NULL DEFAULT nextval('SQ_DATA'::regclass),
  		name_data character varying NOT NULL,
  		CONSTRAINT data_pk PRIMARY KEY (cod_data)
	)
	WITH (
  		OIDS=FALSE
	);
	ALTER TABLE DATA OWNER TO postgres;
EOSQL