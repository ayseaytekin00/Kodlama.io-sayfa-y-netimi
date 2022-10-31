package core.loglama;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("DOSYAYA LOGLANDI : " + data);

	}

}
