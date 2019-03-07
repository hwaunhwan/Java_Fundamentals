package labs_examples.objects_classes_methods.labs.objects;


// Exercise_02
class University {
    String school_name;
    public University(String school_name){
        this.school_name = school_name;
    }
}

class Department {
    String major;
    public Department(String major){
        this.major = major;
    }
}
//controller
public class ObjAssociation {
    public static void main(String[] args) {
        University u = new University("UT");
        Department d = new Department("Education");
        System.out.println(u.school_name + " has " + d.major + " Department");
    }
}