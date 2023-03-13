package template;

public class LaunchProxy {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.setAttribute1("AdmiN");
		proxy.request();

		proxy.setAttribute1("Admin");
		proxy.request();
	}
}
