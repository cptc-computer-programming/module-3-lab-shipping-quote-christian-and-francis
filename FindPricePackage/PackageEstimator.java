package FindPricePackage;

public class PackageEstimator {
    public static void main(String[] args) {
        // declare a "constant" for weight
        double weight = 10;
        // we simulate as we to giving input of package weight
        getWeightPackage(weight);
        
        // declare a "constant" for length
        int length = 5;
        // simulate as were getting input for the length of the package
        getLengthPackage(length);

        // our "constant" for width
        int width = 5;
        // getting input for width of the package
        getWidthPackage(width);

        // constant for height
        int height = 5;
        // call our method
        getHeightPackage(height);

        // call our final price (currently not accurate)
        double finalPrice = getFinalPrice(weight, length, width, height);
    }

    // this method is to "get" the users package weight
    public static double getWeightPackage(double weight) {
        System.out.println("Your package weight: " + weight + "lbs");
        return weight;
    }

    // method to get 
    public static int getLengthPackage(int length) {
        System.out.println("Your package length: " + length + "inches");
        return length;
    }

    public static int getWidthPackage(int width){
        System.out.println("Your packadge width: " + width + "inches");
        return width;
    }

    public static int getHeightPackage(int height) {
        System.out.println("Your package height: " + height + "inches");
        return height;
    }

    // method to collect all of the measurements and use a formula to get the price.(Currently not correct, needs correct formula)
    public static double getFinalPrice(double weight, double length, double width, double height) {
        double finalCost = weight * (length * width * height);
        System.out.println("Final price: " + finalCost);
        return finalCost;

    }

}