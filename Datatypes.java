class Datatypes 
{ 	//static variable
	 static byte a; 
	 static short b;
 	 static int c;
	 static long d ;
	 static double e;
	 static char f;
	 static float g;
	 static boolean h;
	 int method()
	 {
		int n=100; //local variable
		return n;
	 }
	
       public static void main(String args[])
	{
	 	Datatypes ob = new Datatypes();
		System.out.println("\"Default value \"");
		System.out.println("Byte value:"+a);
		System.out.println("Short value:"+b);
		System.out.println("Int value:"+c);
		System.out.println("Long value:"+d);
		System.out.println("Double value:"+e);
		System.out.println("Character value:"+f);
		System.out.println("Float value:"+g);
		System.out.println("Boolean value:"+h

		System.out.println("Using Method accessing variable "+ob.method()); 
	}
}
	
		