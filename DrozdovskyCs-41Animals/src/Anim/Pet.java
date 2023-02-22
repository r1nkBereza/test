package Anim;

public class Pet extends Domesticated{
    private String pfood;

    public Pet(String name,String communication,String vaccination,String movement,String food){
        super(name,communication,movement,vaccination);
        this.pfood = food;
    }


    public void display(){
        System.out.printf("Animal Name: %s \t How does it communicate: %s\t Is it vaccinated: %s \t How does it move: %s \t How does it eat: %s \n ", super.getName(),super.getCommunication(),super.getVaccination() ,super.getMovement(),this.pfood);
    }
}
