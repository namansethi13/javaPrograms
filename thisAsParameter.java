public class thisAsParameter {

    public static void main(String[] args) {
        Class1 c = new Class1("Naman");
        c.caller();
    }
    
}


class Class1 {
    String name;

    Class1(String name){
        this.name = name;
    }
    public void caller() {
        called(this);
    }
    public void called(Class1 c) {

        System.out.println("this method is called by "+c.name);
        
    }
}
