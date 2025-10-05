//Ex:
class Person{
    private String name, birth;

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }
}

class Student  extends Person{
    private String lop;
    private double gpa;
    public Student(String name, String birth, String lop, double gpa) {
        super(name, birth);
        this.lop = lop;
        this.gpa = gpa;
    }

}



public class INHERITANCE {
    //ke thua
    // khai bao: public class sub class SubClass extends SuperClass{}
}
