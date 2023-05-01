public class CombinationCalc {

    public static int CombinationCalcTest(int a ,int b){
        int bunbo = b;
        int bunshi=a ;


        if (a<b || a<1 || b<1){
            return -1;
        }else {
            for (int i =bunbo; i>2; i--){
                bunbo *= i-1;
            }
            for (int j = a; b>1; b--,j--){
                 bunshi *= (j-1);
            }
             return bunshi/bunbo;


        }
    }




}
