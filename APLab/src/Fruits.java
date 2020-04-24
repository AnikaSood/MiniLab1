

public class Fruits extends Generics{
	public static final String type = "Fruit";
	public enum KeyType {name, color, taste};
	public static KeyType key = KeyType.name;
	private String name;
	private String color;
	private String taste;
	
	Fruits(String name, String color, String taste)
	{
		this.setType(type);
		this.name = name;
		this.color = color;
		this.taste = taste;
	}
	
	
	
	@Override
	public String toString() {		
		String output="";
		switch(key) {
		case name:
			output += this.name;
			break;
		case color:
			output += this.color;
			break;
		case taste:
			output += this.taste;
			break;
		default:
			output = type + ": " + this.name + ", " + this.color + ", " + this.taste;
		}
		return output;
	}


	public static Generics[] fruitData() {
		Generics[] cc = { 
				new Fruits("Apple", "Red", "Sweet"),
			    new Fruits("Lemon", "Yellow", "Sour"),
			    new Fruits("Orange", "Orange", "Sour"),
			    new Fruits("Mango", "Yellow", "Sweet"),
			    new Fruits("Peach", "Pink", "Sweet"),
			    new Fruits("Blueberry", "Blue", "Sweet"),
			    new Fruits("Blackberry", "Black", "Sour"),
			    new Fruits("Avocado", "Green", "Tasteless"),
			    new Fruits("Tomato", "Red", "Savory"),
			    
		};
		return cc;
	}
	
	public static void main(String[] args)
	{
		Generics[] cc = fruitData();
		for(int i = 0; i < cc.length; i++)
			System.out.println(cc[i]);
	}
	
}