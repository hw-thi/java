package kapitel6;

class Wrapper<T> {
	private T value;
	
	public Wrapper(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

public class WrapperMain {
	public static void tuWas(Wrapper<Double> param)  {
		if (param.getValue() == 0.0) 
			throw new RuntimeException("zero not allowed!");
		param.setValue(3.0);
	}
	
	public static void main(String[] args) {
		Wrapper<Integer> w1 = new Wrapper<>(15);
		int wert1 = w1.getValue();
		Wrapper<String> w2 = new Wrapper<>("15");
		String wert2 = w2.getValue();
		System.out.println("Values: " + wert1 + ", " + wert2);
		Wrapper<Double> w = new Wrapper<>(0.);
		//try {
			tuWas(w);
			System.out.println(w.getValue());
//		} catch (Exception e) {
//			//e.printStackTrace();
//			System.out.println("that did not work!");
//		}
	}

}
