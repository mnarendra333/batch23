class NumberDemo
{
	
	public int[] getNumbers(int elem[])
	{
		
		return elem;
	}
	
	public int[] getNumbers(int elem[], int arg)
	{
		
		
		int[] filteredArray = new int[elem.length];
		
		int counter = 0;
		for(int i=0;i<elem.length;i++)
		{
			if(elem[i]%arg==0)
			{
				filteredArray[counter] =elem[i];
				counter++;
			}
				
		}
		
		return filteredArray;
		
	}
	
	
	public static void main(String args[])
	{
		int numbers[] = {10,12,15,34,16,20,45,60,80,90,100,56,23};
		
		NumberDemo obj = new NumberDemo();
		int data[] = obj.getNumbers(numbers);
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		
		System.out.println("==================================");
		
		int data2[] = obj.getNumbers(numbers,5);
			for(int i=0;i<data2.length;i++)
			System.out.print(data2[i]+" ");
	}
	
	


}