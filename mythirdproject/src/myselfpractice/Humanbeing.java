package myselfpractice;

  public class Humanbeing{
//	Create a class named HumanBeing with two constructors: 
//		class variables (weight, height, and bmi) and setter and getter methods.


		private float weight ;
		private float height;
		private float bmi;
	public abstract Humanbeing(float weight,float height,float bmi);
	{
		this.weight= weight;
		this .height = height;
		this.bmi = bmi;
	}
	public Humanbeing ()
	{
	}
	public float getWeight() {
	return weight;
	}
	public void setweight (float weight) {
		this.weight= weight;
	}
	public float getHeight() {
		return height;
	}
	public void setheight(float height)	{
		this.height=height;
	}
	public float getBmi() {
		return bmi;
	}
	public void setbmi(float bmi) {
		this.bmi= bmi;
		
		
	
		
	}
	
	
		
	}

	}

}
