public class Empleado {

    String nombre;
    int horasT;
    int hExt; //Horas extras
    double vhr; //valor por hora regular

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getHorasT() {
        return horasT;
    }
    public void setHorasT(int ht) {
        this.horasT = ht;
    }


    public int getHExt() {
        return hExt;
    }
    public void setHExt(int het) {
        this.hExt = het;
    }


    public double getVhr() {
        return vhr;
    }
    public void setVhr(double pph) {
        this.vhr = pph;
    }

public double pagoTotal(){
       return (this.horasT*this.vhr)+(((vhr*0.5)+vhr)*this.hExt);
}

public String categoriaSalarial(){
    double total = this.pagoTotal();
    if(total>5000){
        return "ALTO";
    }else if(total<5000 && total>3000){
        return "MEDIO";
    }else{
        return "BAJO";
    }
}
}
