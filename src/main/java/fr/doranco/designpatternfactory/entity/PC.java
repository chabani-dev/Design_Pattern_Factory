package fr.doranco.designpatternfactory.entity;

public class PC extends Computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	
	
	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	
	public String getRam() {
		return ram;
	}


	public String getHdd() {
		return hdd;
	}


	public String getCpu() {
		return cpu;
	}


	public String getRAM() {
        return ram;
    }

    public String getHDD() {
        return hdd;
    }

    public String getCPU() {
        return cpu;
    }
}

	


