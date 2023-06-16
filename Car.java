import java.io.IOException;

public class Car {
    public int gear;
    public int speed;

    public Car(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }   
    public Car(){}

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        try{
            int a=0,b=0;
        }catch(Exception e){}
        speed += increment;
        try{
            int a=0,b=0;
        }catch(Exception e){}
    }

    public String toString()
    {
        try{
            int a=0,b=0;
        }catch(Exception e){}
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}
