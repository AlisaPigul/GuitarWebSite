package org.laptech.gws;

import org.bson.types.ObjectId;
import org.laptech.gws.data.*;
import org.laptech.gws.data.entities.Chords;
import org.laptech.gws.data.entities.Genre;
import org.laptech.gws.data.entities.repository.ChordsRepository;
import org.laptech.gws.data.entities.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rlapin on 12/12/16.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer implements CommandLineRunner{
    @Autowired
    ChordsRepository repository;
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Chords chords = new Chords();

        repository.save(chords);
    }
}
