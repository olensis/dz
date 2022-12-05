public class Main {
    static void bar() {
        int[] nums = {1, 2, 3};
        for ( int x = 0; x < nums.length; x++ ) {
            x += nums[x];
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        //1
        int num = 3211;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
        //
        Main.bar();
    }
}