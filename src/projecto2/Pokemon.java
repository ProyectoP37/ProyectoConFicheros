package projecto2;

/**
 *
 * @author mario
 */
public abstract class Pokemon {
    
    protected int ataque,nivel,hp;//Estas son las estadisticas y ataques que uede realizar el pokemon.
    protected String nombrePoke;
    //Constructor
    public Pokemon(String nombrePoke) {
        
        nivel= (int)(5);//Math.random()*20)+1;//Le sumo 1 para tener como minimo el nivel 1.
        int vida=nivel*10;
        this.ataque = nivel+20;
        //this.defensa = nivel*2;
        this.hp = vida;
        
        this.nombrePoke = nombrePoke;
    }

    public int getAtaque() {
        return ataque;
    }

   /* public int getDefensa() {
        return defensa;
    }*/

    public int getNivel() {
        return nivel;
    }

    public int getHp() {
        return hp;
    }

    public String getNombrePoke() {
        return nombrePoke;
    }
    //Los ataques deben tener el pp mayor que 0 sino no se realizara ningun ataque.
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
        return " Un "+ nombrePoke + " , Nivel=" + nivel + " , Hp=" + hp;
    }
    

    



}
