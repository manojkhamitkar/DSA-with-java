//  Array reference
public class Reference {
    public static void main(String[] args) {
        int a[] ={1,4,5,7,9};
        int n =a.length;
        int b[] =new int[n];
        b=a;
        b[0] = 5;
        System.out.println("'Original Array");
        for(int i=0;i<n;i++)
        System.out.print(a[i] + " ");
        System.out.println("\nReference Array");
        for(int i =0;i<n;i++){
            System.out.print(b[i] +" ");
        }
    }
}