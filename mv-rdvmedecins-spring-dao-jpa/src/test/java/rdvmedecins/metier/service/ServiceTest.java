package rdvmedecins.metier.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import rdvmedecins.BaseTest;
import rdvmedecins.jpa.Client;
import rdvmedecins.jpa.Medecin;

public class ServiceTest extends BaseTest {
	
	@Autowired
	private IMetier metier;
	
	
	  @Test 
	  public void test1() { 
		  
	    // affichage clients 
	    List<Client> clients =metier.getAllClients(); 
	    display("Liste des clients :", clients); 
	    // affichage médecins 
	    List<Medecin> medecins =metier.getAllMedecins(); 
	    display("Liste des médecins :", medecins); 
//	    // affichage créneaux d'un médecin 
//	    Medecin medecin = medecins.get(0); 
//	    List<Creneau> creneaux = dao.getAllCreneaux(medecin); 
//	    display(String.format("Liste des créneaux du médecin %s", medecin), creneaux); 
//	    // liste des Rv d'un médecin, un jour donné 
//	    display(String.format("Liste des créneaux du médecin %s, le [%s]", medecin, jour), dao.getRvMedecinJour(medecin, jour)); 
//	    // ajouter un RV 
//	    Rv rv = null; 
//	    Creneau creneau = creneaux.get(2); 
//	    Client client = clients.get(0); 
//	    System.out.println(String.format("Ajout d'un Rv le [%s] dans le créneau %s pour le client %s", jour, creneau, client)); 
//	    rv = dao.ajouterRv(jour, creneau, client); 
//	    System.out.println("Rv ajouté"); 
//	    display(String.format("Liste des Rv du médecin %s, le [%s]", medecin, jour), dao.getRvMedecinJour(medecin, jour)); 
//	    // ajouter un RV dans le même créneau du même jour 
//	    // doit provoquer une exception 
//	    System.out.println(String.format("Ajout d'un Rv le [%s] dans le créneau %s pour le client %s", jour, creneau, client)); 
//	    Boolean erreur = false; 
//	    try { 
//	      rv = dao.ajouterRv(jour, creneau, client); 
//	      System.out.println("Rv ajouté"); 
//	    } catch (Exception ex) { 
//	      Throwable th = ex; 
//	      while (th != null) { 
//	        System.out.println(ex.getMessage()); 
//	        th = th.getCause(); 
//	      } 
//	      // on note l'erreur 
//	      erreur=true; 
//	    } 
//	    // on vérifie qu'il y a eu une erreur 
//	    Assert.assertTrue(erreur); 
//	    // liste des RV 
//	    display(String.format("Liste des Rv du médecin %s, le [%s]", medecin, jour), dao.getRvMedecinJour(medecin, jour)); 
//	    // supprimer un RV 
//	    System.out.println("Suppression du Rv ajouté"); 
//	    dao.supprimerRv(rv); 
//	    System.out.println("Rv supprimé"); 
//	    display(String.format("Liste des Rv du médecin %s, le [%s]", medecin, jour), dao.getRvMedecinJour(medecin, jour)); 
	  } 

}
