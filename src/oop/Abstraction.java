package oop;

class MailService{
	public void sendEmail() {
		connect();
		authenticate();
		// send email logic
		disconnect();
	}
	private void connect() {
		System.out.println("Connect");
	}
	private void disconnect() {
		System.out.println("Disconnect");
	}
	private void authenticate() {
		System.out.println("Authenticate");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		MailService ms = new MailService();
		ms.sendEmail();
		ms.sendEmail();
	}
}
