package beans;

import java.util.Arrays;

public class Drinks {
	private String name;
	private String size;
	private int calories;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
	    if(size.equalsIgnoreCase("Tall") || size.equalsIgnoreCase("Grande") || size.equalsIgnoreCase("Venti")) {
	      this.size = size;
	    }else {
	      System.err.println("InvalidSize Exception:" + size);
	    }
	  }

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Drinks(String name, String size, int calories, double price) {
		super();
		this.setName(name);// It calls the overridden version if we have the subclass object.
		this.size = size;
		this.calories = calories;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drinks [name=" + name + ", size=" +size + ", calories=" + calories + ", price="
				+ price + "]";
	}
}
