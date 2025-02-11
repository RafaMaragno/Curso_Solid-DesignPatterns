abstract class Vehicle {
    void move();
}

abstract class FuelVehicle extends Vehicle {
    void refuel();
}

abstract class EletricVehicle extends Vehicle {
    void charge();
}

class EletricCar extends EletricVehicle {
    @override
    void charge() {
        print('Charging battery...');
    }
    @override
    void move() {
        print('Moving...');
    }
}

class PetrolCar extends FuelVehicle {
    @override
    void refuel() {
        print('Refilling the petrol...');
    }
    @override
    void move() {
        print('Moving...');
    }
}

void serviceEletricVehicle(EletricVehicle vehicle) {
    vehicle.charge();
    // Some more servicing activities
}

void serviceFuelVehicle(FuelVehicle vehicle) {
    vehicle.refuel();
    // Some more servicing activities
}