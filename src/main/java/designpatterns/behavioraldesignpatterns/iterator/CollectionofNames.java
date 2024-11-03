package designpatterns.behavioraldesignpatterns.iterator;

import java.util.*;

public class CollectionofNames implements Container {

	List<String> names=Arrays.asList("Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra");

	@Override
	public Iterator getIterator() {
		
		return new CollectionofNamesIterate();
	}

	private class CollectionofNamesIterate implements Iterator{

		int i;
		@Override
		public boolean hasNext() {
			if(i<names.size())
			{
				return true;
			}else {
			return false;
			}
		}

		@Override
		public Object next() {
			if(this.hasNext())
			{
				return names.get(i++);
			}
			return null;
		}
		
	}
	
	
}
