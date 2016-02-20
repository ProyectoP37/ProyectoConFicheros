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
       if(pp2 > 0){
           daño=ataque * 4;}
       return daño;
    }
    
    @Override
    public int ataque3() {//lanzallamas
        int daño=0;
       if(pp3 > 0){
           daño=ataque * 6;}
       return daño;
    }

    @Override
    public int ataque4() {//arañazo
        int daño=0;
       if(pp4 > 0){
           daño=ataque * 2;}
       return daño;
    }
    
    
    
    
}

