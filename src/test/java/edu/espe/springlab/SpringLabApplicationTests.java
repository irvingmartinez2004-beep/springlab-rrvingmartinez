package edu.espe.springlab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.profiles.active=test")
class SpringLabApplicationTests {

    @Test
    void contextLoads() {
    }
}
