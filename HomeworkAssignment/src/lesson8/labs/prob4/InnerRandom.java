package lesson8.labs.prob4;

import java.util.function.Supplier;

public class InnerRandom {
	
	public class SupplierImpl implements Supplier<Double>{
		@Override
		public Double get() {
			return Math.random();
		}
	}
	
	public static void main(String[] args) {
		InnerRandom ir = new InnerRandom();
		SupplierImpl si = ir.new SupplierImpl();
		System.out.println(si.get());
	}

}
