package realtimeExample;

public class OnlineCard extends Payemt{
 void swipe() {
	 System.out.println("We are paying via swipe ");
 }
 @Override 
 void makingPayent() {
		System.out.println("Transaction succefull via Swipe ");
	}
}
