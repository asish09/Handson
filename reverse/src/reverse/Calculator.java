package reverse;
class Calculator {
	int t;								//t is a instance variable
	public int add(int c,int d)			//c and d are local variables
	{
		int r=c+d;
		return r;
		
	}
	public int add(int c,int d, int e)		//methodoverloading
	{
		int r=c+d+e;
		return r;
		
	}
	public void subtract()					
	{
		System.out.println("hello");
	}
	public int multiply(int c,int d)
	{
		int m=c*d;
		if(m>=10) {
		return m;
		}
		else return 0;
	}

}
