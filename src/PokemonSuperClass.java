public abstract class PokemonSuperClass {

    // private variabellen
    private String name;
    private int level;
    private int hp;
    private String type;
    private String sound;
    private String food;

    // constructor
    public PokemonSuperClass(String name, int level, int hp, String type, String sound, String food) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.type = type;
        this.sound = sound;
        this.food = food;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }
    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFood(String food) {
        this.food = food;
    }

    // methods
    public abstract void eats();
    public abstract void speaks();


}


