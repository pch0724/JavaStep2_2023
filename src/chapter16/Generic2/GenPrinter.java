package chapter16.Generic2;

public class GenPrinter<O> {

	O material;
	
	public O getObj() {
		return material;
	}
	
	public void setObj(O material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
