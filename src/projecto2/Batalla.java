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
        int aux = (int)(Math.random() * 9);
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
        JOptionPane.showMessageDialog(null,"Ha aparecido un: "+pokenemigo.toString()+" salvaje");
        pokmio = elige();
        int vida1=pokmio.getHp();
        int vida2=pokenemigo.getHp();
        
        do{
           
        mipelea();
        supelea();
        if(pokenemigo.getHp()>0){
            JOptionPane.showMessageDialog(null,pokenemigo.toString());}
        else{JOptionPane.showMessageDialog(null,"Has derrotado a "+pokenemigo.getNombrePoke());
       int nuevNiv=pokmio.getNivel();
        pokmio.setNivel(nuevNiv+1);
        JOptionPane.showMessageDialog(null,pokmio.getNombrePoke()+" Ha subido al nivel"+pokmio.getNivel());
        yo.capturarPokemon(pokenemigo);
        break;}
        if(pokmio.getHp()>0){
            JOptionPane.showMessageDialog(null,pokmio.toString());}
        else{JOptionPane.showMessageDialog(null,pokenemigo.getNombrePoke()+" Te ha derrotado ");}
        
        }
        while (pokmio.getHp() > 0 && pokenemigo.getHp() > 0);
        pokmio.setHp(vida1);
        pokenemigo.setHp(vida2);
        
       }

    public void mipelea() {
       
        int opcion;
        
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija un ataque:\n1. Placaje.\n2." + pokmio.getAtaq2() + "\n"
                        + "3." + pokmio.getAtaq3() + "\n4." + pokmio.getAtaq4()));

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

        } 
  
    public void supelea(){
        int opcion;
                   
             opcion = (int) (Math.random() * 4)+1;

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

       
    }
    public Pokemon elige() {
        yo.mostrarMochila();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige tu pokemon: "));
        return yo.elegirPokemon(opcion-1);

    }
}
