package projecto2;
/**
 *
 * @author jgarciaamor
 */

public class Ekans extends Pokemon{
    public Ekans() {
        super("Ekans");
    }
    //Metodos

    @Override
    public int ataque2() {//Mordisco
       int daño=0;
       
           daño=ataque +14;
       return daño;
    }
    
    @Override
    public int ataque3() {//Acido
        int daño=0;
       
           daño=ataque +16;
       return daño;
    }

    @Override
    public int ataque4() {//Picotazo ven.
        int daño=0;
       
           daño=ataque +9;
       return daño;
    }
    
}
