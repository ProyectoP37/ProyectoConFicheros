package projecto2;
/**
 *
 * @author mario
 */
public class Charmander extends Pokemon{
   
    public Charmander() {
        super("Charmander");
    }
    //Metodos

    public String getAtaq2() {
        return " Ascuas ";
    }

    public String getAtaq3() {
        return " Lanzallamas ";
    }

    public String getAtaq4() {
        return " Arañazo ";
    }

    @Override
    public int ataque2() {//ascuas
       int daño=0;
      
           daño=ataque +14;
       return daño;
    }
    
    @Override
    public int ataque3() {//lanzallamas
        int daño=0;
     
           daño=ataque +16;
       return daño;
    }

    @Override
    public int ataque4() {//arañazo
        int daño=0;
      
           daño=ataque +10;
       return daño;
    }
    
    
    
    
}

