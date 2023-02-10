import java.util.*;
class MisNums{	
public static void Mels(int arr1[],int num)								
{
  int[] arr2 = new int[arr1[num-1]+1];
  for(int i=0;i<num;i++)
   {
     arr2[arr1[i]]=1;
   }
  for(int i=arr1[0];i<=arr1[num-1];i++)
   {
     if(arr2[i] == 0)
      {
        System.out.println(i+" ");
      }
   }
}
public static void main (String[] args)
 {
	
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr1[] = new int[n];
   
   for(int i=0; i<n; i++) {
       arr1[i] = sc.nextInt();
    }
    Mels(arr1, n);
 }
}