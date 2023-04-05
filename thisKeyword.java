//WAP using &#39;this&#39; keyword to refer current class instance variable


public class thisKeyword {
    public static void main(String[] args) {
        
        parent p1 = new parent(6,7,9);
        p1.output();
    }

}


class parent {
    int a,b,c;
    parent(int a, int b, int c){
        this.a = a; 
        this.b = b;
        this.c = c;

        System.out.println("values assigned using this keyword");
    }

    public void output(){
        System.out.println("values are  " + a + b + c);
    }
}
