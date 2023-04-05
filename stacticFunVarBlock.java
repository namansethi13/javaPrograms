//WAP to demonstrate the concept of static variable, static function and static block.


public class stacticFunVarBlock {

    static {

        System.out.println("Inside static block always called before main");
    }
    public static void main(String[] args) {
        System.out.println("Inside main");
        student s1 = new student();
        s1.tellCollege();
    }
}

class student{
    static String collegeName = "MSI";
    int rollno;
    String name;

    public static void tellCollege(){
        System.out.println("inside static function this can only access static data members");
        System.out.println("Name of the coilege is " + collegeName);
    }
}