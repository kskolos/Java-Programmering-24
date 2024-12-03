package codealongs.Exception.finished;
public class CallStack {
    
    public int topMethod() {
        System.out.println("top method");
        return 1;
    }

    public void middleMethod() {
        System.out.println("middle method");
        topMethod();
    }

    public void bottomMethod() {
        System.out.println("bottom method");
        middleMethod();
    }

    public static void main(String[] args) {
        CallStack c = new CallStack();
        
        c.bottomMethod();
    }
}
