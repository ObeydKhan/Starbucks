package beans;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Drinks {
	private static List<String> options;

	static {
		options = new ArrayList<>();
		options.add("FRESHLY BREWED COFFEE");
		options.add("ICED COFFEE");
		options.add("CAFFE AMERICANO");
		options.add("FLAT WHITE");
		options.add("CAFFE LATTE");
		options.add("CARAMEL MACCHIATO");
		options.add("WHITE CHOCOLATE MOCHA");
		options.add("CAFFE MOCHA");
	}

	public Coffee(String name, String size, int calories, double price) {
		super(name, size, calories, price);

	}
	@Override
	public void setName(String name) {
		if(options.contains(name.toUpperCase())) {
			super.setName(name);
		}else
			System.err.println("CoffeeNameNotFoundException:"+name);
	}
//	@Override
//	public String toString() {
//	  return "\nCoffee [Name=" + getName() + ", Size=" + getSize() + ", Calories=" + getCalories() + ", Price=" + getPrice()
//	      + "]";
//	}
}
