package runners;

import beans.Coffee;

public class Main {

	public static void main(String [] args) {
		//App.run();
		Coffee a=new Coffee("Freshly Brewed Coffee", "venti", 5, 2.35);
		System.out.println(a.toString());
	}

}
