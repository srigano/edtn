FROM quay.io/quarkus/quarkus-micro-image:1.0

USER root:root
COPY target/*-runner /app/edtn
RUN chmod 775 /app
WORKDIR /app
RUN ls -altr /app/*
#on demarre le binaire
ENTRYPOINT ["/app/edtn"]
