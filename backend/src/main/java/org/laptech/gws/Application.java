package org.laptech.gws;

import org.laptech.gws.data.Genre;
import org.laptech.gws.data.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

/**
 * @author rlapin on 12/12/16.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer implements CommandLineRunner{
    @Autowired
    GenreRepository repository;
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Genre rockGenre = new Genre();
        rockGenre.setName("Rock");
    }
}
