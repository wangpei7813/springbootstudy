# From java image, version : 8
FROM java

# 挂载app目录
VOLUME /tmp

# COPY or ADD to image
COPY . /

RUN bash -c "touch /app.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]