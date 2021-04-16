import java.util.ArrayList;

/**
 * @author b09-05Bm
 *
 */
public class Poligonos {
	protected long PCOLOR=0X000000;
	protected double PLADO=10;
	protected long color;
	protected double lado;
	private boolean relleno;
	private boolean rotado;
	private int grados;
	/*
	private ArrayList<Cuadrado> cuadrados=new ArrayList<Cuadrado>();
	private ArrayList<Triangulo> triangulos=new ArrayList<Triangulo>();
	*/
	public Poligonos(long color, double lado) {
		this.color=color;
		this.lado=lado;
		this.relleno=false;
		this.rotado=false;
		this.grados=0;
	}
	
	public Poligonos(double lado) {
		this.color=PCOLOR;
		this.lado=lado;
		this.relleno=false;
		this.rotado=false;
		this.grados=0;
	}
	
	public Poligonos() {
		this.color=PCOLOR;
		this.lado=PLADO;
		this.relleno=false;
		this.rotado=false;
		this.grados=0;
	}
	
	public void rellenar() {
		this.relleno=true;
	}

	public void rotacion(int rotado) {
		this.rotado=true;
		if(this.rotado) {
			this.grados=rotado;
		}else {
			this.grados=0;
		}
	}
	
	public long getColor() {
		return color;
	}

	public boolean isRelleno() {
		return relleno;
	}

	public boolean isRotado() {
		return rotado;
	}

	public int getGrados() {
		return grados;
	}

	public double agrandar(double mas) {
		return this.lado=this.lado+mas;
	}
	
	public double reducir(double menos) {
		if(this.lado-menos>0) {
			return this.lado=this.lado-menos;
		}else {
			return this.lado;
		}
	}
	/*
	public double sumaAreas(Cuadrado cuadrados) {
		this.cuadrados.add(cuadrados);
		double areas=0;
		for (int i=0;i<this.cuadrados.size();i++){
			areas=this.cuadrados.get(i).superficie()+this.cuadrados.get(i+1).superficie();
		}
		return areas;
	}
	
	public double sumaAreas(Triangulo triangulos) {
		this.triangulos.add(triangulos);
		double areas=0;
		for (int i=0;i<this.triangulos.size()-1;i++){
			areas=this.triangulos.get(i).superficie()+this.triangulos.get(i+1).superficie();
		}
		return areas;
	}
	*/
}
