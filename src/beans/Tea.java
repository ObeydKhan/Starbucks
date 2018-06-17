package beans;
import java.util.ArrayList;
import java.util.List;
public class Tea extends Drinks {

	public Tea(String name, String size, int calories, double price) {
		super(name, size, calories, price);
		// TODO Auto-generated constructor stub
	}

	private static List<String> options;

	static {
		options = new ArrayList<>();
		options.add("CINNAMON CHAI LATTE");
		options.add("CLASSIC CHAI TEA LATTE");
		options.add("PEACH GREEN TEA LEMONADE");
		options.add("SHAKEN ICED TEA");
		options.add("VERY BERRY HIBISCUS");
	}


	@Override
	public void setName(String name) {
		if(options.contains(name.toUpperCase())) {
			super.setName(name);
		}else
			System.err.println("TeaNameNotFoundException:"+name);
	}

	@Override
	public String toString() {
	  return "\nTea [name=" + getName() + ", size=" + getSize() + ", calories=" + getCalories() + ", price=" + getPrice()
	      + "]";
	}
}



