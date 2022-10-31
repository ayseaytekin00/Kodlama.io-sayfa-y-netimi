package core.loglama;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Maile Loglandi : " + data);

	}

}
