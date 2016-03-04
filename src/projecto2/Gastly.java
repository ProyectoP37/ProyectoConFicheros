package projecto2;

/**
 *
 * @author jgarciaamor
 */
public class Gastly extends Pokemon{
    public Gastly() {
        super("Gastly");
    }
    //Metodos

    @Override
    public int ataque2() {//Pulso umbrio
       int daño=0;
       
           daño=ataque +14;
       return daño;
    }
    
    @Override
    public int ataque3() {//Bola Sombra
        int daño=0;
       
           daño=ataque +17;
       return daño;
    }

    @Override
    public int ataque4() {//Tinieblas
        int daño=0;
       
           daño=ataque +13;
       return daño;
    }
}
