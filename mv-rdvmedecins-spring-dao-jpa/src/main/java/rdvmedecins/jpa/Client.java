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
@Table(name = "clients") 
public class Client extends Personne implements Serializable { 
 
	 private static final long serialVersionUID = 1L; 
	 
	 
//	 @Override 
//	  public int hashCode() { 
//	 
//	  return 1; 
//	 }
	 
	@Override 
	  public String toString() { 
	    return String.format("Client[%s,%s,%s,%s]", getId(), getTitre(), getPrenom(), getNom()); 
	  } 
} 