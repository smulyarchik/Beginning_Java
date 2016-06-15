public class Ex4{
	public static void main(String[] args){
		// The diameter of the sun is approximately 865000 miles.
		final int sunDiameter = 865000;
		// The diameter of Earch is approximately 7600 miles.
		final int earchDiameter = 7600;
		// Calculate:
		// The volumee of Earch in cubic miles.
		int radius = earchDiameter / 2;
		double earthVolume = Math.pow(radius, 3) * (double)(4/3) * Math.PI;
		System.out.println("Earth volume is: " + earthVolume);
		// The volume of the sun in cubic miles.
		radius = sunDiameter / 2;
		double sunVolume = Math.pow(radius, 3) * (double)(4/3) * Math.PI;
		System.out.println("Sun volume is: " + sunVolume);
		// The ratio of the volume of the sun to the volume of Earch.
		double ratio = sunVolume / earthVolume;
		System.out.println("Ration of sun/Earth volume is: " + ratio);
	}
}