package realtimeExample;

public class Transaction {
	public static void main(String[] args) {
		Cash cash = new Cash() ; 
		cash.pocketCash();
		cash.makingPayent();//
		
		OnlineCard onlineCard = new OnlineCard() ; 
		onlineCard.swipe(); //
		onlineCard.makingPayent();//Transaction succefull
		
		Upi upi = new Upi() ; 
		upi.qrPayemnt();//
		upi.makingPayent();//Transaction succefull
	}

}
