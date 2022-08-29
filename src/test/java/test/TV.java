package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal= 1;
	private int precio= 500;
	private boolean estado;
	private int volumen= 1;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
		numTV+= 1;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal ) {
		if(estado==true && (canal >=1 && canal <= 120)){
		this.canal = canal;
		}
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	
	public int getVolumen() {
		return volumen;
	}
	
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void turnOn() {
		estado= true;
	}
	
    public void turnOff() {
	    estado= false;
	}
    
	
   public void canalUp() {
		if(this.estado==true && this.canal< 120) {
			this.canal += 1;
			
		}
	}
	
	public void canalDown() {
		if(this.estado==true && this.canal> 1) {
			this.canal -= 1 ;
			}
	}
	
	public void volumenUp() {
		if(this.estado==true && this.canal<= 7) {
			this.volumen += 1 ;
			
		}
	}
	
	public void volumenDown() {
		if(this.estado==true && this.volumen> 0) {
			this.volumen -= 1 ;
			
		}
	}
    
    
}
