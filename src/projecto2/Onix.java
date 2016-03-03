package projecto2;
/**
 *
 * @author jgarciaamor
 */
public class Onix extends Pokemon{
    public Onix() {
        super("Onix");
    }
    //Metodos

    @Override
    public int ataque2() {//Cola ferrea
       int daño=0;
       if(pp2 > 0){
           daño=ataque +14;}
       return daño;
    }
    
    @Override
    public int ataque3() {//Avalancha
        int daño=0;
       if(pp3 > 0){
           daño=ataque +16;}
       return daño;
    }

    @Override
    public int ataque4() {//Golpe roca
        int daño=0;
       if(pp4 > 0){
           daño=ataque +12;}
       return daño;
    }
}
