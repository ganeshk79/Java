class Operator
{  
	public static void main(String args[])
	{  
  
		 System.out.println("	\"Unary Operator  \"");
		 int x=10;
   		 System.out.println("x++ :"+ x++);  //10 (11)  
   		 System.out.println("++x :"+ ++x);  //12  
    		 System.out.println("x-- :"+ x--);  //12 (11)  
    		 System.out.println("--x :"+ --x);  //10  

		 int g=10;  
		 int h=10;  
		 System.out.println(g++ + ++g);  //10+12=22  
		 System.out.println(h++ + h++);  //10+11=21
		  
		 int y=10;  
		 int z=-10;  
		 boolean k=true;  
		 boolean d=false;  
		 System.out.println(~y);//-11 (minus of total positive value which starts from 0)  
		 System.out.println(~z);//9 (positive of total minus, positive starts from 0)  
		 System.out.println(!k);//false (opposite of boolean value)  
		 System.out.println(!d +"\n");//true 

		 System.out.println("	\" Arithmetic Operator \"");
		 
		 int a=10;  
		 int b=5; 
		 int c=20; 
		 System.out.println(a+b);//15  
		 System.out.println(a-b);//5  
		 System.out.println(a*b);//50  
		 System.out.println(a/b);//2  
		 System.out.println(a%b +"\n");//0 
		 System.out.println("Using Precedence and associativity :"+ (10*10/5+3-1*4/2));

		 System.out.println("	\" Left shift operator \" ");
		 System.out.println(a<<2);  //10*2^2=10*4=40  
		 System.out.println(a<<3);//10*2^3=10*8=80  
		 System.out.println(20<<2);//20*2^2=20*4=80  
		 System.out.println((15<<4 )+"\n");//15*2^4=15*16=240

		 System.out.println( "	\" Right shift operator \" ");
		 System.out.println(10>>2);	//10/2^2=10/4=2  
		 System.out.println(20>>2);	//20/2^2=20/4=5  
		 System.out.println((20>>3) +"\n");	//20/2^3=20/8=2  

		 System.out.println("	\"Shift operator(<<< ,>>>) \" ");
		 //For positive number, >> and >>> works same  
    		 System.out.println(20>>2);  
    		 System.out.println(20>>>2);  
    		 //For negative number, >>> changes parity bit (MSB) to 0  
   		 System.out.println(-20>>2);  
   		 System.out.println((-20>>>2) +"\n"); 

		 System.out.println("	\" And Operator \" ");

		 System.out.println(a<b&&a++<x);	//false && true = false  
		 System.out.println(a);		//10 because second condition is not checked  
		 System.out.println(a<b&a++<x);		//false && true = false  
		 System.out.println(a +"\n");		//11 because second condition is checked
    		
		 System.out.println("	\" OR operator \" ");
 		 System.out.println(a>b||a<c);//true || true = true  
		 System.out.println(a>b|a<c);//true | true = true  

		 System.out.println(a>b||a++<c);//true || true = true  
		 System.out.println(a);//10 because second condition is not checked  
	 	 System.out.println(a>b|a++<c);//true | true = true  
	 	 System.out.println(a+"\n");//11 because second condition is checked  
		 	
		 System.out.println("	\" Tenary operator \" ");
		 int min=(a<b)?a:b;  	// condition?true:false 
		 System.out.println(min+"\n"); 
		
		 System.out.println( "	\" Assignment operator \" ");
		 a+=3;//10+3  
		 System.out.println(a);  
		 a-=4;//13-4  
		 System.out.println(a);  
		 a*=2;//9*2  
		 System.out.println(a);  
	 	 a/=2;//18/2  
		 System.out.println(a); 
		
		 
		
	}
}  