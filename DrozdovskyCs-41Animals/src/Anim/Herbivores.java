package Anim;

public class Herbivores  extends Wild{
    private String hfood;

    public Herbivores(String name,String communication,String gregariousness,String movement,String food){
        super(name,communication,movement,gregariousness);
        this.hfood = food;
    }


    public void display(){
        System.out.printf("Animal Name: %s \t How does it communicate: %s\t Is it gregariousness: %s \t How does it move: %s \t How does it eat: %s \n ", super.getName(),super.getCommunication(),super.getGregariousness() ,super.getMovement(),this.hfood);
    }
}

