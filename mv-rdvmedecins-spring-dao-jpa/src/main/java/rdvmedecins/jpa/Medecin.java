package rdvmedecins.jpa; 

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
 
@Entity 
@Table(name = "medecins") 
public class Medecin extends Personne implements Serializable { 
   

	 @Override 
	  public String toString() { 
	    return String.format("Médecin[%s,%s,%s,%s]", getId(), getTitre(), getPrenom(), getNom()); 
	  } 
 
   
} 