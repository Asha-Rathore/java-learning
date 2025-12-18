abstract class Base2{
    public Base2(){
        System.out.println("I am Base2 constructor");
    }

    public void syHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();
}

class Derived2 extends Base2{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class Derived3 extends Base2{
    public void th(){
        System.out.println("I am good");
    }
}

public class Java_33_Abstract {
    static void main(String[] args) {
        //Base2 base2 = new Base2(); Cannot make object
        Derived2 derived2 = new Derived2();
        //Derived3 derived3 = new Derived3(); Cannot make object
    }
}
