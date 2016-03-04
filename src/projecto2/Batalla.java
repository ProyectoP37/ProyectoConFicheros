package projecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Batalla {

    //Nuevo Github

    private Entrenador yo;
    private Pokemon pokenemigo, pokmio;

    public Batalla(Entrenador yo) {
        this.yo = yo;
    }

    public void comienza() {
        int aux = (int) (0);//Math.random() * 9);
        switch (aux) {
            case 0:
                pokenemigo = new Charmander();
                break;
            case 1:
                pokenemigo = new Bulbasur();
                break;
            case 2:
                pokenemigo = new Squirtle();
                break;
            case 3:
                pokenemigo = new Ekans();
                break;
            case 4:
                pokenemigo = new Gastly();
                break;
            case 5:
                pokenemigo = new Machop();
                break;
            case 6:
                pokenemigo = new Onix();
                break;
            case 7:
                pokenemigo = new Sandshrew();
                break;
            case 8:
                pokenemigo = new Pikachu();
                break;
            case 9:
                pokenemigo = new Drowzee();
                break;
        }
        JOptionPane.showMessageDialog(null,"Ha aparecido :"+pokenemigo.toString()+" salvaje");
        pokmio = elige();
        //JOptionPane.showMessageDialog(null,pokenemigo.toString());
        do{
           // JOptionPane.showMessageDialog(null,pokenemigo.toString());
            //JOptionPane.showMessageDialog(null,pokmio.toString());
        mipelea();
        supelea();
        if(pokenemigo.getHp()>0){
            JOptionPane.showMessageDialog(null,pokenemigo.toString());}
        else{JOptionPane.showMessageDialog(null,"Has derrotado a"+pokenemigo.getNombrePoke());
        yo.capturarPokemon(pokenemigo);
        break;}
        if(pokmio.getHp()>0){
            JOptionPane.showMessageDialog(null,pokmio.toString());}
        else{JOptionPane.showMessageDialog(null,pokenemigo.getNombrePoke()+" Te ha derrotado ");}
        
        }
        while (pokmio.getHp() > 0 && pokenemigo.getHp() > 0);
        /*if(pokenemigo.getHp()<=0)
            yo.capturarPokemon(pokenemigo);*/
        
       }

    public void mipelea() {
        // boolean disponible = true;
        int opcion;
        //do {
           // JOptionPane.showMessageDialog(null,pokenemigo.toString());
           // JOptionPane.showMessageDialog(null,pokmio.toString());
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija un ataque:\n1. Placaje.\n2. " + pokmio.ataque2() + "\n"
                        + "3. " + pokmio.ataque3() + "\n4. " + pokmio.ataque4()));

            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1:
                    pokenemigo.dañoRecibido(pokmio.placaje());
                    break;
                case 2:
                    pokenemigo.dañoRecibido(pokmio.ataque2());
                    break;
                case 3:
                    pokenemigo.dañoRecibido(pokmio.ataque3());
                    break;
                case 4:
                    pokenemigo.dañoRecibido(pokmio.ataque4());
                    break;
            }

        } //while (pokmio.getHp() > 0 && pokenemigo.getHp() > 0);
  //  }
    public void supelea(){
        int opcion;
       // do {
          // JOptionPane.showMessageDialog(null,pokenemigo.toString());
            //JOptionPane.showMessageDialog(null,pokmio.toString());
            
             opcion = (int) (Math.random() * 4);

            switch (opcion) {
                case 1:
                    pokmio.dañoRecibido(pokenemigo.placaje());
                    break;
                case 2:
                    pokmio.dañoRecibido(pokenemigo.ataque2());
                    break;
                case 3:
                    pokmio.dañoRecibido(pokenemigo.ataque3());
                    break;
                case 4:
                    pokmio.dañoRecibido(pokenemigo.ataque4());
                    break;
            }

       // } while (pokmio.getHp() > 0 && pokenemigo.getHp() > 0);
    }
    public Pokemon elige() {
        yo.mostrarMochila();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige tu pokemon: "));
        return yo.elegirPokemon(opcion-1);

    }
}
