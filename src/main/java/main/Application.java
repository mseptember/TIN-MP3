package main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    CommandLineRunner init(ObuwieRepository obuwieRepository) {
        //AtomicInteger id = new AtomicInteger();
        return args -> {
            Stream.of("Adidas", "Nike", "Puma", "Vans", "Buffalo").forEach(marka -> {
                Obuwie obuwie = new Obuwie(marka, (int) (Math.random()*(50-35))+35, "Skóra", (double) (Math.random()*(400-100))+100);
                obuwieRepository.save(obuwie);
            });
            obuwieRepository.findAll().forEach(System.out::println);
        };
    }*/
}
