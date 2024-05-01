package ejercicioBuilder;

public interface IComputerBuilder {
	
	
	void buildCPU(String cpu);
    void buildRAM(int ram);
    void buildHDD(int hdd);
    void buildGPU(String gpu);
    
    Computer getComputer();

}
