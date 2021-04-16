/**
 * 
 */

/**
 * @author b09-05Bm
 *
 */
public class Cuadrado extends Poligonos {

	public Cuadrado(long color, double lado) {
		super(color, lado);
	}
	
	public Cuadrado(double lado) {
		super(lado);
	}
	
	public Cuadrado() {
		super();
	}
	
	public double perimetro() {
		double perimetro=this.lado*4;
		return perimetro;
	}
	
	public double superficie() {
		double superficie=this.lado*this.lado;
		return superficie;
	}
}
