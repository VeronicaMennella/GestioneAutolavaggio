package it.rf.autolavaggio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name= "veicolo")
public class Veicolo {
	
	
	@Id
	@Column()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nTelaio;
	
	@Column()
	private String targa;
	

	public String getnTelaio() {
		return nTelaio;
	}

	public void setnTelaio(String nTelaio) {
		this.nTelaio = nTelaio;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	
	

}
