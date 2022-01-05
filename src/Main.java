import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAX_LENGTH = 15;
        int size1, size2;
        Scanner scanner = new Scanner(System.in);

        // nhập mảng 1
        do {
            System.out.print("Nhập số lượng phần tử mảng thứ 1: ");
            size1 = scanner.nextInt();
            if (size1 > MAX_LENGTH)
                System.out.printf("Số lượng phần tử phải nhỏ hơn %d", MAX_LENGTH);
        } while (size1 > MAX_LENGTH);
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Nhập mảng 1, phần tử thứ %d: ", i + 1);
            arr1[i] = scanner.nextInt();
        }

        // nhập mảng 2
        do {
            System.out.print("Nhập số lượng phần tử mảng thứ 2: ");
            size2 = scanner.nextInt();
            if (size2 > MAX_LENGTH)
                System.out.printf("Số lượng phần tử phải nhỏ hơn %d", MAX_LENGTH);
        } while (size2 > MAX_LENGTH);
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("Nhập mảng 2, phần tử thứ %d: ", i + 1);
            arr2[i] = scanner.nextInt();
        }

        // tạo mảng mới và gộp mảng
        // dùng vòng lặp
//        int[] arr3 = new int[size1 + size2];
//        for (int i = 0; i < size1; i++) {
//            arr3[i] = arr1[i];
//        }
//        for (int i = 0; i < size2; i++) {
//            arr3[size1+i] = arr2[i];
//        }

        // **** code gọn dùng hàm có sẵn **** //
        int[] arr3 = new int[size1+size2];
        System.arraycopy(arr1,0,arr3,0,size1);
        System.arraycopy(arr2,0,arr3,size1,size2);
        // **** code gọn dùng hàm có sẵn **** //


        // in mảng
        System.out.print("Mảng mới: ");
        for(int i = 0; i< arr3.length; i++){
            System.out.printf("%d   ", arr3[i]);
        }



    }
}
