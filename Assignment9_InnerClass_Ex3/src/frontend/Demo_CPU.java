package frontend;

import entity.CPU;

public class Demo_CPU {
	public static void main(String[] args) {
		CPU cpu = new CPU(1f);
		CPU.Processor processor = cpu.new Processor(1, "Processor");
		System.out.println("Processor : " + processor.getCache());
		
		CPU.Ram ram = cpu.new Ram(2, "Ram");
		System.out.println("Ram : " + ram.getClockSpeed());
	}
}
