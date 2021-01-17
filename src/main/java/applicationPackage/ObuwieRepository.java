package applicationPackage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObuwieRepository extends CrudRepository<Obuwie, Long> {}
