# Używamy obrazu JDK jako bazowego
FROM openjdk:21-jdk

# Ustawiamy zmienną środowiskową dla pliku JAR
ARG JAR_FILE=target/TrekRent-0.0.1.jar

# Ustawiamy katalog roboczy w kontenerze
WORKDIR /app

# Kopiujemy plik JAR do kontenera
COPY ${JAR_FILE} app.jar

# Ustawiamy port, który aplikacja będzie nasłuchiwać (np. 8080 dla Spring Boot)
EXPOSE 8080

# Komenda uruchamiająca aplikację
ENTRYPOINT ["java", "-jar", "app.jar"]
