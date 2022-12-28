package Structural.com.adapter;

public class Main {
	public static void main(String[] args) {
		  int[] numbers = new int[]{34, 2, 4, 12, 1};  
		  
//		  NumberSorter ns = new NumberSorter();
//		  ns.sort(numbers);
		  
		  Sorter sorter = new SortListAdapter();      

		  int[] outNumbers = sorter.sort(numbers);
		  
		  for(int value : outNumbers) {
			  System.out.println(value);
		  }
	}
}