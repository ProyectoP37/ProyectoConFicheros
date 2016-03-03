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

    @Override
    public int ataque2() {//Rayo burbuja
       int daño=0;
       if(pp2 > 0){
           daño=ataque +14;}
       return daño;
    }
    
    @Override
    public int ataque3() {//Pistola Agua
        int daño=0;
       if(pp3 > 0){
           daño=ataque +15;}
       return daño;
    }

    @Override
    public int ataque4() {//Mordisco
        int daño=0;
       if(pp4 > 0){
           daño=ataque +13;}
       return daño;
    }
    
    
    
}
