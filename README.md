## JWT Demo
And example Spring Boot application with an API capable of authenticating with JWTs and a front end capable of authenticating against this API.
For motivation and discussion of the code, please see my series of [blog posts](http://sdqali.in/blog/2016/07/02/jwt-authentication-with-spring-web---part-1/).

### Dependencies

* Maven
* Spring Boot
* Spring Security
* [jjwt](jjwt)
* Bower
* Angular JS

### Deploying
* Install front end dependencies using bower
```bash
bower install
```
* Start the application
```bash
mvn spring-boot:run
```

### Authenticating
* Obtain a JWT:
```bash
curl -v -X POST "http://localhost:8080/login" -d '{"username":"greenrabbit948", "password":"celeste"}' --header "Content-Type: application/json"
```
* Authenticating using the obtained JWT:
```bash
curl -s "http://localhost:8080/profile/details/greenrabbit948" --header "Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJncmVlbnJhYmJpdDk0OCIsImV4cCI6MTQ2ODE0MDg1MiwiaXNzIjoiaW4uc2RxYWxpLmp3dCJ9.t9pqrOmYfaVkzuAQgo4D4VbN2PibQuHPuPA6RKYU-keTzbFAX58l77hQTc4Cq28HpjFOeiDvNpNEgilNHFOfVA"
```
