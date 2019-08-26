package basics;

public class Train {

    protected String model,color;
    protected int speed,topspeed;

    //use empty constractor and create getters and setters

    public Train(){
        speed = 0;

    }

    //getters and setters


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }

    public int speed(){

        return speed;
    }

    //if i want to set arguments in the runner class
    public Train(String model, String color, int topspeed){

        this.model = model;
        this.color = color;
        this.speed = 0;
        this.topspeed = topspeed;
    }

    public  void accelarate(){
        if(speed==topspeed){
            speed = topspeed;
        }else{

            speed++;
        }


    }




    public int distance (int time){

            int distance =  speed*time;
            return distance;
    }

    public void palaLila(){

        if(speed==topspeed){

            System.out.println("popopopo");
        }else{

            System.out.println("trr");
        }
    }



}
