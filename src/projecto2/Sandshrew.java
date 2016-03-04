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
