package app.modules;

public class Car {
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("Electricity is started");
    }

    private void startCommand(){
        System.out.println("Command is started");
    }

    private void startFuelSystem(){
        System.out.println("FuelSystem is started");
    }
}
