package HW;

public class OneDimensionalArrays 
{

   	   	//**********************************************
   	   	// ѕомен€ть местами первую и вторую половину массива, например, дл€ массива 1 2 3 4, результат 3 4 1 2
   	   	//**********************************************
       public void ArSwapParts(int[] array) throws IllegalArgumentException 

       {
           if (array == null || array.length == 0 || array.length % 2 != 0)
           {
               throw new IllegalArgumentException();
           }
           
           int d = 0;
           
               {
                   int Buf = 0;
                   for (int i = 0, j = array.length / 2; i < array.length / 2; i++)
                   {
                       Buf = array[i];
                       array[i] = array[i + j];
                       array[j + i] = Buf;
                   }
               }

           }
       //***************************************************************************
       // ќтсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
       //************************************************************************
       public void BubbleSort(int[] array) throws IllegalArgumentException // bubble sort
           {
               if ((array == null) || (array.length == 0))
               {
                   throw new IllegalArgumentException();
               }

			   for (int i = 0; i < array.length; i++) 
			       {
			           for (int j = 0; j < array.length - i - 1; j++)
			           {
			               if (array[j] > array[j + 1])
			               {
			                   int Buf = array[j];
			                   array[j] = array[j + 1];
			                   array[j + 1] = Buf;
			               }
			           }
			       }
               
           }
       
	       public void SelectSort(int[] array) throws IllegalArgumentException
	       {
	           if ((array == null) || (array.length == 0))
	           {
	               throw new IllegalArgumentException();
	           }
	       //----------------Select sort---
	           int min = 0;
	           int SelectBuf = 0;
	           for (int i = 0; i < array.length - 1; i++)
	           {
	               min = i;
	               for (int j = i + 1; j < array.length; j++)
	               {
	                   if (array[j] < array[min])
	                   {
	                       min = j;
	                   }
	                   if (min != i)
	                   {
	                       SelectBuf = array[i];
	                       array[i] = array[min];
	                       array[min] = SelectBuf;
	                   }
	               }
	
	           	}
	
       		}

           public void InsertSort(int[] array) throws IllegalArgumentException
           //-------Insert sort
           {
               if ((array == null) || (array.length == 0))
               {
                   throw new IllegalArgumentException();
               }
	           for (int i = 0; i < array.length; i++)
	               {
	                   int Buf = array[i];
	                   int j = i;
	                   while (j > 0 && Buf < array[j - 1])
	                   {
	                       array[j] = array[j - 1];
	                       j--;
	                   }
	                   array[j] = Buf;
	               }
	        }


}
