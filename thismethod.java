import javax.xml.transform.Source;

//WAP using this() to invoke current class constructor


public class thismethod {
    public static void main(String[] args) {
        base b1 = new base();
        base b2 = new base(20,30);

        System.out.println("First object made without passing any value in the constructor");
        b1.output();
        System.out.println("Second object made with passing 20 and 10 in the constructor");
        b2.output();
    }
}

class base{
    int a,b;
    base(){
        this(10,10);
    }
    base(int a , int b){
        this.a = a;
        this.b = b;
    }
    public void output(){
        System.out.println("Values are "+" " +a+" " +b);
    }
}
