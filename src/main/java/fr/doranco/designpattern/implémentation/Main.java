package fr.doranco.designpattern.implémentation;

import fr.doranco.designpattern.factory.ComputerFactory;
import fr.doranco.designpatternfactory.entity.Computer;


public class Main {


	public static void main(String[] args) {
		
		try {
		
		      
		 Computer pc =  ComputerFactory.getComputer("PC", "2GB", "500GB" ,"2.2GHz");
	     Computer server = ComputerFactory.getComputer("Server", "16GB", "1TB" ,"2.9GHz");

	     if (pc !=null) {
			 System.out.println("Factroy PC Configuration : " + pc);
		}
	     else {
	    	 
	    	 System.out.println("Type d'ordinateur non pris en charge : PC");
	     }
	     
	     if (server !=null) {
	    	 
			System.out.println("Factroy Server Configuration : " + server);
		} 
	     else {
	    	 
	    	 System.out.println("Type d'ordinateur non pris en charge : Server");
	     }
	     
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}     
		
}
