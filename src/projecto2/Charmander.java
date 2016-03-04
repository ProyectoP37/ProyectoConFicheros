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

