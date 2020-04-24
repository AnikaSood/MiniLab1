
public class ALDriver {
	private CircleQueueAL list;
	private int count;
	
	public ALDriver()
	{
		list = new CircleQueueAL();
		count = 0;
		
	}
	
	
	
	
		public void addToList(Object[] objects)
		{
			for (Object o : objects)
			{
				list.add(o);
				ConsoleMethods.println("Add: " + list.getLastObj() + " " + list);
				this.count++;
			}
			ConsoleMethods.println();	
			
		}
		
		public void showList()
		{
			ConsoleMethods.println("Size: " + count);
			ConsoleMethods.println("First Element: " + list.getFirstObj());
			ConsoleMethods.println("Last Element: " + list.getLastObj());
			ConsoleMethods.println("Full List: " + list);
			ConsoleMethods.println();
		}
		
		
		public static void main(String[] args)
		
		{
			ALDriver trial = new ALDriver();
			
			trial.addToList(Animal.animalData());
			trial.addToList(Cupcakes.cupCakeData());
			trial.addToList(Alphabet.alphabetData());
			trial.addToList(Fruits.fruitData());
			//display queue objects in queue order
			trial.showList();
			
			Animal.key = Animal.KeyType.name;
			Cupcakes.key = Cupcakes.KeyType.flavor;
			Alphabet.key = Alphabet.KeyType.letter;
			Fruits.key = Fruits.KeyType.name;
			trial.list.insertionSort();
			trial.list.selectionSort(); //SELECTION SORT ADDED
			trial.showList();
			
			//display queue objects
			Animal.key = Animal.KeyType.combo;
			Cupcakes.key = Cupcakes.KeyType.combo;
			Alphabet.key = Alphabet.KeyType.combo;
			Fruits.key = Fruits.KeyType.name;
			trial.showList();
			
			
			
		}
		
	
}
