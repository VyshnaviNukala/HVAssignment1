
import java.util.*;
class UniNum{ 
static void Distinct(int un[], int Num)
{
  for(int i=0;i<Num;i++)
  {
     int j;
     for(j=0;j<i;j++)
     if(un[i]==un[j])
         break;
     if(i == j)
       System.out.print(un[i]+" ");
   }
}
public static void main (String[] args)
 {
      Scanner sc=new Scanner(System.in);
      int Num=sc.nextInt();
      int un[]=new int[Num];
      for(int i=0; i<Num; i++) {
        un[i]=sc.nextInt();
      }
      Distinct(un, Num); 
    }
}