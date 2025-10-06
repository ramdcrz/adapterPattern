package adapterPattern;

public class DeviceManager {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        PowerOutlet laptopFunction = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refFunction = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet chargerFunction = new SmartphoneAdapter(smartphoneCharger);

        // Plug in the outlet
        System.out.println("Plugging in devices:");
        System.out.println(laptopFunction.plugIn());
        System.out.println(refFunction.plugIn());
        System.out.println(chargerFunction.plugIn());

        System.out.println();
    }
}