package arrayList;

public class Generics<X,Y,Z> {

	X x;
	Y y;
	Z z;
	public Generics(X x, Y y ,Z z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void print() {
		System.out.println(x +" ,"+ y +"and " + z);
	}
	
}
