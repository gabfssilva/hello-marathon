FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD hello-marathon-all.jar hello-marathon-all.jar
RUN sh -c 'touch /hello-marathon-all.jar'
ENTRYPOINT ["java", "-jar", "hello-marathon-all.jar"]
EXPOSE 4567
