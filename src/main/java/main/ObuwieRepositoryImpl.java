package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // służy do komunikacji z bazą
public class ObuwieRepositoryImpl {

    @Autowired
    ObuwieRepository obuwieRepository;

    void updateObuwie(Obuwie obuwie) { //tych funkcji nie ma w repository dlatego trzeba je było napisać oddzielnie tutaj
        if(obuwie != null) {
            Obuwie obuwieBaza = findById(obuwie.getIdObuwia());

            if (!obuwieBaza.equals(obuwie)) {
                obuwieRepository.delete(obuwieBaza);
                obuwieRepository.save(obuwie);
            }
        }
    }

    public Obuwie findById(Long id) {
        return obuwieRepository.findById(id).get();
    } //tych funkcji nie ma w repository dlatego trzeba je było napisać oddzielnie tutaj
}
