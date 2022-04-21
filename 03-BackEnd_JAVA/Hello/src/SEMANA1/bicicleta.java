package SEMANA1;

public class bicicleta {
//    CHARACTERISTICS
    public int pins, rodada;
    public double velocidad;
    public String color;


    public double getVelocidad(){return velocidad;}
    public double getPins(){return pins;}
    public double getRodada(){return rodada;}
    public String getColor(){return color;}

    public boolean setPins(int pins) {
        if (pins >0){
            this.pins = pins;
            return true;
        } else
            return false;
    }
    public boolean setRodada(int rodada) {
        if (rodada >0){
            this.rodada = rodada;
            return true;
        } else
            return false;
    }
    public boolean setVelocidad(double velocidad) {
        if (velocidad >=0){
            this.velocidad = velocidad;
            return true;
        } else
            return false;
    }
    public boolean setColor(String color){
        if (!color.isEmpty()){
            this.color = color;
            return  true;
        } else
            return false;
    }
    // HASTA ACÁ ESTO ES UNA CLASE PURA, SOLO CON LO NECESARIO PARA FUNCIONAR ESCENCIALMENTE
    // DESPUÉS SON AÑADIDOS


    @Override
    public String toString() {
        return "bicicleta{" +
                "pins=" + pins +
                ", rodada=" + rodada +
                ", velocidad=" + velocidad +
                ", color=" + color +
                '}';
    }
}
