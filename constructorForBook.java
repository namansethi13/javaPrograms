import java.util.Scanner;

//WAP that uses default, parameterized and copy constructor for class book.





public class constructorForBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Cyberwarrior Handbook", "Occupy the web" , 352);
        Book book3 = new Book(book1);

        book1.output();
        book2.output();
        book3.output();
    }
}


class Book {
    String title;
    String authorName;
    int pages;

    Book(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of the book");
        title = sc.nextLine();
        System.out.println("Enter author name of the book");
        authorName = sc.nextLine();
        System.out.println("Enter the number of pages of the book");
        pages = sc.nextInt();
    }

    Book(String title , String authorName, int pages ){
        this.title = title;
        this.authorName = authorName;
        this.pages = pages;
    }
    
    Book(Book b){
        this.title = b.title;
        this.authorName = b.authorName;
        this.pages = b.pages;
    }

    public void output(){
        System.out.println("Title of the book is " + title + " Author of the book is " + authorName + " No of pages are "+ pages );
    }
}