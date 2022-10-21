 class GFG
{
 
   
    static int countdigits(int N)
    {
        int count = 0;
        while (N>0) {
            count++;
            N = N / 10;
        }
        return count;
    }
 
    
    static void cyclic(int N)
    {
        int num = N;
        int n = countdigits(N);
        int sum=0;
        while (true) {
            
            System.out.println(num);
 
    
            int rem = num % 10;
            int dev = num / 10;
            num = (int)((Math.pow(10, n - 1)) *
                                rem + dev);
            sum+=rem;
            System.out.println(num+ " "+" ="+sum);
            if (num == N)
                break;
        }
    }
 
    // Driver Program
    public static void main (String[] args) {
    int N = 5674;
    cyclic(N);
    }
}