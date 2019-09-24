class ExceptionDemo
{



		public static void main(String args[])
		{	
			try
			{
				//int res = 10/0;
				
				/*String names[] = ["ravi","John","Mark","akash";
				int index = 1;
				if(index<=names.length-1)
					System.out.println(names[index]);
				else
					System.out.println("enter valid  index");*/
				
				/*String firstName = null;
				if(firstName!=null)
					firstName.length();*/	
				
				//String s1 = new String("ravi");
				
				/*Object obj  = new Object();
				String s1 = (String)obj;
				
				System.out.println("object is "+obj);*/
				
				String s1 = "hello";
				int i1 = Integer.parseInt(s1);
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException catch");
				e.printStackTrace();
				
			}
			catch(NullPointerException e)
			{
				System.out.println("NullPointerException catch");
				e.printStackTrace();
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException catch");
				e.printStackTrace();
				
			}
			catch(ClassCastException e)
			{
				System.out.println("ClassCastException catch");
				e.printStackTrace();
				
			}
		
			
			
			catch(Exception e)
			{
				System.out.println("Exception catch");
				e.printStackTrace();
				
			}
			
			System.out.println("other instructions");	
		}
}
