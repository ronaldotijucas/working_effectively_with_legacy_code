FROM java:8-jdk

RUN mkdir -p /data/app
WORKDIR /data/app

RUN \
    cd /usr/local && \
    curl -L https://services.gradle.org/distributions/gradle-4.6-bin.zip -o gradle-4.6-bin.zip && \
    unzip gradle-4.6-bin.zip && \
    rm gradle-4.6-bin.zip

ENV GRADLE_HOME=/usr/local/gradle-4.6
ENV PATH=$PATH:$GRADLE_HOME/bin
