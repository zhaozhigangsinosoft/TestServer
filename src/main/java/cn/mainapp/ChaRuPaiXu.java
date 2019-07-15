package cn.mainapp;

public class ChaRuPaiXu {
    static int counter = 0;
    public static void main(String[] args) {
        int[] a = {14,13,10,7,6,9,5,1,3,11,12};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int index = 0;
 
            for (int j = 0; j < i; j++) {
                counter++;
                if(a[i]<b[j]) {
                    break;
                }  
                index++;
            }
            for (int j = i; j >= index+1; j--) {
                b[j]=b[j-1];
            }
            b[index]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("运行次数："+counter);

    }
}
