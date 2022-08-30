package taller3.televisores;

public class Control {
	
    private TV tv;
    public int canal1;

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public void canalUp(){
        tv.canalUp();
    }

    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }

    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int canal1){
        tv.setCanal(canal1);
    }

    public void turnOn() {
        tv.turnOn();
    }
    
    public void turnOff() {
        tv.turnOff();
    }
}