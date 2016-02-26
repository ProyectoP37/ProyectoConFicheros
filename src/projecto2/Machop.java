package projecto2;

/**
 *
 * @author jgarciaamor
 */
public class Machop extends Pokemon{
    public Machop() {
        super("Machop");
    }
    //Metodos

    @Override
    public int ataque2() {//Mov. Sismico
       int daño=0;
       if(pp2 > 0){
           daño=ataque * 5;}
       return daño;
    }
    
    @Override
    public int ataque3() {//Tajo Cruzado
        int daño=0;
       if(pp3 > 0){
           daño=ataque * 6;}
       return daño;
    }

    @Override
    public int ataque4() {//Golpe Karate
        int daño=0;
       if(pp4 > 0){
           daño=ataque * 3;}
       return daño;
    }
}
