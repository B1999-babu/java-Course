
public class Application {

	public static void main(String[] args) {
		Human tom=new Human();
		walker(tom);
		
		Robot wale=new Robot();
		walker(wale);
		
		walker(() -> System.out.println("Custom object walking.... 	"));
		
		walkable aBlockOfCode= () ->System.out.println("Custom object walking...");
		walker(aBlockOfCode);
		
		
		ALambdaInterface 	hellovar=() ->	System.out.println("hello there");
		Claculate sumvar= (a,b) -> a+b;
		hellovar.someMethod();
	   System.out.println(sumvar.comput(10,20));
	   
	   Claculate nonZeroDevide =(a,b) ->{
		   	if(a==0)
		   	{
		   		return 0;
		   	}
		   	return a/b;
	   };
	 	System.out.println(nonZeroDevide.comput(40,20));
	}
	public void sayhello() {
		System.out.println("hello there");
	}
	
	public int sum(int arg1 ,int arg2) {
		return arg1+arg2;
	}
	public int nonZeroDivide(int arg1 ,int arg2) {
		if(arg1==0) {
			return 0;
		}
		return arg1/arg2;
	}
	
	public String reverse(String str) {
		String result="";
		for(int i=str.length()-1; i>=0; i--) {
			result=result + str.charAt(i);
		}
		return result;
	}
	
	public static void walker(walkable walkableEntity)
	{
		walkableEntity.walk();
	}
	
	
}

 interface Claculate {
	 public int comput(int a, int b);
 }
