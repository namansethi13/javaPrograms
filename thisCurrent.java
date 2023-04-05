public class thisCurrent {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
    }
    
}

class Class1{
    public void sayHi(){
        System.out.println("Inside sayHi method");
    }
    Class1(){
        System.out.println("Inside constructor");
        System.out.println("calling sayHi method using this.sayHi()");
        this.sayHi();
    }
}
