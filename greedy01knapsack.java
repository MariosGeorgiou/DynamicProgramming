public class greedy01knapsack {
    //Create and initialise the value and weight of items + the max weight
    static  int[] value = {0,1,4,5,7};  //0 is the first value to prevent going out of bounds
    static  int[] weight = {0,1,3,4,5};  //0 is the first weight to prevent going out of bounds
    static  int maxWeight = 7;
     
 
    public static void main(String[] args) {
         
         
        int[][] array = new int[value.length+1][maxWeight+1];
        //System.out.println(value.length +" x "+ (maxWeight+1));
        complete(array);
        printarray(array);
    }
     
    public static void printarray(int[][] arr){
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
     
 
     
    public static void complete(int[][] arr){
        for(int i=1; i< arr.length-1; i++){
            for(int j=1; j<arr[i].length; j++){ 
                try{
                if(j < weight[i]){
                    //System.out.println("1st "+ i +" "+j+" because "+i+" < "+weight[i]);
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = Math.max((value[i] + arr[i-1][j-weight[i]]) ,arr[i-1][j]);
                    //System.out.println("2nd "+ i +" "+j+" -->"+arr[i][j]);
                }
                }
                catch (Exception e){
                    System.out.println(e);
                }
                 
            }
        }
    }
 
}