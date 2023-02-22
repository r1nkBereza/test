import Anim.*;
import Anim.Pet;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Cat Barsik","Meowing","Yes","Running","Scheduled");
        cat.display();
        Pet dog = new Pet("Dog Bobik","Barking","No","Running","Not scheduled");
        dog.display();
        Cattle cow = new Cattle("Cow Zor'ka","Lowing","No","Walking","Fodder");
        cow.display();
        Cattle pig = new Cattle("Pig Hryusha","Пrunt","Yes","Flying","Pig feed");
        pig.display();
        Predators lion = new Predators("Lion Igor ","Roaring","Yes","Running","Antelope meat");
        lion.display();
        Predators varane = new Predators("Varane Raphael ","Hissing","Yes","Running","Crab and fish meat");
        varane.display();
        Herbivores giraffe = new Herbivores ("Giraffe Zhulya ","Silence","Yes","Walking","Leaves from trees");
        giraffe.display();
        Herbivores goat = new Herbivores("Goat Lionel Messi ","Hissing","No","Walking","Grass");
        goat.display();

    }
}