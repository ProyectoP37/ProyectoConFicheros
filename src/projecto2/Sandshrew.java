package projecto2;
/**
 *
 * @author jgarciaamor
 */
public class Sandshrew extends Pokemon{
    
    public Sandshrew() {
        super("Sandshrew");
    }
    //Metodos

    public String getAtaq2() {
        return " Excavar ";
    }

    public String getAtaq3() {
        return " Terremoto ";
    }

    public String getAtaq4() {
        return " Arañazo ";
    }

    @Override
    public int ataque2() {//Excavar
       int daño=0;
       
           daño=ataque +14;
       return daño;
    }
    
    @Override
    public int ataque3() {//Terremoto
        int daño=0;
       
           daño=ataque +18;
       return daño;
    }

    @Override
    public int ataque4() {//Arañazo
        int daño=0;
      
           daño=ataque +12;
       return daño;
    }
    
}
