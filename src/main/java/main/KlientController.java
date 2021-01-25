package main;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class KlientController {
    private final KlientRepository klientRepository;

    public KlientController(KlientRepository klientRepository) {
        this.klientRepository = klientRepository;
    }

    @GetMapping("/klient")
    public List<Klient> getKlient() {
        return (List<Klient>) klientRepository.findAll();
    }

    @PostMapping("/klient")
    void addKlient(@RequestBody Klient klient) { // PROSTA WALIDACJA PO STRONIE SERWERA
        if(!EmailValidator.getInstance().isValid(klient.getEmail())){ // TODO -> ZROBIONA! WALIDACJA PO STRONIE SERWERA
            return;
        }
        klientRepository.save(klient);
    }
}
