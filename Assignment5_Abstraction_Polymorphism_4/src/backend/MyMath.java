package backend;

public class MyMath {
	// Overloading : nạp chồng.
	public int getSum(int par1, int par2) {
		return (par1 + par2);
	}
	
	public byte getSum(byte par1, byte par2) {
		return (byte) (par1+ par2);
	}
	
	public Float getSum(Float par1, Float par2) {
		return (par1 + par2);
	}
}
