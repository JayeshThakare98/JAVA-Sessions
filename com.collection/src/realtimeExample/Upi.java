package realtimeExample;

public class Upi extends Payemt{
void qrPayemnt() {
	System.out.println("QR is scanned Succefully");
}
@Override
void makingPayent() {
	System.out.println("Transaction succefull Via QR scan UPI Payment");
}
}
