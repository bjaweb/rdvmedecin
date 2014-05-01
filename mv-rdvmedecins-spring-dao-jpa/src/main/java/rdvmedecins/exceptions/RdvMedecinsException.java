package rdvmedecins.exceptions;


import java.io.Serializable; 
//import javax.ejb.ApplicationException; 

//@ApplicationException(rollback=true) 
public class RdvMedecinsException extends RuntimeException implements Serializable{ 

 // champs privés 
 private int code = 0; 

 // constructeurs 
 public RdvMedecinsException() { 
   super(); 
 } 

 public RdvMedecinsException(String message) { 
   super(message); 
 } 

 public RdvMedecinsException(String message, Throwable cause) { 
   super(message, cause); 
 } 

 public RdvMedecinsException(Throwable cause) { 
   super(cause); 
 } 

 public RdvMedecinsException(String message, int code) { 
   super(message); 
   setCode(code); 
 } 

 public RdvMedecinsException(Throwable cause, int code) { 
   super(cause); 
   setCode(code); 
 } 

 public RdvMedecinsException(String message, Throwable cause, int code) { 
   super(message, cause); 
   setCode(code); 
 } 

 // getters - setters 
 public int getCode() { 
   return code; 
 } 

 public void setCode(int code) { 
   this.code = code; 
 } 
} 