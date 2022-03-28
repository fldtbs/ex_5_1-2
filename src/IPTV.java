
public class IPTV extends Color_TV{
	private String ipaddress;

	public IPTV(String ipaddress,int size, int Colors) {
		super(size, Colors);
		this.ipaddress = ipaddress;
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ ipaddress + "주소의 ");
		super.printProperty();//부모클래스의 호출
	}
	
	
}
