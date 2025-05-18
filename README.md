## this is a simple app for practicing spring-bootstrap

this app when launched can : 
- display hello-world by calling : 
```
http://localhost:8080/hello-world
```

- return a Student Object by calling : 
```
http://localhost:8080/student
```

- return a Employee object by calling : 
```
http://localhost:8080/hello-world
```

## to build and run the app : 
#### pre-requisites : 
- java jdk/jvm
- spring/spring-boot
- maven

#### to install each one if you dont have it : 
- to install java on linux run this command :
```
apt install default-jre
```
- to install spring on linux run this command : 
```
apt install spring
```
- to install maven run this command : 
```
apt install maven
```


#### Next to run the app execute these commands in your terminal :
- to build :
```bash
./mvnw clean install
```
- to run it, we use :
``` bash
./mvnw spring-boot:run
```

#### Now you can access the url specified in the beginning of the file to test each call