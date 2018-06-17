package tests;

import org.junit.Test;
import beans.Drinks;
import beans.Coffee;
import beans.Tea;
public class UnitTests {

//
//	@Test
//	 public void coffeeTests() {
//			Coffee coffee=new Coffee("fReSHLy BRewED cOFFEE","tall",5,1.75);
//			System.out.println(coffee);
//			Coffee tea=new Coffee("Tea","alpha",4,5);
//			System.out.println(tea);
//		}
	
//	@Test
//	 public void teaTests() {
//			Tea tea=new Tea("PEACH GREEN TEA LATTE","grande",130,3.25);
//			System.out.println(tea);
//			Tea coffee=new Tea("Latte","alpha",4,5);
//			System.out.println(coffee);}

	 public static void main(String[] args) {
		    Coffee coffee = new Coffee("FRESHLY BREWED COFFEE", "tall", 5, 1.75);
		    System.out.println(coffee.toString());
		    
		    Drinks drink = new Drinks("Water", "venti", 6, 1.75);
		    System.out.println(drink.toString());
		    
		    Tea tea = new Tea("PEACH GREEN TEA LEMONADE", "grande", 130, 3.25);
		    System.out.println(tea.toString());
}

}
