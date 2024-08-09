//Selection Sort
public class SelectionSort
{
    public static void main(String args[])
    {
        int arr[] = {4,5,2,1,3};
        int n = arr.length;

        int i,j;
        for(i=0 ; i<n; i++)
        {
            for(j=i+1; j<n; j++)
            {
                if(arr[i] > arr[j])
                {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        for(i=0; i<n ;i++)
        {
            System.out.print(arr[i] + " ");
        }   
    }

}
