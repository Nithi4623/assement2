package zithi;

public class calculater {
	public void additiontwonumber(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	public void subraction(int e ,int f) {
		int m= e-f;
		System.out.println(m);
	}
	public void multipication(double i,double j){
		double g=i*j;
		System.out.println(g);
		}
	
	public void divide(float x, float y) {
		float h=x/y;
		System.out.println(h);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculater calc=new calculater();
		calc.additiontwonumber(23, 56);
		calc.subraction(6, 4);
		calc.multipication(45,9);
		calc.divide(45, 77);

	}

}
