//WAP using ‘this’ keyword as an argument in the constructor call

public class thisInConstructor {

    public static void main(String[] args) {
        Class1 c = new Class1("Naman");
    }
    
}


class Class1 {
    String name;

    Class1(String name){
        this.name = name;
        System.out.println("Inside constructor");
        System.out.println("Calling called method");
        called(this);
    }
 
    public void called(Class1 c) {

        System.out.println("this method is called by "+c.name);
        
    }
}
