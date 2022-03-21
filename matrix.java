import java.util.*;
class matrix
{
  public static void main(String args[])
  {
    int[][] arr1=new int[10][10];
    int[][] arr2=new int[10][10];
    int[][] sumarr=new int[10][10];
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the first matrix : ");
int i,j;
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      { 
        arr1[i][j] = s.nextInt();
      }
    }
    
    System.out.println("Enter the second matrix : ");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      { 
        arr2[i][j] = s.nextInt();
      }
    }
   
    System.out.println("Sum of matrix : ");
    for(i=0;i<3;i++)
    {
      System.out.println();
      for(j=0;j<3;j++)
      { 
        sumarr[i][j] = arr1[i][j] + arr2[i][j];
        System.out.print(sumarr[i][j] + " ");
      }
    }
    
  }
}
