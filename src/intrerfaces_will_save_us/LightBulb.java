package intrerfaces_will_save_us;

public class LightBulb implements Swichable {
    private boolean on = false;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        System.out.println("The light is on!");
        on  = true;
    }

    @Override
    public void turnOff() {
        System.out.println("The light is off!");
        on  = false;
    }
}
