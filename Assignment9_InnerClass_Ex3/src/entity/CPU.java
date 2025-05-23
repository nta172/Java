package entity;

public class CPU {
	private float price;
	private Processor processor;
	private Ram ram;
	
	public CPU(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public class Processor {
		private int coreAmount;
		private String menufacturer;
		
		
		public Processor(int coreAmount, String menufacturer) {
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}

		public Double getCache() {
			return 4.3;
		}
	}
	
	public class Ram {
		private int memory;
		private String menufacturer;
		
		public Ram(int memory, String menufacturer) {
			this.memory = memory;
			this.menufacturer = menufacturer;
		}
		
		public Double getClockSpeed() {
			return 5.5;
		}
	}
}
