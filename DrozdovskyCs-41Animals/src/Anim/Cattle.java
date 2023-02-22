package Anim;

public class Cattle extends Domesticated{
    private String cfood;

    public Cattle(String name, String communication, String vaccination, String movement,String food)  {
        super(name,communication,vaccination,movement);
        this.cfood = food;
    }

    public void display(){
        System.out.printf("Animal Name: %s \t How does it communicate: %s\t Is it vaccinated: %s \t How does it move: %s \t How does it eat: %s \n ", super.getName(),super.getCommunication(),super.getMovement() ,super.getVaccination(),this.cfood);
    }
}



