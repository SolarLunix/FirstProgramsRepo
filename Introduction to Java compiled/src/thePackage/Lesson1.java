package thePackage;

public class Lesson1 {
	public void helloWorld(){
		//print out Hello World
		System.out.println("Hello, World!");
		//Print out hello world on separate lines - they wanted two system.out.prints
		System.out.println("Hello \nWorld"); 
		//Print out something other than hello world:
		System.out.println("Hello, Udacity!");
	}
	public void maths(){
		//What will the lines print?
		System.out.println(3 + 4 + 5); //Without looking I know it will print 12
		System.out.println("3 + 4 + 5"); //Without looking I know it will print 3 + 4 + 5 and they will be printed on separate lines
		//What will these two lines print?
		System.out.print(3);
		System.out.println(4+5); //Without looking I know the system will return 39
	}
	
	public void errors(){
		//System.ouch.println("Hello, World!"); (compile/syntax error)
		//System.out.println("Hello, Word!") (runtime/logic error) Prints out the wrong thing
		System.out.println("Hello, World!"); //is the correction for both errors
		
		//System.out.println(1/0); //Guessing it returns an error. (Returned Arithmetic Exception error) - runtime error
		//System.out.println(Hello, Sara); is a syntax error
		System.out.println("Hello, Sara");
		
		//Is the following code a syntax error or a runtime error?
		System.out.print("My lucky number is");
		System.out.println(3 + 4 + 5); //This would be a runtime error, fixed by making the top println as well or add a space after is
	}
	
	public void algorithms(){
		//Given pseudo-code and I created this:
		int car1mpg = 10;
		int car1price = 15000;
		int car2mpg = 50;
		int car2price = 30000;
		
		int miles = 50000;
		int gasprice = 4;
		
		int costC1 = ((miles / car1mpg) * gasprice) + car1price;
		int costC2 = ((miles / car2mpg) * gasprice) + car2price;
		
		System.out.println("Car 1 will cost you: " + costC1);
		System.out.println("Car 2 will cost you: " + costC2);
		
		if(costC1 > costC2){
			System.out.println("Buy car 2");
		}else if(costC1 == costC2){
			System.out.println("It doesn't matter, but Car 2 looks nicer and is more enviormentally friendly");
		}else{
			System.out.println("Buy car 1");
		}
	}
	
	public void pseudoexample(){
		int n = 10;
		while(n>1){
			System.out.println(n);
			if(n%2 == 0){ //even
				n = n/2;
			}else{ //odd
				n = 3 * n + 1;
			}
		}
	}
	
	public void hw0(){
		java.util.Properties props = System.getProperties();
	     System.out.println("OS: " + props.get("os.name") 
	         + " " + props.get("os.version"));
	     System.out.println("Java: " + props.get("java.vendor") 
	         + " " + props.get("java.version"));
	     String classpath = "" + props.get("java.class.path");
	     String ide;
	     if (classpath.contains("bluej"))
	         ide = "BlueJ";
	     else if (props.get("com.horstmann.codecheck") != null)
	         ide = "Udacity";
	     else 
	         ide = "Unknown";
	     System.out.println("IDE: " + ide);
	     System.out.println("Secret code: " +
	         Math.abs(ide.hashCode() % 10000));
	}
	
}

//TODO: Run this program in BlueJ. If you don't have
//BlueJ installed yet, run it in the Udacity IDE. 
//Paste the output in the text area.

//BlueJ project directory: homework0



