public class Compute {

    public static int max(int a,int b) {
        if(a>b)
            return a;
        else
            return b;
    }

    public static int max4(int[] num) {
        int max1 = max(num[0], num[1]);
        int max2 = max(num[2], num[3]);

        int result = max(max1, max2);

        return result;
    }
}
