//Question 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}

//Question 2
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Writing");
    }

    @Override
    void refill() {
        System.out.println("Refilling");
    }

    void changeNib(){
        System.out.println("Changing nib");
    }
}

//Question 3
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }

    void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

//Question 4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

interface Camera{
    void takeSnap();
    void recordVideo();
}

interface Wifi{
    void connectToNetwork();
}

class SmartPhone extends Telephone implements Camera, Wifi{
    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lifting");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting...");
    }

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Connecting to network");
    }
}

//Question 6
interface TVRemote{

}

class SmartTVRemote implements TVRemote{

}
//Question 7
class TV implements TVRemote{

}

public class Java_35_PracticeSet11 {
    static void main(String[] args) {
        //Question 1
        //Question 2
//        FountainPen fountainPen = new FountainPen();
//        fountainPen.write();
//        fountainPen.refill();
//        fountainPen.changeNib();

        //Question 3
//        Human human = new Human();
//        human.jump();
//        human.bite();
//        human.eat();
//        human.sleep();

        //Question 4
//        SmartPhone smartPhone = new SmartPhone();
//        smartPhone.ring();
//        smartPhone.lift();
//        smartPhone.disconnect();
//        smartPhone.connectToNetwork();
//        smartPhone.takeSnap();
//        smartPhone.recordVideo();

        //Question 5
        //Question 6
        //Question 7
    }
}
