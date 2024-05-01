package ejercicioBuilder;

public class ComputerBuilder implements IComputerBuilder{

	private Computer computer;
	
	

	public ComputerBuilder() {
		this.computer = new Computer();
	}

	@Override
	public void buildCPU(String cpu) {
		computer.setCPU(cpu);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildRAM(int ram) {
		computer.setRAM(ram);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildHDD(int hdd) {
		computer.setHDD(hdd);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildGPU(String gpu) {
		computer.setGPU(gpu);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}

	
}
