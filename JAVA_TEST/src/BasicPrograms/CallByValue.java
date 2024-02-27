package BasicPrograms;

// strictfp - strict floating point - floating point can change from platform to platform
// if strictfp applied then answer is same on all the platform.
class Operation2{
    int data = 25 ;
    void changeValue(){
        this.data = data + 25 ;
    }
    void changeValue2(int data){
        data = data + 65 ;
    }
}
public class CallByValue {
    public static void main(String[] args) {
        Operation2 op  = new Operation2();
        System.out.println(op.data);
        op.changeValue();
        System.out.println(op.data);
        op.changeValue2(25);
        System.out.println(op.data);
    }
}
