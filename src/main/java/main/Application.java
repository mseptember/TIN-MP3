package main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(ObuwieRepository obuwieRepository, KlientRepository klientRepository, ZamowienieRepository zamowienieRepository) {
        //AtomicInteger id = new AtomicInteger();
        return args -> {
            Stream.of("Adidas", "Nike", "Puma", "Vans", "Buffalo").forEach(marka -> {
                Obuwie obuwie = new Obuwie(marka, randomSize(), "Skóra", round((Math.random()*(400-100))+100, 2));//(int) (Math.random()*(400-100))+100); //new DecimalFormat("#.##").format(dblVar);
                obuwieRepository.save(obuwie);
            });
            obuwieRepository.findAll().forEach(System.out::println);

            Stream.of("Janusz").forEach(imie -> {
                Klient klient = new Klient(imie, "Frugo", imie.toLowerCase() +"@domain.com", "frugo", "123456789", "Frugo 53c", "Warszawa", "69-420");
                klientRepository.save(klient);
            });
            klientRepository.findAll().forEach(System.out::println);

            Stream.of(1).forEach(nrZamowienia -> {
                Zamowienie zamowienie = new Zamowienie(nrZamowienia, new Date(), 500);
                zamowienieRepository.save(zamowienie);
            });
            zamowienieRepository.findAll().forEach(System.out::println);
        };
    }

    private static double round(double value, int places) { // metoda ze StackOverflow do wycinania miejsc po przecinku w double (dla ceny produktu)
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    private static String randomSize() {
        Random r = new Random();
        int[] twoRandomNumbers = r.ints(2, 34, 51).toArray();
        Arrays.sort(twoRandomNumbers);
        //int randomNumber = r.ints(1, 0, 11).findFirst().getAsInt(); //pojedynczy random
        if (twoRandomNumbers[0] == twoRandomNumbers[1]) {
            twoRandomNumbers[1]+=3;
        }

        return twoRandomNumbers[0] + "-" + twoRandomNumbers[1];
    }
}
