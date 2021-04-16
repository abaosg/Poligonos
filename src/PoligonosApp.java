/**
 * @author Usuario
 *
 */
public class PoligonosApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangulo triangulo =new Triangulo();
		Triangulo triangulo2 =new Triangulo(0x009846,4.5);
		
		Cuadrado cuadrado= new Cuadrado(20);
		
		System.out.printf("Perimetro triangulo %f %n",triangulo.perimetro());
		System.out.printf("Superficie triangulo %f %n",triangulo.superficie());
		
		System.out.printf("Perimetro triangulo2 %f %n",triangulo2.perimetro());
		System.out.printf("Superficie triangulo2 %f %n",triangulo2.superficie());
		
		System.out.printf("Perimetro cuadrado %f %n",cuadrado.perimetro());
		System.out.printf("Superficie cuadrado %f %n",cuadrado.superficie());
		
		/*
		double sum=triangulo.sumaAreas(triangulo);
		sum=triangulo2.sumaAreas(triangulo2);
		System.out.printf("suma de los areas de los dos triangulos %f %n",sum);
		*/
	}

}
