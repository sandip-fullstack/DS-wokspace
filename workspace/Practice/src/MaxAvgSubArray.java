public class MaxAvgSubArray { // max avg sub array of size k

    public static void main(String[] args) {
        
        int[] input = {11, -8, 16, -7, 24, -2, 3};
        int k = 3;
        
        int start_index = getMaxAvgSubarrayStartIndex(input, k);
        for(int counter =0 ; counter < k; counter++) {
        System.out.print(input[start_index++] + " " );
        }
    }
    
    private static int getMaxAvgSubarrayStartIndex(int input[], int k)
    {
    int n = input.length;
    if (k > n)
        throw new IllegalArgumentException("k should be less than or equal to n" );
    
    if(k == n) {
        return 0;    
    }
    
    int curr_sum = 0;
    for (int i = 0; i < k; i++)
        curr_sum += input[i];

    int maxSum = curr_sum;
    int maxSum_start_Index = 0;

    for (int i = k; i < n; i++)
    {   
        
        curr_sum = curr_sum + input[i]  - input[i-k]; //why i-k? o make it optimize else O(n2). sliding .
        if (curr_sum > maxSum)
        {
            maxSum = curr_sum;
            maxSum_start_Index = (i-k) + 1;
        }    
    }

    return maxSum_start_Index;
    }
}