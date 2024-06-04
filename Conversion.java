public class Conversion {

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s | %-10s%-10s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("-------------------------------------------");

        for (double foot = 1.0; foot <= 10.0; foot++) {
            double meter = 20.0 + (foot - 1) * 5.0;
            System.out.printf("%-10.1f%-10.3f | %-10.1f%-10.3f\n", 
                foot, footToMeter(foot), meter, meterToFoot(meter));
        }
    }
}
