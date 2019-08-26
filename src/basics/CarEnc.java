package basics;
//this for global values

public class CarEnc {

    private  String make,car,model,color,BodyType;

    private int  engineCC,id,passengers,speed,topSpeed;

    public CarEnc(String make, String car, String model, String color, String bodyType, int engineCC, int id, int passengers, int speed, int topSpeed) {
        this.make = make;
        this.car = car;
        this.model = model;
        this.color = color;
        BodyType = bodyType;
        this.engineCC = engineCC;
        this.id = id;
        this.passengers = passengers;
        this.speed = speed;
        this.topSpeed = topSpeed;
    }

    public CarEnc() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

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

    public String getBodyType() {
        return BodyType;
    }

    public void setBodyType(String bodyType) {
        BodyType = bodyType;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;

    }

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

}
