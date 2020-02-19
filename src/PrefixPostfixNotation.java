public class PrefixPostfixNotation {

    public static void main(String[] args) {

        System.out.println("Prefix");
        prefix();

        System.out.println("PostFix");
        postfix();

    }

    private static void prefix() {

        int i, j;
        i = 9;
        j = ++i;
        System.out.println("i and j :"+ i +" "+ j);


    }

    private static void postfix() {


        int i, j;
        i = 9;
        j = i++;

        System.out.println("i and j: "+i +" "+j);
    }
}
