package intrerfaces_will_save_us;

public class ElectricPowerSwitch {
    private Swichable swichable;

    public ElectricPowerSwitch(Swichable swichable) {
        this.swichable = swichable;
    }

    public void press(){
        System.out.println("Pressed the power switch");

        if (swichable.isOn()){
            swichable.turnOff();
        } else {
            swichable.turnOn();
        }
    }
}
