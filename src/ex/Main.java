package ex;

public class Main {

    public static void main(String[] args) {
        Integer intArray[] = {1,2,3,4,5,6,7};
        Double doubleArray[] = {1.7,2.5,3.6,4.8,5.5,6.6,7.7};
        Character  charArray[]={'A','B','C','D'};
       // PrintArray.toPrint(intArray);
//        System.out.println();
//       // PrintArray.toPrint(doubleArray);
//        System.out.println();
//        PrintArray.toPrint(chharArray);
//        System.out.println();
        Main.toPrint(intArray);




	// write your code here
    }
    private static void toPrint(Integer[] array){
        for(Integer value : array){
            System.out.println(value + " ");
        }
    }
    private static void toPrint(Double[] array){
        for(Double value : array){
            System.out.println(value + " ");
        }
    }

}
