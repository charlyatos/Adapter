package net.crojo.adapter;

public class PaymentProcessorPaypalImp implements PaymentPRocessor {
	
	Paypal pay;
	
	public PaymentProcessorPaypalImp( Paypal pago) {
		this.pay = pago;
	}

	@Override
	public void pay() {
		 pay.chargeOnline();
		
	}
	

}
