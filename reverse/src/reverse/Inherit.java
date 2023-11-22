package reverse;

public class Inherit {

	public static void main(String[] args) {
		VeryAdvCalc obj=new VeryAdvCalc();
		int r1=obj.add(4,5);
		int r2=obj.add(3,4,5);
		int r3=obj.multiply(8,5);
		obj.subtract();
		int r4=obj.div(15,3);
		int r5=obj.power(4,2);
		obj.show();
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);

	}

}
