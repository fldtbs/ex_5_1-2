
public class ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color_TV myTV = new Color_TV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
