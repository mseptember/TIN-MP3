package main;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ObuwieController {
    private final ObuwieRepository obuwieRepository;
    private final ObuwieRepositoryImpl obuwieRepositoryImpl;

    public ObuwieController(ObuwieRepository obuwieRepository, ObuwieRepositoryImpl obuwieRepositoryImpl) {
        this.obuwieRepository = obuwieRepository;
        this.obuwieRepositoryImpl = obuwieRepositoryImpl;
    }

    @GetMapping("/obuwie")
    public List<Obuwie> getObuwie() {
        return (List<Obuwie>) obuwieRepository.findAll();
    }

    @GetMapping("/model")
    public Optional<Obuwie> getModel(@RequestParam Long id){
        return obuwieRepository.findById(id);
    }

    @PostMapping("/obuwie")
    void addObuwie(@RequestBody Obuwie obuwie) {
        obuwieRepository.save(obuwie);
    }

    @PostMapping("/but")
    void updateObuwie(@RequestBody Obuwie obuwie) {
        obuwieRepositoryImpl.updateObuwie(obuwie);
    }

    @DeleteMapping("/usun")
    public void deleteObuwie(@RequestParam Long id) { obuwieRepository.deleteById(id); }

}
