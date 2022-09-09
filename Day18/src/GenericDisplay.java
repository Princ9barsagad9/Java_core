public class GenericDisplay {
    public static <T> void genericDisplay(T[] element){
     for(T n:element){
         System.out.print(" "+n);
     }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array1={23,45,65,12,87};
        Double[]  array2={2.3,5.6,8.8,9.9};
        Character[] array3={'p','r','i','n','c','e'};
        Byte[] array4={1,4,8};
        System.out.println("Integer: ");
        genericDisplay(array1);
        System.out.println("Double: ");
        genericDisplay(array2);
        System.out.println("Character: ");
        genericDisplay(array3);
        System.out.println("Byte: ");
        genericDisplay(array4);
    }
}
