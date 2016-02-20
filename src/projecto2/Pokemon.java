package projecto2;

/**
 *
 * @author mario
 */
public abstract class Pokemon {
    
    protected int ataque,defensa,nivel,hp,pp1,pp2,pp3,pp4;//Estas son las estadisticas y ataques que uede realizar el pokemon.
    protected String nombrePoke;
    //Constructor
    public Pokemon(String nombrePoke) {
        nivel= (int)(Math.random()*15)+1;//Le sumo 1 para tener como minimo el vivel 1.
        this.ataque = nivel*7;
        this.defensa = nivel*2;
        this.hp = nivel*10;
        pp1=10;
        pp2=10;
        pp3=10;
        pp4=10;
        this.nombrePoke = nombrePoke;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public int getHp() {
        return hp;
    }

    public int getPp1() {
        return pp1;
    }

    public void setPp1(int pp1) {
        this.pp1 = pp1;
    }

    public int getPp2() {
        return pp2;
    }

    public void setPp2(int pp2) {
        this.pp2 = pp2;
    }

    public int getPp3() {
        return pp3;
    }

    public void setPp3(int pp3) {
        this.pp3 = pp3;
    }

    public int getPp4() {
        return pp4;
    }

    public void setPp4(int pp4) {
        this.pp4 = pp4;
    }

    public String getNombrePoke() {
        return nombrePoke;
    }
    //Los ataques deben tener el pp mayor que 0 sino no se realizara ningun ataque.
    //Ataque1 va a ser placaje para todos los pokemons y quita de dañ lo mismo que tega de ataque el pokemon
    public int placaje(){
		int daño = 0;
		
		if(pp1 > 0){
			daño = ataque;
		}
		return daño;
	}
    public int dañoRecibido(int daño){
        if((daño-defensa)>0)
            hp-=(daño-defensa);
        return hp;
    }
   //Sera sobreescrito
    public abstract int ataque2();
    public abstract int ataque3();
    public abstract int ataque4();
    

    @Override
    public String toString() {
        return "El Pokemon: "+ nombrePoke + ", nivel=" + nivel + ", hp=" + hp;
    }
    

    



}
