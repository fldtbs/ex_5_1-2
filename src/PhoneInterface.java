
public interface PhoneInterface {//인터페이스 선언
	
	final int TIMEOUT = 10000;//상수 선언
	
	void sendCall();//추상 메소드 선언
//	int sum(int x, int y); //추상 메소드 선언시 public abstract 생략 가능
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
