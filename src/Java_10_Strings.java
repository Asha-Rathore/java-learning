public class Java_10_Strings {
    static void main(String[] args) {
//        String name = new String("Asha");
        String name = "Asha";
        System.out.println(name);
        int a = 6;
        float b = 5.455f;
       // System.out.printf("The value of a is %d and the value od b is %f", a, b);
        int value = name.length();
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String notTrimmed = "   ASHA    ";
        System.out.println(notTrimmed.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('s','d'));
        System.out.println(name.startsWith("hs"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('s'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('s', 2));
        System.out.println(name.equals("Asha"));
        System.out.println(name.equalsIgnoreCase("asha"));
        System.out.println("I am escape sequence \t\"double qoute\"");
    }
}
