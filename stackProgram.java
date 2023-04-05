public class stackProgram {
    public static void main(String[] args) {
        stack s1 = new stack();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.pop();
        s1.print();
    }
}

class stack{
    int[] arr = new int[10];
    int head = 0;

    void push(int num){
        if(head >=10){
            System.out.println("Stack limit reached ");
            return;
        }
        arr[head] = num;
        System.out.println(num+" pushed at "+head);
        head++;
    }
    void pop(){
        if(head <=0){
            System.out.println("Stack Underflow ");
            return;
        }
        System.out.println("popped "+ arr[(head-1)]);
        head--;
    }

    void print(){
        for (int i = 0; i < head; i++) {
            System.out.println(arr[i]);
        }
    }
}
