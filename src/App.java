import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Perro perro1 = new Perro ("Pepe", 4, "Alza la pata");
        Perro perro2= new Perro ("Sasha",3,"Sentada");
        Perro perro3 = new Perro("Axel",2,"Parado");        
        Perro perro4 = new Perro("Trosky",3,"Sentado");        
        Perro perro5 = new Perro("Manchis",8,"Parado");        
        Perro perro6 = new Perro("Melquiades",4,"Sentado");
        System.out.println(perro1.getNombre());
        System.out.println(perro2.getNombre());
        JOptionPane.showMessageDialog(null, "Misiontic", "Un titulo", JOptionPane.ERROR_MESSAGE);
        System.out.println(perro1.getFormaDeAlimentacion());

        //System.out.println(perro1.contadorPerros);
        //System.out.println(perro2.contadorPerros);
        //System.out.println(perro3.contadorPerros);
        System.out.println(Perro.FormaDeDientes);
        System.out.println(Perro.contadorPerros);
        Perro.oler();
        Canino c1 = new Canino("Auuuu","Carnivoro");
        System.out.println(c1.getAullar());


        Perro2 perrito = new Perro2();
        perrito.setAullan("Wofff");
        System.out.println(perrito.getAullan());
        //ERROR Canino2 c1 = new Canino2();
        perrito.cazar();
    }
}
