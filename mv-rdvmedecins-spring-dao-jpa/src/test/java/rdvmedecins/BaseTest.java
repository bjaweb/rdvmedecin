package rdvmedecins;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:/spring-config-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

	  // méthode utilitaire - affiche les éléments d'une collection 
	  protected static void display(String message, List elements) { 
	    System.out.println(message); 
	    for (Object element : elements) { 
	      System.out.println(element); 
	    } 
	  } 
} 
