class test {
    public static void main(String[] args) {
        A ob = new A();
        ob.p(10);
    }
}

class B {
    void p(int i) {
        System.out.println("B =" + i);
    }
}

class A extends B {
    void p(double i) {
        System.out.println("A = " + i);
    }
}