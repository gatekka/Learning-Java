public class MultiDimensionalArray
{
 public static void main(String[] args)
 {

  //3D array that consists of four 2D arrays, each with different sizes of rows and columns.
  int[][][] a =
  {
   {{1,2,3}, {4,5,6}, {13,14,15},},
   {{7,8,9}, {10,11,12}},
   {{16,17,18},{19,20,21},{22,23,24,25,26},{27,28,29,30}},
   {{},{},{},{31,32,33,34}}
  };

  // Prints all elements in array
  for (int x = 0; x<a.length; x++)
  {
    System.out.println("Layer " + x + ":");
    for (int y = 0; y<a[x].length; y++)
    {
     System.out.println("\tRow " + y + ":");
     for (int z = 0; z<a[x][y].length; z++)
      {
        System.out.print(String.format("\t\t[%o][%o][%o] = ", x, y, z));
        System.out.println(a[x][y][z]);
      }
      System.out.println("\t---End of row " + y + "---");
    }
    System.out.println("\t***End of layer " + x + "***");
  }
  System.out.println("\nArray Complete");
 } 
}
