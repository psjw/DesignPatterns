package _01_Facade.ex1;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        Lights lights = new Lights();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartHomeFacade smartHome
                = new SmartHomeFacade(thermostat, lights, coffeeMaker);

        smartHome.wakeUp();
        smartHome.leaveHome();
    }
}