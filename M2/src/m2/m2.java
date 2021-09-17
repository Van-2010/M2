package m2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fase 1
		char[]nom=new char[6];
	       nom[0]='v';
	       nom[1]='a';
	       nom[2]='n';
	       nom[3]='e';
	       nom[4]='s';
	       nom[5]='a';
	       for(int i=0;i<nom.length;i++) {
	    	   System.out.println("nom "+(i+1)+"="+nom[i]);
	       }
			
	       /*for(char nombre:nom){
	       System.out.println(nombre);
	       }*/
	       System.out.println("\n");
	       //fase 2
	       
	       ArrayList<Character>nom1=new ArrayList<Character>();
	       nom1.add('v');	
	       nom1.add('a');
	       nom1.add('n');
	       nom1.add('e');
	       nom1.add('s');
	       nom1.add('a');
	       
	       for(int i=0;i<nom1.size();i++) {
	    	   System.out.println(nom1.get(i));
	       
	    	   if(nom1.get(i)=='a'||nom1.get(i)=='e') {
	    		   
	    		   System.out.println("VOCAL");
	    	   }else {
	    	
	    		   System.out.println("CONSONANT");
	    		   
	    	   }
	       }
	       System.out.println("\n");
	       //fase 3
	       HashMap<String, Integer>mapa=new HashMap<String, Integer>();
	       mapa.put("V",1);
	       mapa.put("a",2);
	       mapa.put("n",1);
	       mapa.put("e",1);
	       mapa.put("s",1);
	       mapa.put("a",2);
	       System.out.println(mapa.entrySet()+",");
	       /*for(Map.Entry<String, Integer>valors:mapa.entrySet()) {
	         System.out.println(mapa);
	       }
	    	   for(int i=0;i<mapa.size();i++) {
	    	   System.out.println(mapa);
	       }*/
	       
	       System.out.println("\n");
	       //fase 4
	       
	       ArrayList<Character>cognom=new ArrayList<Character>();
	       cognom.add('R');	
	       cognom.add('a');
	       cognom.add('f');
	       cognom.add('o');
	       cognom.add('l');
	       cognom.add('s');
	       
	       ArrayList<Character>unio=new ArrayList<Character>(nom1.size()+cognom.size());
	       unio.addAll(nom1);
	       unio.add(' ');
	       unio.addAll(cognom);
	       System.out.println(unio+" ");
	       System.out.println("\n");
	       
	       //Nivell 2
	      
	       for(int i=1;i<6;i++) {
	    	   	System.out.println(i);
	    	   		for(int j=1;j<=i;j++) {
	    	   			System.out.print(j);  
	    	   		}
	      }
	              
	      System.out.println("\n");
	      
	      System.out.println("Introdueix el número de fileres:");
	      Scanner teclado=new Scanner(System.in);
	      int files=teclado.nextInt();
	      
	      for(int i=0; i<files;i++) {//fileres
	    	  for(int j=0;j<=i;j++) {//columnes
	    	  System.out.print(" ");
	    	  }
	    	  	for(int j=files-1-i;j>=0;j--) {
	    	  		System.out.print("* ");
	    	  	}
	    	  	System.out.println("");
	      }
	      System.out.println("\n");
	      
		}


	}


