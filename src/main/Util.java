public class Util {

    public static boolean isNumber(String str){
        try{
            int number =Integer.parseInt(str);
        }catch (Exception e){
            return false;
        }
        int number =Integer.parseInt(str);
        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE ){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPostalCode(String str){
        String pattern = "\\d{3}-\\d{4}|\\d{7}";
        return  str.matches(pattern);


    }


    public static  boolean isSmallAlphabet(String str){
        if(str == null || str ==""){
            return false;
        }else {
            return str.equals(str.toLowerCase());
        }

    }

    public static  boolean isTriangle(long a,long b,long c){
        if (a > 2147483647 || b>2147483647 || c>2147483647 ){
            return false;
        }else {
            return a+b>c && b+c>a && a+c>b;

        }
    }

        public static int isSquareNumber(int a){
            double sqrt = Math.sqrt(a);
            int sqrtToInt = (int)sqrt;

            if (sqrt != sqrtToInt && a < 100000){
                return sqrtToInt;
            }else {
                return -1;
            }
        }









}
