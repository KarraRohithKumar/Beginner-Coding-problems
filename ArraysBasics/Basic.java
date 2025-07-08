
package ArraysBasics;

public class Basic {
    public static void main(String[] args) {
        InnerBasic jay = new InnerBasic();
        String p = jay.add();
        System.out.println(p);
    }
}

class InnerBasic {
    float a = 1;
    int b = 2;

    String add() {
        String t = "" + a;
        String r = "" + b;
        return t + r;

    }
}
