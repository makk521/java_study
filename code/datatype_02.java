
public class datatype_02{
    public static void main(String[] args){
        int n1 = 1;
        long n2 = 1L;

        System.out.println(n1);
    }
}

class char_{
    public static void main(String[] args){
        char n1 = '马' + 1;
        char n2 = 97;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println((int)n2);  // 输出对应的数字
        System.out.println('a' + 1);
    }
}

class StringToBasic{
    public static void main(String[] args){
    // 基本数据类型转字符串
    int n1 = 100;
    String s1 = n1 + "";
    System.out.println(s1);

    // 字符串转成基本数据类型
    String s2 = "123";
    int n2 = Integer.parseInt(s2);
    double n3 = Double.parseDouble(s2);
    float n4 = Float.parseFloat(s2);
    long n5 = Long.parseLong(s2);
    byte n6 = Byte.parseByte(s2);
    boolean n7 = Boolean.parseBoolean("true");
    short n8 = Short.parseShort(s2);

    System.out.println(n2);
    }

}

class CharDiffString{
    public static void main(String[] args){
        // char and String;
        char s1 = 'm';
        short n1 = 1;
        String s2 = "ma";
        System.out.println(s1 + n1);
        System.out.println(s2 + 1);

    }
}