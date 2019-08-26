package basics;

public class Transporter {

    protected   String make,car,model,color,BodyType;

    protected int  engineCC,id,passengers,speed,topSpeed;


    public  void accelarate(){
        if(speed==topSpeed){
            speed = topSpeed;
        }else{

            speed++;
        }


    }


    public void decelerate(){
        if(speed==0){
            speed = 0;
        }else{

            speed--;
        }
    }

    protected
    String getMake() {
        return make;
    }

    protected void setMake(String make) {
        this.make = make;
    }

    protected String getCar() {
        return car;
    }

    protected void setCar(String car) {
        this.car = car;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getBodyType() {
        return BodyType;
    }

    protected void setBodyType(String bodyType) {
        BodyType = bodyType;
    }

    protected int getEngineCC() {
        return engineCC;
    }

    protected void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected int getPassengers() {
        return passengers;
    }

    protected void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    protected int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    protected int getTopSpeed() {
        return topSpeed;
    }

    protected void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}

