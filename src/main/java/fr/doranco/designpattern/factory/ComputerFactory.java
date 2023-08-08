package fr.doranco.designpattern.factory;

import fr.doranco.designpatternfactory.entity.Computer;
import fr.doranco.designpatternfactory.entity.PC;
import fr.doranco.designpatternfactory.entity.Server;

public class ComputerFactory {
    //private static String typeComputer;

    
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		 if (type.equals("PC")) {
	            return new PC(ram, hdd, cpu);
	        } else if (type.equals("Server")) {
	            return new Server(ram, hdd, cpu);
	        } else {
	            return null; 
	        }
	    }

}
