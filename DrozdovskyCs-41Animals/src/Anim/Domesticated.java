package Anim;

public abstract class Domesticated  {
    private String name;
    private String communication;
    private String movement;
    private String vaccination;



    public Domesticated(String name,String communication,String movement,String vaccination) {
        this.name = name;
        this.communication = communication;
        this.movement = movement;
        this.vaccination = vaccination;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommunication() {
        return this.communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public String getVaccination() {
        return this.vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getMovement() {
        return this.movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public abstract void display();

}





