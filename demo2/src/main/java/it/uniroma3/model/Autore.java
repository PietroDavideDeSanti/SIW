package it.uniroma3.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQuery(name= "findAllAutors",query="SELECT a FROM Autore a")
public class Autore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Size(min=1)
	private String nome;
	
	@NotNull
	@Size(min=1)
    private String cognome;
	
	@NotNull
	@Size(min=1)
    private String nazionalita;
	
	
	@Temporal(TemporalType.DATE)
	@NotNull
    private Date dataNascita;
	
	@Temporal(TemporalType.DATE)
	@NotNull
    private Date dataMorte;
    
    @OneToMany(mappedBy = "autore")
    private List<Opera> opere;
    
    public Autore(){ }
    
	public List<Opera> getOpere() {
		return opere;
	}
	
	public void setOpere(List<Opera> opere) {
		this.opere = opere;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getNazionalita() {
		return nazionalita;
	}
	
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	
	public Date getDataNascita() {
		return dataNascita;
	}
	
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	public Date getDataMorte() {
		return dataMorte;
	}
	
	public void setDataMorte(Date dataMorte) {
		this.dataMorte = dataMorte;
	}
 
}
