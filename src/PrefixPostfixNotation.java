public class PrefixPostfixNotation {

    public static void main(String[] args) {

        int i, j;
        i = 9;
        j = ++i;

        System.out.println("Prefix");
        System.out.println("i and j :"+ i +" "+ j);

        System.out.println("PostFix");

        postfix();

    }

    private static void postfix() {
        int i, j;
        i = 9;
        j = i++;

        System.out.println("i and j: "+i +" "+j);
    }
}
