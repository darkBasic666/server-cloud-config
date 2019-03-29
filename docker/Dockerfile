FROM frolvlad/alpine-oraclejre8:cleaned
ADD cloudConfiguration.jar /
ADD java-entrypoint.sh /java-entrypoint.sh
EXPOSE 8888
ENTRYPOINT ["/java-entrypoint.sh", "/cloudConfiguration.jar"]
