package main;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ZamowienieController {
    private final ZamowienieRepository zamowienieRepository;

    public ZamowienieController(ZamowienieRepository zamowienieRepository) {
        this.zamowienieRepository = zamowienieRepository;
    }

    @GetMapping("/zamowienie")
    public List<Zamowienie> getZamowienie() {
        return (List<Zamowienie>) zamowienieRepository.findAll();
    }

    @PostMapping("/zamowienie")
    void addObuwie(@RequestBody Zamowienie zamowienie) {
        zamowienieRepository.save(zamowienie);
    }
}
