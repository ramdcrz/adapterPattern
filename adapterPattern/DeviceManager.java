package adapterPattern;

public class DeviceManager {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        // Plug in the outlet
        System.out.println("Plugging in devices:");
        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println(smartphoneAdapter.plugIn());

        System.out.println();
    }
}
