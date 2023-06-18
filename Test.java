class Test {

    public static int sqrt(int x) {
        
       if (x < 2) return x;
        
        int end = x / 2;
        
        int start = 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if ((long)mid*mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
    public static void main(String[] args) 
        
    {

        int x =8;
        System.out.println(sqrt(x));
    }
}