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

    public String getAtaq2() {
        return " Látigo Cepa ";
    }

    public String getAtaq3() {
        return " Hoja Afilada ";
    }

    public String getAtaq4() {
        return " Corte ";
    }

    @Override
    
    public int ataque2() {//latigo cepa
        
       int daño=0;
       
           daño=ataque +15;
       return daño;
    }
    
    @Override
    public int ataque3() {//hoja afilada
        int daño=0;
       
           daño=ataque +20;
       return daño;
    }

    @Override
    public int ataque4() {//corte
        
       int daño=0;
       
           daño=ataque +13;
       return daño;
    } }
