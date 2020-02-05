package vars;

public class HM1 {
    public static void main(String[] srg){
        //арифметическии операции между однотипами
        int a = 4;  //создать переменные с инициализацией
        int b = 9;
        int c = -11;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * c);
        System.out.println(b % a);

        byte d,f,g,t;  //создание переменных без инициализации
        d = 110;
        f = 50;
        g = (byte) (d / f);
        t = (byte) (d - f);
        System.out.println(d * f);
        System.out.println(g);
        System.out.println(t);
        System.out.println(d % f);

        short m = 433;
        short n = -2;
        short cc = (short)(m +m);
        short tt = (short)(n +m);
        System.out.println(cc);
        System.out.println(tt);
        System.out.println(m - n);
        System.out.println(m + n);
        System.out.println(m % n);
        System.out.println(m * n);
        System.out.println(m / n);

        long b1 = 43242343232L;
        long b2 = -4343445434334L;
        long b3 = b1 * b2;
        System.out.println(b3);
        System.out.println(b3 - b1);
        System.out.println(b1/ b3);
        System.out.println(b1 + b2);
        System.out.println(b1 % b2);


        short ii = 432;//aрифметические операции между разными типами
        long nn = (b1- b3);
        int qq = (a + b);
        long uu = 3234243243232L;
        System.out.println(uu - ii);
        System.out.println(ii * qq);
        System.out.println(nn / qq);
        System.out.println(nn + uu);
        System.out.println(nn % qq);


        float pp = 43.54f;
        float xx = 5.9f;
        float vv = (pp / xx);
        System.out.println(pp - xx);
        System.out.println(pp / xx);
        System.out.println((pp - xx)* vv);

        double oo = pp;
        double ss = b1 * b2;
        System.out.println(pp);
        System.out.println(ss - pp);

        int gg = 432;
        char kk = (char) qq;
        System.out.println(kk);

        char xxx = 43894;
        int ee = (int) xxx;
        System.out.println(ee);

        //char
        char qqq = 68;
        char www = 65;
        char eee = 83;
        char rrr = 72;
        char ttt = 65;
        System.out.println(qqq+""+www+""+eee+""+rrr+""+ttt+"");
        System.out.println(qqq + www + eee + rrr+ ttt);

        //boolean
        boolean equation = (432<500);
        boolean equation2 = (433>432);

        if (equation){
            System.out.println("expression 432<500 is true");
        }
        if (equation2) {
            System.out.println("expression 432>500 is false");
        }

        //константы
        final int WINDOW = 150;
        final int DOOR = 100;
        //WINDOW = 20; выдает ошибку
     

    }
}
