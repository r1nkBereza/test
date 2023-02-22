package Anim;

public abstract class Wild {
    private String name;
    private String communication;
    private String movement;
    private String gregariousness;

    public Wild(String name,String communication,String movement,String gregariousness){
        this.name = name;
        this.communication = communication;
        this.movement = movement;
        this.gregariousness = gregariousness;
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

    public String getGregariousness() {
        return this.gregariousness;
    }

    public void setGregariousness(String gregariousness) {
        this.gregariousness = gregariousness;
    }

    public String getMovement() {
        return this.movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public abstract void display();

}



