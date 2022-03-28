
public class Color_TV extends TV {
	private int Colors;
	
	public Color_TV(int size, int Colors) {
		super(size);
		this.Colors = Colors;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + Colors + "컬러");
	}
}
