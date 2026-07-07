class A {
    public static int total;
    public int media;
}

class B {

    public static void main(String[] args) {
        A a = new A();
        a.total = 5;
        a.media = 5;

        A b = new A();
        b.total = 7;
        b.media = 7;
    }
}