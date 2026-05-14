interface IOperations{
    int doOpertaion(int a);
}
class cls1 implements IOperations{
    public int doOpertaion(int a){
        return a*a;
    }
}

class cls2 implements IOperations{
    public int doOpertaion(int a){
        return a*2;
    }
}

public class Fun_01 {
    public static void main(String[] args) {
        IOperations intfRef;
        
    }
}
