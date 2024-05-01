package ejercicioBuilder;

public class ComputerDirector {
	
    public Computer buildBasicComputer() {
        ComputerBuilder builder = new ComputerBuilder();
        builder.buildCPU("Intel Core i5");
        builder.buildRAM(8);
        builder.buildHDD(500);
        builder.buildGPU("NVIDIA GeForce GTX 1650");
        return builder.getComputer();
    }
}
