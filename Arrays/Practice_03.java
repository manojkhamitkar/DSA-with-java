//  Search if the given element x is present in the array or not and find the index. If not present then 
//  return the index as -1. (Linear Search)

public class Practice_03{
    public static void main(String[] args) {
        int[] arr ={2,3,4,9,8,7,6};
        int x= 1;
        int index =-1;
        for(int i = 0;i <arr.length;i++){
            if(arr[i]==x) index =i;
        }
        System.out.println(index);
    }
}
