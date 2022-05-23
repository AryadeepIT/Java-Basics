package functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Aryadeep";

        {
//            int a = 78; // already initialized outside the block in the same method, hence you can not initialize again.
            a = 90; // reassign the original value to some other value
            int c = 99;
            name = "Sanchita";
            System.out.println(name);
            System.out.println(a);
            // values initialized in this block, will remain in block.
        }
//        System.out.println(c); // cannot use outside the block.

        // scoping in for loops
        for(int i = 0; i < 4; i++ ){
            System.out.println(i);

        }
        System.out.println(a);
        System.out.println(name);

    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }
}
