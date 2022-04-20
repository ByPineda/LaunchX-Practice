package SEMANA2;
abstract class Sombra{
    abstract void dibujarSombra();

}
class Arma extends Sombra{
    @Override
    void dibujarSombra(){
        System.out.println("Dibujando sombras en el arma.");
    }
}

public class Personaje extends Arma{
    public static void main(String[] args) {
        Sombra flecha = new Personaje();
        Sombra arco = new Arma();
    }
}
