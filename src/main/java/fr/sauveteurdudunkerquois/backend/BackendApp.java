package fr.sauveteurdudunkerquois.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"fr.sauveteurdudunkerquois.backend.app.BackendRepository"})
public class BackendApp {
    public static void main(String[] args) {
        SpringApplication.run(BackendApp.class, args);
    }
}
