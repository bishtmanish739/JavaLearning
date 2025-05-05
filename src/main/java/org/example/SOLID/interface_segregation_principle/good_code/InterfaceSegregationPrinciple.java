package org.example.SOLID.interface_segregation_principle.good_code;

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        //clients should not be forced to depend on interfaces that they do not use

// here we have segregated interaces into multiple interface so that it does not force child class
//        to implement other methods that does not requires



    }
}
interface  gearCar{
    void changeGear();

}
interface selfDrivingCar{
    void selfDriving();
}
interface superCar{
    void superCarFun();
}
class  teslaCar implements  selfDrivingCar,car{



    @Override
    public void selfDriving() {

    }


}

class MarutiSuzuki implements gearCar,  car{


    @Override
    public void changeGear() {

    }
}

interface  car{



}
