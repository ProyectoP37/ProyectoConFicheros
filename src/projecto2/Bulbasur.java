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
    
    public int ataque2() {//latigo cepa
        
       int daño=0;
       if(pp2 > 0){
           daño=ataque +15;}
       return daño;
    }
    
    @Override
    public int ataque3() {//hoja afilada
        int daño=0;
       if(pp3 > 0){
           daño=ataque +20;}
       return daño;
    }

    @Override
    public int ataque4() {//drenadoras
        
       if(pp4 > 0){
           hp=hp+10;}
       return hp;
    } }
