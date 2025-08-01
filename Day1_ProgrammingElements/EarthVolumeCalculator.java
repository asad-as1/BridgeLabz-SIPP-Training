
public class EarthVolumeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    double radiusKm = 6378.0;

	        double kmToMiles = 0.621371;

	        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

	        double radiusMiles = radiusKm * kmToMiles;

	        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

	        // Print the result
	        System.out.printf("The volume of Earth in cubic kilometers is %.2f km³%n", volumeKm3);
	        System.out.printf("The volume of Earth in cubic miles is %.2f mi³%n", volumeMiles3);

	}

}
