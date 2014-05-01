package rdvmedecins.jpa; 

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
 
@MappedSuperclass
public class Personne implements Serializable { 
	
  private static final long serialVersionUID = 1L; 
  
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column(name = "ID") 
  private Long id; 
 
  @Column(name = "TITRE") 
  private String titre; 
 
  @Column(name = "NOM") 
  private String nom; 
 
  @Column(name = "VERSION") 
  private int version; 
 
  @Column(name = "PRENOM") 
  private String prenom; 
   
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getVersion() {
	return version;
}

public void setVersion(int version) {
	this.version = version;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());	
	result = prime * result + ((titre == null) ? 0 : titre.hashCode());
	result = prime * result + version;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Personne other = (Personne) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (prenom == null) {
		if (other.prenom != null)
			return false;
	} else if (!prenom.equals(other.prenom))
		return false;	
	if (titre == null) {
		if (other.titre != null)
			return false;
	} else if (!titre.equals(other.titre))
		return false;
	if (version != other.version)
		return false;
	return true;
}

//@Override
//public String toString() {
//	StringBuilder builder = new StringBuilder();
//	builder.append("Client [id=");
//	builder.append(id);
//	builder.append(", titre=");
//	builder.append(titre);
//	builder.append(", nom=");
//	builder.append(nom);
//	builder.append(", version=");
//	builder.append(version);
//	builder.append(", prenom=");
//	builder.append(prenom);
//	builder.append(", rvList=");
//	builder.append(rvList);
//	builder.append("]");
//	return builder.toString();
//} 
@Override 
public String toString() { 
  return String.format("[%s,%s,%s,%s,%s]", id, version, titre, prenom, nom); 
} 
// constructeurs 
 
// getters et setters 
 
 
  
   
} 