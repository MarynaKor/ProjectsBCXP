FROM postgres:16

COPY data.sql /docker-entrypoint-initdb.d/

ENV POSTGRES_DB projects
ENV POSTGRES_USER project
ENV POSTGRES_PASSWORD secret