package interfaceTest;

public class derived1 implements interface1, interface2 {
	public static void main(String[] args){
		derived1 d = new derived1();
		System.out.println(d.div(144, 12));
	}
}
