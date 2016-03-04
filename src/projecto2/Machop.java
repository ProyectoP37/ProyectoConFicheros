package projecto2;

/**
 *
 * @author jgarciaamor
 */
public class Machop extends Pokemon{
    public Machop() {
        super("Machop");
    }
    //Metodos

    @Override
    public int ataque2() {//Ultrapuño
       int daño=0;
       
           daño=ataque +15;
       return daño;
    }
    
    @Override
    public int ataque3() {//Tajo Cruzado
        int daño=0;
       
           daño=ataque +16;
       return daño;
    }

    @Override
    public int ataque4() {//Golpe Karate
        int daño=0;
       
           daño=ataque +14;
       return daño;
    }
}
