package projecto2;

/**
 *
 * @author mario
 */
public abstract class Pokemon {
    
    protected int ataque,nivel,hp;//Estas son las estadisticas y ataques que uede realizar el pokemon.
    protected String nombrePoke;
    protected String ataq2,ataq3,ataq4;
    //Constructor
    public Pokemon(String nombrePoke) {
        
        nivel= (int) (Math.random()*10)+1;//Le sumo 1 para tener como minimo el nivel 1.
       
        this.ataque = nivel+20;
     
        this.hp = nivel*10;
        
        this.nombrePoke = nombrePoke;
    }
   
    
    public String getAtaq2() {
        return ataq2;
    }

    public String getAtaq3() {
        return ataq3;
    }

    public String getAtaq4() {
        return ataq4;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getNivel() {
        return nivel;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    

    public String getNombrePoke() {
        return nombrePoke;
    }
    
    //Ataque1 va a ser placaje para todos los pokemons y quita de dañ lo mismo que tega de ataque el pokemon
    public int placaje(){
		int daño = 0;
		
		
			daño = ataque;
		
		return daño;
	}
    public int dañoRecibido(int daño){
        if((daño)>0)
            hp-=(daño);
        return hp;
    }
   //Sera sobreescrito
    public abstract int ataque2();
    public abstract int ataque3();
    public abstract int ataque4();
    

    @Override
    public String toString() {
        return  nombrePoke + " , Nivel: " + nivel + " Ataque "+ataque + " , Hp: "+ hp;
    }
    

    



}
