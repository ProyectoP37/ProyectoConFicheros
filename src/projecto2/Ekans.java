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
       if(pp2 > 0){
           daño=ataque * 4;}
       return daño;
    }
    
    @Override
    public int ataque3() {//Acido
        int daño=0;
       if(pp3 > 0){
           daño=ataque * 6;}
       return daño;
    }

    @Override
    public int ataque4() {//Picotazo ven.
        int daño=0;
       if(pp4 > 0){
           daño=ataque * 1;}
       return daño;
    }
    
}
