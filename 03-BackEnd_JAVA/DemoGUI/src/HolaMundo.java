public class HolaMundo {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Bienvenidos a la mision backend de java.", "Montserrat",28,Colors.CYAN);
        screen.setVisible(true);
        str = d.readString("¿Quieres aprender a hacer esto?: s/n");
        if (str.charAt(0) == 'S' || str.charAt(0) == 's'){
            screen.showImage("jett.png");
            screen.out("Hola Exploreres.");
        }else {
            screen.out("Tal vez en otro momento...", "Montserrat",28, Colors.cyan);
        }
    }
}
