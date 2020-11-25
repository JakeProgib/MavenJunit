public class Calc {
    public Integer plus(int a, int b){
        return a+b;
    }

    public Integer minus(int a, int b){
        return a-b;
    }

    public Integer div(int a,int b) {return a/b;}

    public Integer multi(int a, int b) {
        try{
            return a*b;
        }catch (ArithmeticException e) {
            return null;
        }
    }
}
