package programswithJUNITtestcase;

public class IntegerReversionProblem {
    public static void main(String args[]) {
        System.out.println(reversedInteger(12345));
    }

//    public static int reversedInteger(int num){
//        String s = Integer.toString(num);
//        StringBuilder builder = new StringBuilder();
//        for(int i= s.length()-1;i>=0;i--){
//            builder.append(s.charAt(i));
//        }
//        return Integer.valueOf(builder.toString().trim());
//    }

    //correct way
    public static int reversedInteger(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
}
