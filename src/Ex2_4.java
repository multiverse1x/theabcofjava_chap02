public class Ex2_4 {
    public static void main(String[] args) {

        /*상수
        변수는 하나의 값을 저장하기 위한 공간
        상수는 한 번만 값을 저장 가능한 변수
        상수선언은 final
         */

        final int score = 100;
        // score = 200;  에러발생. score는 상수라서 한번만 값이 저장되기 때문
        System.out.println(score); // 상수 100 출력

        final int score2;
        score2 = 350;
        // 예전엔 상수의 선언과 초기화를 위에처럼 바로 해줘야했지만 지금은 선언하고 초기화해도 되는걸로 바뀜.
        // 하지만 선언과 동시에 초기화하는 것이 좋음


        /*
        변수 타입, 범위
         */

        boolean power = true;
        byte b = 127;
        int oct = 0206; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16
        long l = 10_000_000_000L; // 알아보기 쉽게 언더바 사용가능, L 붙여야함.
        float f = 3.14f;
        double d = 3.14f;
        System.out.println(power);
        System.out.println(b);
        System.out.println(oct);
        System.out.println(hex);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        char ch = 'A';
        int i = 'A';
        System.out.println(ch);
        System.out.println(i); //유니코드 정수타입

        String str = ""; // 빈문자열 가능
        String str2 = "32";
        String str3 = "35";
        System.out.println(str2 + str3);


        //주석처리 단축키 ctrl + /
    }
}
