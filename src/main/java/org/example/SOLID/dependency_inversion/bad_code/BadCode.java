package org.example.SOLID.dependency_inversion.bad_code;

public class BadCode {
    public static void main(String[] args) {
        //Any higher classes should always
        // depend upon the abstraction of the class rather than the detail

        //below code is voilation of dependency inversion principle

        Repository mongoDbDatabase=new Repository();

        Student s=new Student();
        mongoDbDatabase.saveObjectToMongo(s);





    }
}




class Repository {


    public void saveObjectToMongo(Student student) {

    }

    public void saveObjectToPostgres(Student student) {

    }
}

class Student{

}


