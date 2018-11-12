# From java image, version : 8
FROM java

# 挂载app目录
VOLUME /tmp

# COPY or ADD to image
ADD app.jar app.jar

RUN bash -c "touch /app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]