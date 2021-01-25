package main;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Sciśle powiązane z bazą i zawiera podstawowe operacje typu findAll, delete, save/add
public interface ObuwieRepository extends CrudRepository<Obuwie, Long> { }
