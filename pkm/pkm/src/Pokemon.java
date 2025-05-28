public class Pokemon {
    protected int id;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected String tipo;
    protected int entrenadorId;

    public Pokemon(int id, String nombre, int nivel, int hp, int ataque, int defensa, int velocidad, String tipo, int entrenadorId) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.entrenadorId = entrenadorId;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getHp() { return hp; }
    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }
    public int getVelocidad() { return velocidad; }
    public String getTipo() { return tipo; }
    public int getEntrenadorId() { return entrenadorId; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public void setHp(int hp) { this.hp = hp; }
    public void setAtaque(int ataque) { this.ataque = ataque; }
    public void setDefensa(int defensa) { this.defensa = defensa; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setEntrenadorId(int entrenadorId) { this.entrenadorId = entrenadorId; }

    public double calcularPotencialAtaque() {
        return ataque * 1.5 + velocidad * 0.5;
    }
}
