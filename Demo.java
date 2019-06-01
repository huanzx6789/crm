

public class Demo {
	private String str = "hello" ;
	private String orstr = new String("hello") ;
	public Demo() {
		System.out.println(str.equals(orstr)) ;
	}
}