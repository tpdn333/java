package p06.lecture.p3constructor;

public class Computer {
	String model;
	int memory;
	String cpu;
	int ssd;

	Computer(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;

	}

	Computer(String model, int memory, String cpu) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}
}
