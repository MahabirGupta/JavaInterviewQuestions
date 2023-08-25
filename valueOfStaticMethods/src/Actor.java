// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Actor {

    public void act(){
        System.out.println("Act");
    }
    public static void main(String[] args) {

        Actor actor1 = new Comedian();
        Actor actor2 = new Hero();
        actor1.act();
        Hero hero = new Hero();
        hero.fight();
        hero.act();
    }

}

