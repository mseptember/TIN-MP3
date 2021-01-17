package main;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ObuwieController {
    private final ObuwieRepository obuwieRepository;

    public ObuwieController(ObuwieRepository obuwieRepository) {
        this.obuwieRepository = obuwieRepository;
    }

    @GetMapping("/obuwie")
    public List<Obuwie> getObuwie() {
        return (List<Obuwie>) obuwieRepository.findAll();
    }

    @PostMapping("/obuwie")
    void addObuwie(@RequestBody Obuwie obuwie) {
        obuwieRepository.save(obuwie);
    }
}
