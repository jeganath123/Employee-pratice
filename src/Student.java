import java.util.Arrays;

public class Student {
    public static void main(String[] args) {
        Employee [] emp=new Employee[5];
        Employee []emp1={new Employee(),new Employee(), new Employee()};
        String [] sc=new String[]{"jeg", "ab", "cat", "dog","amar"};
        int [] a1={1,3,4};
        int []a2={1,3,4};
        System.out.println(Arrays.equals(a1,a2));
       /* System.out.println(Arrays.toString(sc));
        Arrays.sort(sc);
        System.out.println(Arrays.toString(sc));
        boolean result =Arrays.asList(sc).contains("amar");
        boolean res=Arrays.asList(sc).contains("ab");
        System.out.println(result);
        System.out.println(res);
        System.out.println(Arrays.toString(emp1));*/
        System.out.println(stringCheck(sc,"jegg"));



    }
    public static boolean stringCheck(String[] str, String namVal) {
        for (String s :
                str) {
            if (s.equals(namVal)) {
                return true;
            }

        }
        return false;
    }}