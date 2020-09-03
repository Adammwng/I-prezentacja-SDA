package innerClass;

public class OuterClass {
    private int value;

    public int getValue() {
        return value;
    }
     class InnerClass{
        private int value;
        public void setValue(int value) {
            if (value % 3 == 0) {
                OuterClass.this.value = value;
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
//        OuterClass outerClass = new OuterClass();
//
//        outerClass.setValue(3);
//        System.out.println(outerClass.getValue());
//        innerClass.setValue(5);
//        System.out.println(outerClass.getValue());
//        innerClass.setValue(6);
//        System.out.println(outerClass.getValue());
//        innerClass.setValue(7);
//        System.out.println(outerClass.getValue());
    }
}

