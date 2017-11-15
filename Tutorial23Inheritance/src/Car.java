
public class Car extends Machine { //Meaning car is a child class of Machine, or Machine is the parent class of car. (It inherits from the Machine class). "Car" has all the methods that "Machine" has.
//As a result car has all the methods machine has. It is described as having "Inherited" the methods.
	public void start() {
		System.out.println("Car Started."); /*This was originally in the Machine file. By putting it here in the child class
		 we can actually override the parent class method with the child class method. */
	}//So long as the method name is the same, and it is placed in a child class that is linked to a parent class, we can override which method is used from which class.
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield.");
	}	
	public void showType() {
		System.out.println("Car name: " + name);
		}
	}
//Note: only override a method, not variables.
