package dev.ssobue.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Launch Class.
 *
 * @author ssobue
 */
@SpringBootApplication
public class RedisDemoApplication {

    /**
     * Main Method.
     *
     * @param args Command Line Arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApplication.class, args);
    }
}
