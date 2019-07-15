package cn.mainapp;

public class GuiBingPaiXu {
    static int[] a = {14,13,10,7,6,9,5,1,3,11,12};
    static int[] b ;
    static int fenleiCounter = 0;
    
    public static void main(String[] args) {
        int length = a.length;
        b = new int[length];
        fenlei(0,length-1);
        for(int i=0;i<length;i++){
            System.out.println(a[i]);
        }
        System.out.println("运行次数："+fenleiCounter);
    }
    
    public static void fenlei(int low,int high){
        int mid;
        if(low<high){
            mid=(int)((high+low)/2);
            System.out.println(low+"  "+mid+"  "+high);
            fenlei(low,mid);
            fenlei(mid+1,high);
            guibing(low,mid,high);
        }
        fenleiCounter++;
    }
    
    public static void guibing(int low,int mid,int high){
        int h,j,k,i;
        h=low;
        j=mid+1;
        k=low;
        while(h<=mid&&j<=high){
            if(a[h]<=a[j]){
                b[k]=a[h];
                h++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(h>mid){
            for(i=j;i<=high;i++){
                b[k]=a[i];
                k++;
            }
        }
        else{
            for(i=h;i<=mid;i++){
                b[k]=a[i];
                k++;
            }
        }
        for(i=low;i<=high;i++){
            a[i]=b[i];
        }
    }
}
