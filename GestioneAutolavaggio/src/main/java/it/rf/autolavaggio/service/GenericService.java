package it.rf.autolavaggio.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import it.rf.autolavaggio.repository.VeicoloRepository;
@service
public class GenericService {

	
	@Autowired
	private VeicoloRepository vrepo;
	
	public boolean insertVeicolo(Veicolo v) {
		
		Optional<Veicolo> veicolo = this.vrepo.findById(v.getnTelaio());
		if(veicolo.isPresent()) {
			return false;
			
		}
		else {
			this.vrepo.save(v);
			return true;
		}
	}
}
