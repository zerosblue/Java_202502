package ch01.ex01;

public class ArrayCopyExample {

    public static void main(String[] args) {
        
        int[] oldIntArray = {10, 20, 30, 40, 50};
        System.out.println("oldIntArray 크기: " + oldIntArray.length);
        
        int[] newIntArray = new int[6];

        // oldIntArray 값을 newIntArray로 복사
        for(int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        // newIntArray 출력
        System.out.print("newIntArray: ");
        for(int i = 0; i < newIntArray.length; i++) 
            System.out.print(newIntArray[i] + " ");
        
        System.out.println();  // 줄 바꿈

        // 새로운 배열 선언 (10 크기)
        int[] intArray = new int[10];

        // System.arraycopy()를 사용하여 배열 복사
        System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length);

        // intArray 출력
        System.out.print("intArray: ");
        for(int i = 0; i < intArray.length; i++) 
            System.out.print(intArray[i] + " ");
        System.out.println();
        //향상된 for문
        for(int i: intArray)
        	System.out.print(i+" ");
        
        
        
    }
}