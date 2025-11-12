FROM eclipse-temurin:21 as build
COPY . .
RUN ./gradlew build --info

FROM eclipse-temurin:21
COPY --from=build ./build/libs/CarParkAPI-0.0.1-SNAPSHOT.jar ./app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# TODO: add to readme.md commands to build and run container : docker build  -t chrisrossell/car-park-api .,docker run chrisrossell/car-park-api

#TODO: don't copy all files only enough to build project and run tests with gradle
#TODO: the gradle build does have a dependancy and needs a local spinning container database
#TODO: add a docker compose to run the app and a containerised database