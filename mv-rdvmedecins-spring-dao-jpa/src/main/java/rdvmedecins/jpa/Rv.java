package rdvmedecins.jpa; 

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
 
@Entity 
@Table(name = "rv") 
public class Rv implements Serializable { 
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column(name = "ID") 
  private Long id; 
 
  @Column(name = "JOUR") 
  @Temporal(TemporalType.DATE) 
  private Date jour; 
 
  @JoinColumn(name = "ID_CRENEAU", referencedColumnName = "ID") 
  @ManyToOne(optional = false) 
  private Creneau creneau; 
   
  @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID") 
  @ManyToOne(optional = false) 
  private Client client;

  
  
  
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((client == null) ? 0 : client.hashCode());
	result = prime * result + ((creneau == null) ? 0 : creneau.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((jour == null) ? 0 : jour.hashCode());
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
	Rv other = (Rv) obj;
	if (client == null) {
		if (other.client != null)
			return false;
	} else if (!client.equals(other.client))
		return false;
	if (creneau == null) {
		if (other.creneau != null)
			return false;
	} else if (!creneau.equals(other.creneau))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (jour == null) {
		if (other.jour != null)
			return false;
	} else if (!jour.equals(other.jour))
		return false;
	return true;
}



@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Rv [id=");
	builder.append(id);
	builder.append(", jour=");
	builder.append(jour);
	builder.append(", creneau=");
	builder.append(creneau);
	builder.append(", client=");
	builder.append(client);
	builder.append("]");
	return builder.toString();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Date getJour() {
	return jour;
}

public void setJour(Date jour) {
	this.jour = jour;
}

public Creneau getCreneau() {
	return creneau;
}

public void setCreneau(Creneau creneau) {
	this.creneau = creneau;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}



  // constructeurs 
 
 
  // getters et setters 
 
 
} 