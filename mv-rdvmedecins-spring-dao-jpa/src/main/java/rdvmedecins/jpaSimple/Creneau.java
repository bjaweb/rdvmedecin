//package rdvmedecins.jpaSimple; 
// 
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
// 
//@Entity 
//@Table(name = "creneaux") 
//public class Creneau implements Serializable { 
//  @Id 
//  @GeneratedValue(strategy = GenerationType.IDENTITY) 
//  @Column(name = "ID") 
//  private Long id; 
// 
//  @Column(name = "MDEBUT") 
//  private int mdebut; 
// 
//  @Column(name = "HFIN") 
//  private int hfin; 
// 
//  @Column(name = "HDEBUT") 
//  private int hdebut; 
// 
//  @Column(name = "MFIN") 
//  private int mfin; 
// 
//  @Column(name = "VERSION") 
//  private int version; 
// 
//  @JoinColumn(name = "ID_MEDECIN", referencedColumnName = "ID") 
//  @ManyToOne(optional = false) // indispensable
//  private Medecin idMedecin; 
// 
//  @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCreneau") 
//  private List<Rv> rvList; 
// 
//// constructeurs 
// 
//// getters et setters 
// 
// 
//  
// 
//  @Override
//public int hashCode() {
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + hdebut;
//	result = prime * result + hfin;
//	result = prime * result + ((id == null) ? 0 : id.hashCode());
//	result = prime * result + ((idMedecin == null) ? 0 : idMedecin.hashCode());
//	result = prime * result + mdebut;
//	result = prime * result + mfin;
//	result = prime * result + ((rvList == null) ? 0 : rvList.hashCode());
//	result = prime * result + version;
//	return result;
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
//public int getMdebut() {
//	return mdebut;
//}
//
//public void setMdebut(int mdebut) {
//	this.mdebut = mdebut;
//}
//
//public int getHfin() {
//	return hfin;
//}
//
//public void setHfin(int hfin) {
//	this.hfin = hfin;
//}
//
//public int getHdebut() {
//	return hdebut;
//}
//
//public void setHdebut(int hdebut) {
//	this.hdebut = hdebut;
//}
//
//public int getMfin() {
//	return mfin;
//}
//
//public void setMfin(int mfin) {
//	this.mfin = mfin;
//}
//
//public int getVersion() {
//	return version;
//}
//
//public void setVersion(int version) {
//	this.version = version;
//}
//
//public Medecin getIdMedecin() {
//	return idMedecin;
//}
//
//public void setIdMedecin(Medecin idMedecin) {
//	this.idMedecin = idMedecin;
//}
//
//public List<Rv> getRvList() {
//	return rvList;
//}
//
//public void setRvList(List<Rv> rvList) {
//	this.rvList = rvList;
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
//	Creneau other = (Creneau) obj;
//	if (hdebut != other.hdebut)
//		return false;
//	if (hfin != other.hfin)
//		return false;
//	if (id == null) {
//		if (other.id != null)
//			return false;
//	} else if (!id.equals(other.id))
//		return false;
//	if (idMedecin == null) {
//		if (other.idMedecin != null)
//			return false;
//	} else if (!idMedecin.equals(other.idMedecin))
//		return false;
//	if (mdebut != other.mdebut)
//		return false;
//	if (mfin != other.mfin)
//		return false;
//	if (rvList == null) {
//		if (other.rvList != null)
//			return false;
//	} else if (!rvList.equals(other.rvList))
//		return false;
//	if (version != other.version)
//		return false;
//	return true;
//}
//
//@Override
//public String toString() {
//	StringBuilder builder = new StringBuilder();
//	builder.append("Creneau [id=");
//	builder.append(id);
//	builder.append(", mdebut=");
//	builder.append(mdebut);
//	builder.append(", hfin=");
//	builder.append(hfin);
//	builder.append(", hdebut=");
//	builder.append(hdebut);
//	builder.append(", mfin=");
//	builder.append(mfin);
//	builder.append(", version=");
//	builder.append(version);
//	builder.append(", idMedecin=");
//	builder.append(idMedecin);
//	builder.append(", rvList=");
//	builder.append(rvList);
//	builder.append("]");
//	return builder.toString();
//} 
// 
//  
//   
//} 