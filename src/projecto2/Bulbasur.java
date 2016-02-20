package projecto2;
/**
 *
 * @author mario
 */
public class Bulbasur extends Pokemon{
    

    public Bulbasur() {
        super("Bulbasur");
    }
    //Metodos

    @Override
    public int ataque2() {//hoja rapida
       int daño=0;
       if(pp2 > 0){
           daño=ataque * 4;}
       return daño;
    }
    
    @Override
    public int ataque3() {//latigo cepa
        int daño=0;
       if(pp3 > 0){
           daño=ataque * 6;}
       return daño;
    }

    @Override
    public int ataque4() {//absorcion
        
       if(pp4 > 0){
           hp=hp+10;}
       return hp;
    } }
