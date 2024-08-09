//Bubble Sort
public class BubbleSort 
{
    public static void main(String args[])
    {
        int arr[] = {4,5,2,1,3};
        int n = arr.length;

        int i,j;
        for(i=0; i<n-1 ; i++)
        {
            for(j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        for(i=0; i<n ;i++)
        {
            System.out.print(arr[i] + " ");
        }   
    }

}
