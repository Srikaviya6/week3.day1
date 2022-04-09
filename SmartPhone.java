package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsapp()
	{
		System.out.println("connect whatsapp");
	}
//overriding method from parent class
	public void takeVideo()
	{
		System.out.println("Take video Child");
	}
	public static void main(String[] args) {
		
	SmartPhone sp = new SmartPhone();
	sp.connectWhatsapp();
	sp.takeVideo();
	sp.sendMsg();
	sp.makeCall();
	sp.saveContact();
			
}
}