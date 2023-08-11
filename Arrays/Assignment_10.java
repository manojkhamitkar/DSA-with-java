import java.util.Scanner;
public class Assignment_10{
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.print("Enter the length of the array: ");
int n = scn.nextInt();
int[] arr = new int[n];
for(int i = 0; i < n; i++){
arr[i] = scn.nextInt();
}
int[] ans = new int[n];
int idx = 0;
int firstNonNegativeElementIndex = n;
for(int i = 0; i < n; i++) {
if(arr[i] >= 0) {
firstNonNegativeElementIndex = i;
break;
}
}
//using 2 pointers
int negItr = firstNonNegativeElementIndex-1; //starting from largest amongst negative numbers
int posItr = firstNonNegativeElementIndex; //starting from smallest amongst positive numbers
while(negItr >= 0 && posItr < n) {
int negElementSquare = arr[negItr]*arr[negItr];
int posElementSquare = arr[posItr]*arr[posItr];
if(negElementSquare < posElementSquare) {//whichever square is smallest, add to ans array first
ans[idx++] = negElementSquare;
negItr--;
} else {
ans[idx++] = posElementSquare;
posItr++;
}
}
while(negItr >= 0) {
ans[idx++] = arr[negItr]*arr[negItr];
negItr--;
}
while(posItr < n) {
ans[idx++] = arr[posItr]*arr[posItr];
posItr++;
}
for(int i = 0; i < n; i++){
System.out.print(ans[i] + " ");
}
}
}