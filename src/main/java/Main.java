// This file is optional to edit and can be used for manual testing.

public class Main {
    /**
     * The entry point of the application.
     * 
     * This method creates a Booleans object and manually tests its methods by calling them several times with varying arguments and printing out the results.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Booleans booleans = new Booleans();
        System.out.println("Consider the expression 'true IS true'.");
        System.out.println("Here's what Booleans.returnBoolean returns when provided the value 'true' (should be 'true')");
        boolean result1 = booleans.returnBoolean(true);
        System.out.println(result1);

        System.out.println("Consider the expression 'false IS false'.");
        System.out.println("Here's what Booleans.returnBoolean returns when provided the value 'false' (should be 'false')");
        boolean result2 = booleans.returnBoolean(false);
        System.out.println(result2);

        System.out.println("Consider the expression 'true IS NOT false'.");
        System.out.println("Here's what Booleans.returnNot returns when provided the value 'true' (should be 'false')");
        boolean result3 = booleans.returnNot(true);
        System.out.println(result3);

        System.out.println("Consider the expression 'false IS NOT true'.");
        System.out.println("Here's what Booleans.returnNot returns when provided the value 'false' (should be 'true')");
        boolean result4 = booleans.returnNot(false);
        System.out.println(result4);

        System.out.println("Consider the expression 'true AND true IS true'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'true', 'true' (should be 'true')");
        boolean result5 = booleans.returnAnd(true, true);
        System.out.println(result5);

        System.out.println("Consider the expression 'true AND false IS false'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'true', 'false' (should be 'false')");
        boolean result6 = booleans.returnAnd(true, false);
        System.out.println(result6);

        System.out.println("Consider the expression 'true OR true IS true'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'true', 'true' (should be 'true')");
        boolean result7 = booleans.returnOr(true, true);
        System.out.println(result7);

        System.out.println("Consider the expression 'true OR false IS true'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'true', 'false' (should be 'true')");
        boolean result8 = booleans.returnOr(true, false);
        System.out.println(result8);

        System.out.println("Consider the expression 'false OR false IS false'.");
        System.out.println("Here's what Booleans.returnAnd returns when provided the values 'false', 'false' (should be 'false')");
        boolean result9 = booleans.returnOr(false, false);
        System.out.println(result9);
    }
}
