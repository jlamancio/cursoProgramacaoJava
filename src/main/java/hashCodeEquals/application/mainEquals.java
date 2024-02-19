package hashCodeEquals.application;

public class mainEquals {
    public static void main(String[] args) {
        equalsSample();
        hashSample();
    }

    public static void equalsSample() {
        String a = "Jose";
        String b = "Amancio";
        System.out.println(a.equals(b));
    }

    public static void hashSample(){
        String a = "Jose";
        String b = "Amancio";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
