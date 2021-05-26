package ArrayInterviewQuestion;

public class FindMissing {
    /**
     * Find Missing number from an array [1-9]*/
    public static void main(String[] args) {
        int [] iArray = new int[]{1,2,3,5,6,7,8,9};
        int missing = getMissing(iArray,9);
        System.out.println("Missing number from array is :"+missing);

    }

    private static int getMissing(int[] numbers, int i) {
        int sum = i*((i+1)/2);
        System.out.println("The expected sum is :"+sum);
        int actualSum=0;
        for (int j:numbers){
            actualSum+=j;
            System.out.println("Actual sum is: "+actualSum);
        }

        return sum-actualSum;


    }

}
