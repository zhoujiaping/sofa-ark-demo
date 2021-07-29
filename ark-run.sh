# install org.sirenia:myjar:1.0.1-SNAPSHOT
cd ./myjar
cat ./src/main/resources/HiUtil-v1.txt > ./src/main/java/org/sirenia/util/HiUtil.java
cat ./pom-v1.xml.txt > ./pom.xml
mvn clean install

# install org.sirenia:myjar:1.0.2-SNAPSHOT
cd ./myjar
cat ./src/main/resources/HiUtil-v2.txt > ./src/main/java/org/sirenia/util/HiUtil.java
cat ./pom-v2.xml.txt > ./pom.xml
mvn clean install

# install springboot-apps
cd ./springboot-apps
mvn clean install -U

# install arks and package ark-run
cd ../arks/app1-ark
mvn clean install -U

cd ../app2-ark
mvn clean install -U

cd ../ark-run
mvn clean package -U
# run jar
java -jar ./target/ark-run-1.0-SNAPSHOT-executable-ark.jar