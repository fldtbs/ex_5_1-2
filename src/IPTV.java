
public class IPTV extends Color_TV{
	private String ipaddress;

	public IPTV(String ipaddress,int size, int Colors) {
		super(size, Colors);
		this.ipaddress = ipaddress;
	}
	
	public void printProperty() {
		System.out.print("���� IPTV�� "+ ipaddress + "�ּ��� ");
		super.printProperty();//�θ�Ŭ������ ȣ��
	}
	
	
}
