interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    public Vehicle createVehicle(){
        Vehicle myCar = new Car();
        return myCar;
    }
}

class BikeFactory extends VehicleFactory {
   public Vehicle createVehicle(){
        Vehicle myCar = new Bike();
        return myCar;
    }
}

class TruckFactory extends VehicleFactory {
     public Vehicle createVehicle(){
        Vehicle myCar = new Truck();
        return myCar;
    }
}
