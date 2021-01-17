package zamowieniePackage;

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
    public List<Zawmowienie> getZamowienie() {
        return (List<Zawmowienie>) zamowienieRepository.findAll();
    }

    @PostMapping("/zamowienie")
    void addObuwie(@RequestBody Zawmowienie zamowienie) {
        zamowienieRepository.save(zamowienie);
    }
}
