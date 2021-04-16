/**
 * 
 */

/**
 * @author b09-05Bm
 *
 */
public class Triangulo extends Poligonos {

	public Triangulo(long color, double lado) {
		super(color, lado);
	}

	public Triangulo(double lado) {
		super(lado);
	}
	
	public Triangulo() {
		super();
	}
	
	public double perimetro() {
		double perimetro=this.lado*3;
		return perimetro;
	}
	
	public double superficie() {
		double raiz=Math.sqrt(this.lado*3);
		double altura=raiz/2;
		double superficie=altura*this.lado/2;
		return superficie;
	}
}
