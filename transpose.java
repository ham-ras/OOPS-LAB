import java.util.*;
class transpose
{
  public static void main(String args[])
  {
    int[][] arr1=new int[10][10];
    int[][] arr2=new int[10][10];
    int flag = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("Enter the matrix : ");
int i,j;
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      { 
        arr1[i][j] = s.nextInt();
      }
    }
   
    System.out.println("Transpose of the matrix : ");
    for(i=0;i<3;i++)
    {
      System.out.println();
      for(j=0;j<3;j++)
      { 
        arr2[i][j] = arr1[j][i];
	System.out.print(arr2[i][j] + " ");
      }
    }
   
    
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      { 
        if(arr1[i][j] != arr2[i][j])
        {
          flag = 1;
          break;
        }
      }
    }

    if(flag==1)
     System.out.println("Transpose of the matrix is not equal");
    else
      System.out.println("Transpose of the matrix is equal ");
 }
}










