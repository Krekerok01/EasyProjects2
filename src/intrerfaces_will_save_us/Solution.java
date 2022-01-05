package intrerfaces_will_save_us;

public class Solution {
    public static void main(String[] args) {
        Swichable swichable = new SecuritySystem();
        ElectricPowerSwitch electricPowerSwitch = new ElectricPowerSwitch(swichable);
        electricPowerSwitch.press();
        electricPowerSwitch.press();
    }
}
