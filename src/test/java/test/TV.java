/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3.televisores;

/**
 *
 * @author Roger Vera
 */
public class TV {
    Marca marca;
    int canal,precio,volumen;
    boolean estado;
    Control control;
    static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal=1;
        this.volumen=1;
        this.precio=500;
        numTV+=1;
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

    public void setCanal(int canal) {
        if(0<=canal && canal<=120 && getEstado()==true){
            this.canal = canal;
        } 
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }
    
    
    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int numTV){
        TV.numTV=numTV;
    }
    
    public void turnOn(){
        if(getEstado()==false){
            setEstado(true);
        }  
    }
    public void turnOff(){
        if(getEstado()==true){
            setEstado(false);
        }  
    }
    
    public void canalUp(){
        if(0<=getCanal()&& getCanal()<120 && getEstado()==true){
            setCanal(getCanal()+1);
        }   
    }
    public void canalDown(){
        if(0<getCanal()&& getCanal()<=120 && getEstado()==true){
            setCanal(getCanal()-1);
        }   
    }
    public void volumenUp(){
        if(0<=getVolumen()&& getVolumen()<7 && getEstado()==true){
            setVolumen(getVolumen()+1);
        }
    }
    public void volumenDown(){
        if(0<getVolumen()&& getVolumen()<=7 && getEstado()==true){
            setVolumen(getVolumen()-1);
        }
    }
    
    
}
