import java.util.ArrayList;

public class CircleQueueAL extends Generics {
	ArrayList<Object> list;
	
	public CircleQueueAL()
	{
		list= new ArrayList<Object>();
	}
	
	public Object getFirstObj()
	{
		return list.get(0);
	}
	
	public Object getLastObj()
	{
		return list.get(list.size()-1);
	}
	
	public void add(Object opaqueObject)
	{
		this.list.add(opaqueObject);
	}

	//INSERTION SORT
    public void insertionSort() {

        // iterate list, one less than length
        for (int i = 0; i < list.size() - 1; i++) {
            
            // insertion sort key logic
            int k = i + 1;
            Object swap = list.get(k);            
            while( k > 0 && swap.toString().compareTo(list.get(k-1).toString())<0) {
                list.set(k,list.get(k-1));
                
                k--;
                
   
            }
            list.set(k,swap);
            
        }

    }
	
    public void selectionSort() {
    	
    	int i, j, min;
    	Object temp = null;
    	
    	for(i = 0; i<list.size()-1; i++) //traverse through whole list (except the last number)
    	{
    		min = i;
    		
    		for(j = i+1; j<list.size(); j++) //j is always one ahead of i
    		{
    			if(list.get(j).toString().compareTo(list.get(min).toString())<0)
    			{
    				min = j;
    			}
    		}
    		
    		temp =  list.get(i);
    		list.set(i, list.get(min));
    		list.set(min,temp);
    		
    	}
    }

	public String toString()
	  { 
	    String listToString = "[";

	    for(Object add : list)
	    {
	    	listToString+= "(" + add.toString() + "), ";
	    }
	    listToString += "]";
	    return listToString;
	  }

}
