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

    @Override
    public int ataque2() {//Confusion
       int daño=0;
       if(pp2 > 0){
           daño=ataque +14;}
       return daño;
    }
    
    @Override
    public int ataque3() {//Psiquico
        int daño=0;
       if(pp3 > 0){
           daño=ataque +17;}
       return daño;
    }

    @Override
    public int ataque4() {//Golpe Cabeza
        int daño=0;
       if(pp4 > 0){
           daño=ataque +12;}
       return daño;
    }
    
}
