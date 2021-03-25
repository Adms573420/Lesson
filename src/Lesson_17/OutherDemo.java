package Lesson_17;

public class OutherDemo {

    private int sayı=5;

    private class InnerDemo{
        void ınnerDemoMEthod(){
            System.out.println("sayi= "+sayı);
        }

    }

    public void outherDemoMethod(){
        InnerDemo ınnerDemo=new InnerDemo();
        ınnerDemo.ınnerDemoMEthod();
    }

}
