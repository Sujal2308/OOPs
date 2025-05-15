package Objects;

public class ObjectTypeCasting {
    public static void main(String[] args) {
        Object O  = new StringBuffer("sujal");
        System.out.println(O);

        Number N = 100.24f;
        System.out.println(N+ " "+N.intValue());

        StringBuffer SB = (StringBuffer) O;
        System.out.println(SB);

        var a = new Object();
        System.out.println(a.hashCode());

        var b = a;
        System.out.println(b.hashCode());

//        StringBuffer s = new String("HELLO"); ILLEGAL (INCOMPATIBLE)
    }
}
