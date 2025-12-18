interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void applySpeed(int decrement);
}

interface AshaCycle{
    void blowHorn1();
    void applyBrake(int decrement);
}

class AvonCycle implements Bicycle, AshaCycle{
    void blowHorn(){
        System.out.println("Horn");
    }

    @Override
    public void blowHorn1() {
        System.out.println("Blowing horn");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying brake");
    }

    @Override
    public void applySpeed(int decrement) {
        System.out.println("Applying speed");
    }
}

public class Java_34_Interfaces {
    static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        //You can create properties in interfaces
        //cycle.a = 40; You cannot modify properties in interfaces as they are final
        System.out.println(cycle.a);
    }
}
