package org.example.SOLID.interface_segregation_principle.bad_code;

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        //clients should not be forced to depend on interfaces that they do not use

//        in this example tesla and maruti suzuki  are two classes
//                here tesla is self driving car but maruti suzuki is not still maruti
//                has to forced to implement self driving funtionality so this is voilation of
//                ISP



    }
}
class  teslaCar implements  car{

    @Override
    public void changeGear() {

    }

    @Override
    public void selfDriving() {

    }

    @Override
    public void superCarFun() {

    }
}

class MarutiSuzuki implements  car{

    @Override
    public void changeGear() {

    }

    @Override
    public void selfDriving() {

    }

    @Override
    public void superCarFun() {

    }
}

interface  car{
    void changeGear();
    void selfDriving();
    void superCarFun();
}
