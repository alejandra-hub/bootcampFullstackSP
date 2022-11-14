
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
public class Challenge1 {
        
    
    public Challenge1() {
    }
   
   
    public static void main(String[] args) {
        
        Scanner leer =new Scanner(System.in);
        
        int b=8;
        int a=8;
        String nom = "";

       
        System.out.println("Tipo A 54" +  StringA(a));
        System.out.println("Tipo B 08" +  StringB(b));
        
       
    	
    	System.out.println("Ingrese nombre a buscar");
        nom = leer.next(); 
    	
        List<String> lista = Arrays.asList("Maria","Pedro","Juana","Sebas");
        String buscar = nom;
        
        
 
        boolean Esta = FindElement(lista, buscar);
        System.out.println(Esta);        // true
        
        
        
        
        
    }
   
   
   
   		static String StringA(int a){
   		String tipoa;
        StringBuilder Construc;
   		tipoa = "0123456789";
   		
   		 Construc = new StringBuilder(a);
   		 
   		 for (int x = 0; x< a; x++){
   		 	 int myindex 
                = (int)(tipoa.length() 
                        * Math.random()); 

            // add the characters
           Construc.append(tipoa
                        .charAt(myindex)); 
        } 

        return Construc.toString(); 
   		 }
   	
   	
   		 
   		 
   		static String StringB(int b){
   		String tipob;
        StringBuilder Construc;
   		tipob = "0123456789";
   		
   		 Construc = new StringBuilder(b);
   		 
   		 for (int x = 0; x< b; x++){
   		 	 int myindex 
                = (int)(tipob.length() 
                        * Math.random()); 

            // add the characters
            Construc.append(tipob
                        .charAt(myindex)); 
        } 

        return Construc.toString(); 
   		 }
   		 
   		
   		
   		
   		
   		
   		static boolean FindElement(List<String> list, String buscar) {
        for (String e : list) {
            if (Objects.equals(e, buscar)) {
                return false;
            }
        }
        return true;
    }
   		 
   		
   	 
   		 
   		 
   		 
   	}
   	
   	
   	
   	
   	
   	
  
    
    
    

