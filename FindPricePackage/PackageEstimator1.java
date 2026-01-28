package FindPricePackage;

public class PackageEstimator1 {

    public static void main(String[] args) {

        // Données du colis (simulation d'entrée utilisateur)
        double weight = 10;     // poids en livres
        double length = 5;      // longueur en pouces
        double width = 5;       // largeur en pouces
        double height = 5;      // hauteur en pouces

        // Affichage des informations du colis
        getWeightPackage(weight);
        getLengthPackage(length);
        getWidthPackage(width);
        getHeightPackage(height);

        // Calcul du prix final
        double finalPrice = getFinalPrice(weight, length, width, height);

        System.out.println("Total shipping price: " + finalPrice + " $");
    }

    // 1️⃣ Affiche et retourne le poids du colis
    public static double getWeightPackage(double weight) {
        System.out.println("Package weight: " + weight + " lbs");
        return weight;
    }

    // 2️⃣ Affiche et retourne la longueur
    public static double getLengthPackage(double length) {
        System.out.println("Package length: " + length + " inches");
        return length;
    }

    // 3️⃣ Affiche et retourne la largeur
    public static double getWidthPackage(double width) {
        System.out.println("Package width: " + width + " inches");
        return width;
    }

    // 4️⃣ Affiche et retourne la hauteur
    public static double getHeightPackage(double height) {
        System.out.println("Package height: " + height + " inches");
        return height;
    }

    // 5️⃣ Calcule le volume du colis
    public static double getVolume(double length, double width, double height) {
        return length * width * height;
    }

    // 6️⃣ Calcule le coût basé sur la taille (racine carrée du volume)
    public static double getSizeCost(double volume) {
        double sizeRate = 0.5;
        return Math.sqrt(volume) * sizeRate;
    }

    // 7️⃣ Calcule le coût basé sur le poids
    public static double getWeightCost(double weight) {
        double weightRate = 2.0;
        return weight * weightRate;
    }

    // 8️⃣ Calcule le prix final d’expédition
    public static double getFinalPrice(double weight, double length, double width, double height) {

        double baseFee = 10.0; // frais de base

        double volume = getVolume(length, width, height);
        double sizeCost = getSizeCost(volume);
        double weightCost = getWeightCost(weight);

        double finalCost = baseFee + sizeCost + weightCost;

        return finalCost;
    }
}
