public class Ex2_5 {
    public static void main(String[] args) {

        //변수 바꾸기

        int x = 5, y = 7;
        int tmp;

        tmp = x;
        x =  y;
        y = tmp;

        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
