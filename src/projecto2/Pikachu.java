package projecto2;

/**
 *
 * @author mario
 */
public class Pikachu extends Pokemon{
    
    public Pikachu() {
        super("Pikachu");
    }
    //Metodos

    public String getAtaq2() {
        return " Rayo ";
    }

    public String getAtaq3() {
        return " Trueno ";
    }

    public String getAtaq4() {
        return " At.Rapido ";
    }

    @Override
    public int ataque2() {//rayo
       int daño=0;
       
           daño=ataque ;
       return daño;
    }
    
    @Override
    public int ataque3() {//trueno
        int daño=0;
       
           daño=ataque+10 ;
       return daño;
    }

    @Override
    public int ataque4() {//at.rapido
        int daño=0;
       
           daño=ataque +15;
       return daño;
    }
    
    
    
    
}
