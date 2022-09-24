public class Calculater {
    public int sum(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multipl(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        if(b != 0)
            return a/b;
        else
            return 0;
    }
    public int Per(int a, int b){
        return (2*a)+(2*b);
    }
}
