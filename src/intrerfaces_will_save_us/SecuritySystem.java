package intrerfaces_will_save_us;

public class SecuritySystem implements Swichable {
    private boolean on = false;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the SecuritySystem!");
        on = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the SecuritySystem!");
        on = false;
    }
}
