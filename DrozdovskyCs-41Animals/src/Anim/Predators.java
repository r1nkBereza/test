package Anim;

public class Predators extends Wild{
    private String prfood;

    public Predators(String name,String communication,String gregariousness,String movement,String food){
        super(name,communication,movement,gregariousness);
        this.prfood = food;
    }


    public void display(){
        System.out.printf("Animal Name: %s \t How does it communicate: %s\t Is it gregariousness: %s \t How does it move: %s \t How does it eat: %s \n ", super.getName(),super.getCommunication(),super.getGregariousness() ,super.getMovement(),this.prfood);
    }
}


