package projecto2;

/**
 *
 * @author jgarciaamor
 */
public class Drowzee extends Pokemon{
    
    public Drowzee() {
        super("Drowzee");
    }
    //Metodos
    public String getAtaq2() {
        return " Confusión ";
    }

    public String getAtaq3() {
        return " Psiquico ";
    }

    public String getAtaq4() {
        return " Golpe Cabeza ";
    }
    @Override
    public int ataque2() {//Confusion
       int daño=0;
       
           daño=ataque +14;
       return daño;
    }
    
    @Override
    public int ataque3() {//Psiquico
        int daño=0;
       
           daño=ataque +17;
       return daño;
    }

    @Override
    public int ataque4() {//Golpe Cabeza
        int daño=0;
      
           daño=ataque +12;
       return daño;
    }
    
}
