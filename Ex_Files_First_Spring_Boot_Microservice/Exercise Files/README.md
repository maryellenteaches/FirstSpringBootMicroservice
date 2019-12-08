Spring Boot Microservice

---

# Chater 1: Create a Spring Boot Microsevice

### You can deploy multiple instances from the same jar/war file in the same container/machine via command as below

`java -jar target/explorecali-0.0.1-SNAPSHOT.jar`
Default port is 8080

`java -Dserver.port=9090 -jar target/explorecali-0.0.1-SNAPSHOT.jar`

`java -Dserver.port=8888 -jar target/explorecali-0.0.1-SNAPSHOT.jar`

Quiz:

- The Spring Initializr website https://start.spring.io/ is the only way to create a Spring Boot Project.
  A: False

---

# Chater 2:

Quiz:

- Which method looks up all the tours given a tour package code?
  A: List<Tour> findByTourPackageCode(String code)
- Given the following class declaration and the TourRatingRepository declaration that follows it, what should be substituted for T and ID?

```
@Entity
public class TourRating {
  @Id
  private String id;
  @Column
  private Integer score;
}

public interface TourRatingRepository extends CrudRepository<T, ID> {
}
```

    A:
    T = TourRating
    ID = String

- What is JPA an acronym for?
  A: Java Persistence API

---
