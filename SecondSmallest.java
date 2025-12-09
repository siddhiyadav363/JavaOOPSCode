public class SecondSmallest {
    public static int findSecondSmallest(int[] arr){
        if(arr.length<2){
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int num:arr){
            if (num<smallest){
                secondSmallest=smallest;
                smallest=num;
            }
            else if(num>smallest && num<secondSmallest){
                secondSmallest=num;
            }
        }
        
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] numbers={5,2,8,1,9,4};
        int result=findSecondSmallest(numbers);
        System.out.println("Second smallest element: "+result);
        
    }
    
}
