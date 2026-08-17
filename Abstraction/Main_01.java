abstract class programmer {
    public abstract void Developer();
}

class HTML extends programmer {
    @Override
    public void Developer() {
        System.out.println("Tim Berners lee.");
    }
}

class JAVA_01 extends programmer{
    @Override
    public void Developer() {
        System.out.println("JAMES GOSLING");
    }
}

public class Main_01 {
    public static void main(String[] args) {
        HTML T = new HTML();
        T.Developer();
        JAVA_01 J = new JAVA_01();
        J.Developer();
    }
}
