package basics;

public class CarInh extends Transporter{

    private int tyres;

    private String VehicleType;

    public CarInh(int tyres, String vehicleType, String make, String car, String model, String color, String bodytype) {
        this.tyres = tyres;
        VehicleType = vehicleType;
        super.make = make;
        super.car = car;
        super.model = model;
        super.color = color;
    }
}
