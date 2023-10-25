import java.util.Scanner;

public class MainActivity3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many brands they want to input
        System.out.print("Enter the number of brands: ");
        int numBrands = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the brands
        CarBrand[] brands = new CarBrand[numBrands];

        // Input the details for each brand and store them in the array
        for (int i = 0; i < numBrands; i++) {
            System.out.println("Enter details for brand #" + (i + 1));
            System.out.print("Brand name: ");
            String brandName = scanner.nextLine();
            System.out.print("Year founded: ");
            int yearFounded = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Headquarters location: ");
            String headquartersLocation = scanner.nextLine();
            System.out.print("Is it a luxury brand? (true/false): ");
            boolean isLuxury = scanner.nextBoolean();
            scanner.nextLine(); // Consume the newline character

            if (isLuxury) {
                brands[i] = new LuxuryCarBrand(brandName, yearFounded, headquartersLocation, true);
            } else {
                brands[i] = new CarBrand(brandName, yearFounded, headquartersLocation);
            }
        }

        // Print the details of each brand
        for (int i = 0; i < numBrands; i++) {
            System.out.println(brands[i].toString());
        }

        scanner.close();
    }
}