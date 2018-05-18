package privateInheritance;

class BaseClass{
    private int hello;

    BaseClass(int a){
    	this.hello = a;
    }
    
    public String toString() {
    	return Integer.toString(hello);
    }
}

public class PrivateAccessingInheritanceSuper extends BaseClass{
	PrivateAccessingInheritanceSuper(int bb){
		super(bb);
	}
	
    public static void main(String[] args) {
    	PrivateAccessingInheritanceSuper dc = new PrivateAccessingInheritanceSuper(1000);
    	
    	System.out.println(dc);
    }
}
