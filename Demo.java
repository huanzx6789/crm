

public class Demo {
	private String str = "hello" ;
	private String orstr = new String("hello") ;
	//--------------test----
	public Demo() {
		System.out.println(str.equals(orstr)) ;
	}
}