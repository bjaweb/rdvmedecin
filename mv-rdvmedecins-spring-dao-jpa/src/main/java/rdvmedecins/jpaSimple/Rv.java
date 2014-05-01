//package rdvmedecins.jpaSimple; 
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
// 
// 
//@Entity 
//@Table(name = "rv") 
//public class Rv implements Serializable { 
//  @Id 
//  @GeneratedValue(strategy = GenerationType.IDENTITY) 
//  @Column(name = "ID") 
//  private Long id; 
// 
//  @Column(name = "JOUR") 
//  @Temporal(TemporalType.DATE) 
//  private Date jour; 
// 
//  @JoinColumn(name = "ID_CRENEAU", referencedColumnName = "ID") 
//  @ManyToOne(optional = false) 
//  private Creneau idCreneau; 
// 
//  @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID") 
//  @ManyToOne(optional = false) 
//  private Client idClient;
//
//@Override
//public int hashCode() {
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + ((id == null) ? 0 : id.hashCode());
//	result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
//	result = prime * result + ((idCreneau == null) ? 0 : idCreneau.hashCode());
//	result = prime * result + ((jour == null) ? 0 : jour.hashCode());
//	return result;
//}
//
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Rv other = (Rv) obj;
//	if (id == null) {
//		if (other.id != null)
//			return false;
//	} else if (!id.equals(other.id))
//		return false;
//	if (idClient == null) {
//		if (other.idClient != null)
//			return false;
//	} else if (!idClient.equals(other.idClient))
//		return false;
//	if (idCreneau == null) {
//		if (other.idCreneau != null)
//			return false;
//	} else if (!idCreneau.equals(other.idCreneau))
//		return false;
//	if (jour == null) {
//		if (other.jour != null)
//			return false;
//	} else if (!jour.equals(other.jour))
//		return false;
//	return true;
//}
//
//@Override
//public String toString() {
//	StringBuilder builder = new StringBuilder();
//	builder.append("Rv [id=");
//	builder.append(id);
//	builder.append(", jour=");
//	builder.append(jour);
//	builder.append(", idCreneau=");
//	builder.append(idCreneau);
//	builder.append(", idClient=");
//	builder.append(idClient);
//	builder.append("]");
//	return builder.toString();
//}
//
//public Long getId() {
//	return id;
//}
//
//public void setId(Long id) {
//	this.id = id;
//}
//
//public Date getJour() {
//	return jour;
//}
//
//public void setJour(Date jour) {
//	this.jour = jour;
//}
//
//public Creneau getIdCreneau() {
//	return idCreneau;
//}
//
//public void setIdCreneau(Creneau idCreneau) {
//	this.idCreneau = idCreneau;
//}
//
//public Client getIdClient() {
//	return idClient;
//}
//
//public void setIdClient(Client idClient) {
//	this.idClient = idClient;
//} 
// 
//
//
//  // constructeurs 
// 
// 
//  // getters et setters 
// 
// 
//} 