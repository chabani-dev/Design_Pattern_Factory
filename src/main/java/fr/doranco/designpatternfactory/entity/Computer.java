package fr.doranco.designpatternfactory.entity;

public abstract class Computer {
	
	 // Méthodes abstraites pour obtenir les informations du système
	
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
    
    
    
    // Méthode pour obtenir une représentation sous forme de chaîne de caractères 
        
	@Override
	public String toString() {
		return "Computer RAM =" + getRAM() + ", HDD =" + getHDD() + ", CPU=" + getCPU() + "]";
	}
	
    
} 
    
      
	
    
    

    
    


