package main;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZamowienieRepository extends CrudRepository<Zamowienie, Long> {}
