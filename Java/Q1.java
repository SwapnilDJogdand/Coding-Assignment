import java.util.Random;
import java.util.Arrays;

class ArrayX
{
    public void Shuffle( int arr[], int n)
	{
		Random r = new Random();
	
		for (int i = n-1; i > 0; i--) {
			
			int j = r.nextInt(i+1);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

public class Q1 
{
	public static void main(String[] args) 
	{
        ArrayX aobj = new ArrayX();
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int arrLength = arr.length;
		aobj.Shuffle(arr, arrLength);
	}
}
