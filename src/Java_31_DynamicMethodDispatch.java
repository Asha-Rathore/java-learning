class One{
    public void name(){
        System.out.println("My name is Java");
    }

    public void great(){
        System.out.println("Good Morning");
    }
}

class Two extends One{
    @Override
    public void name() {
        super.name();
        System.out.println("My name is Java in Class Two");
    }

    public void swagat(){
        System.out.println("Swagat");
    }
}

public class Java_31_DynamicMethodDispatch {
    static void main(String[] args) {
        One one = new Two();
        //Two two = new One(); Not allowed
        one.name();
        one.great();
        //one.swagat(); will not work
    }
}
