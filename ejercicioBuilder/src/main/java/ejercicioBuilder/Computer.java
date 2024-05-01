package ejercicioBuilder;

public class Computer {
	private String CPU;
	private int RAM;
	private int HDD;
	private String GPU;

	public Computer() {
		super();
		CPU = "jsbjkdvjnds";
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getHDD() {
		return HDD;
	}
	public void setHDD(int hDD) {
		HDD = hDD;
	}
	public String getGPU() {
		return GPU;
	}
	public void setGPU(String gPU) {
		GPU = gPU;
	}
}
