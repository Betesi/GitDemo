
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		//String is an object
		String s = "John Oladipupo Jolaosho";
		
		CoreJavaBrushUp3 d = new CoreJavaBrushUp3();
		String name = d.getData();
		
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2();
		
		  d1.getUserData();
		  
		  
		 // for(int i=0; i<s.length();i++)
			  
			  for(int i=s.length()-1;i>=0;i--)
		 
		  
		  {
			  
			  System.out.println(s.charAt(i));
		  }

	}
	
	public String getData()
	{
		
		System.out.println("Hello to my world");
		return "John is the King";
	}
	
	
	

}
