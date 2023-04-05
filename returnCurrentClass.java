//WAP using &#39;this&#39; keyword to return the current class instance

public class returnCurrentClass {
 public static void main(String[] args) {
    person p1 = new person("Naman", 20, "Male");

    System.out.println("Returning this keyword to achieve method chaining");

    p1.tellname().tellage().tellgender();
 }   
}


class person{
    String name;
    int age;
    String gender;

    person(String name , int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public person tellname(){
        System.out.println("My name is "+name);
        return this;
    }

    public person tellage(){
        System.out.println("My age is "+age);
        return this;
    }

    public person tellgender(){
        System.out.println("My gender is "+gender);
        return this;
    }
}