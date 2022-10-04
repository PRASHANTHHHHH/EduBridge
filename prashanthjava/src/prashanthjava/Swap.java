package prashanthjava;

public class Swap {

	public static void main(String[] args) {
		
		float first = 1.20f, second = 2.45f;
		
		   System.out.println("--Before Swap--");
		   System.out.println("First Number = " + first);
		   System.out.println("Second Number = " + second);
		   
		   float temp = first;
		   		 first = second;
		   		 second = temp;
		   		 
		   System.out.println("--After Swap--");
		   System.out.println("First Number = " + first);
		   System.out.println("Second Number = " + second);
	}

}
