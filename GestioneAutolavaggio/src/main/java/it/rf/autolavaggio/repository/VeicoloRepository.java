package it.rf.autolavaggio.repository;

import org.springframework.data.jpa.repository.Jparepository;
import org.springframework.stereotype.Repository;
import it.rf.autolavaggio.model.Veicolo;

@Repository
public interface VeicoloRepository extends Jparepository<Veicolo, String> {

}
