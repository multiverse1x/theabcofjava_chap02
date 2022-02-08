public class Ex2_8 {
    public static void main(String[] args) {

        //타입변환

        String str = "3";

        System.out.println(str.charAt(0) - '0'); // 문자열을 문자로 변환
        System.out.println('3' - '0' + 1);
        System.out.println(Integer.parseInt("3") + 1);
        System.out.println("3" + 1);
        System.out.println((char)(3 + '0'));


        //문자열을 문자로 변환 >> charAt(0)을 쓰면 된다.
        //문자와 숫자간 변환
        //숫자에 '0'을 더해줌 > 문자가 됨
        //문자에 '0'을 빼줌  > 숫자가 됨



    }
}
