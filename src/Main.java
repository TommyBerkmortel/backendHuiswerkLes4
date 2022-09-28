public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 120, 250, "elektrick", "pika pika", "pokebrocks", "yellow", "runs");
        FirePokemon charmander = new FirePokemon("Charmander", 60, 200, "fire", "charmander char", "fireballs", "red", 1200);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 40, 100, "water", "squirtle squirtle", "fish", "salt", 20);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 125, 300, "grass", "bulba, bulbasaur", "grass", "fire", 130);


        pikachu.eats();
        pikachu.speaks();
        pikachu.thunderPunch();

        charmander.eats();
        charmander.speaks();
        charmander.flameThrower();

        squirtle.eats();
        squirtle.speaks();
        squirtle.hydroPump();

        bulbasaur.eats();
        bulbasaur.speaks();
        bulbasaur.solarBeam();
    }
}


