package myselfpractice;

public class EncapsulationExample {
	public static void main (String[]args) {
		Humanbeing h1= new Humanbeing();
		h1.setheight=(1.65f);
		h1.setweight=(68);
		h1.setbmi(calculatebmi(h1));
	System.out.println(" person has"+ h1.getweight + " kgs and is" + h1.getheight() + "meters in heights which result Bmi" 
			+ h1.getbmi);

	   public static float calculateBmi(HumanBeing h1){
	       return h1.getWeight()/(h1.getHeight()*h1.getHeight());
	   }
	

		
		
	}

}
