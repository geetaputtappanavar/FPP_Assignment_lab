package mum.lesson1;

/** by geeta*/
public class HelloWorldApp {
	public static void main(String[] args){
		//System.out.println("Hi MUM");
		//char c ='K';
		//System.out.println((int)c);
		//System.out.println(Integer.toHexString('X'));
		//System.out.println("\"java"\");
		//int b;
		//int a =(int b=5);
		//System.out.println(5.5f/0.0f);
		//String[] argsStr = {"java", "FPP", "MPP"};
		String finalStr = "" ;
		for(String s:args){
			finalStr = finalStr+" "+s;
		}
		System.out.println(finalStr);
		System.out.println();
	}
}
