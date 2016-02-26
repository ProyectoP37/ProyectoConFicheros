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
       if(pp2 > 0){
           daño=ataque * 4;}
       return daño;
    }
    
    @Override
    public int ataque3() {//Terremoto
        int daño=0;
       if(pp3 > 0){
           daño=ataque * 8;}
       return daño;
    }

    @Override
    public int ataque4() {//Arañazo
        int daño=0;
       if(pp4 > 0){
           daño=ataque * 2;}
       return daño;
    }
    
}
