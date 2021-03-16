package tavant;

public class ArrayStack {
    public static void main(String[] args) {
        Stack st = new Stack(3);
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.traverse();
    }
}

class Stack{
    int size;
    int stack[];
    int top = -1;

    public Stack(int n){
        size = n;
        stack = new int[size];
    }
    public Stack(){
        size = 10;
        stack = new int[size];
    }
    public void push(int n){
        if(top == size-1){
            System.out.println("Stack is full");
        }else{
            stack[++top] = n;
        }
    }
    public int pop(){
        if(top == -1){
            throw new RuntimeException("Stack is empty");
        }else{
            return stack[top--];
        }
    }
    public void traverse(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        for(int i=top; i>=0 ; i--){
            System.out.println(stack[i]);
        }
    }
}
