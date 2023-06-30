// Convert the list of Strings {"ab","bc","cd","de","ef","fg","gh"} into an array of stribgs and
// print all strings stored on odd indicies of the array.
public class Assignment_02 {
    public static void main(String[] args) {
        String[] arr ={"ab","bc","cd","de","ef","fg","gh"};
        for(int i =0;i <arr.length;i++){
            if(i % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}