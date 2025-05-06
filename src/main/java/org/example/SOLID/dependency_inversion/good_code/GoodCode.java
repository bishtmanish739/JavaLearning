package org.example.SOLID.dependency_inversion.good_code;

public class GoodCode {
    public static void main(String[] args) {
        //Any higher classes should always
        // depend upon the abstraction of the class rather than the detail

        Repository mongoDbDatabase=new mongoDbDatabaseImpl();

        Student s=new Student();
        mongoDbDatabase.saveObject(s);





    }
}



class postgresDatabaseImpl implements  Repository{

    @Override
    public void saveObject(Student student) {

    }
}
class mongoDbDatabaseImpl implements  Repository{

    @Override
    public void saveObject(Student student) {

    }
}
interface Repository{

    void saveObject(Student student);

}
class Student{

}


