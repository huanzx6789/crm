


public class Demo {
	//---------test---------
	private String name ;
	private String str = "hello" ;
	private String orstr = new String("hello") ;
	//--------------test----
	public Demo() {
		System.out.println(str.equals(orstr)) ;
	}
	public void setStr(String str) {
		this.str = str ;
	}
}