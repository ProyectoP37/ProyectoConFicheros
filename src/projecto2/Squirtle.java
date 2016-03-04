package projecto2;
/**
 *
 * @author jgarciaamor
 */

public class Squirtle extends Pokemon{
       
    public Squirtle() {
        super("Squirtle");
    }
    //Metodos

    public String getAtaq2() {
        return " Rayo Burbuja ";
    }

    public String getAtaq3() {
        return " Pistola Agua ";
    }

    public String getAtaq4() {
        return " Mordisco ";
    }

    @Override
    public int ataque2() {//Rayo burbuja
       int daño=0;
      
           daño=ataque +16;
       return daño;
    }
    
    @Override
    public int ataque3() {//Pistola Agua
        int daño=0;
      
           daño=ataque +12;
       return daño;
    }

    @Override
    public int ataque4() {//Mordisco
        int daño=0;
       
           daño=ataque +13;
       return daño;
    }
    
    
    
}
