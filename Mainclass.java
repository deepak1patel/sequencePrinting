class PattrenMatrix{
  static int mat[][] = new int[4][4];
  static int num = 1;
  static int Xstart = 0, Ystart = 0;
  static int Xend = 3, Yend = 3;




// creates the matrix which contains the sequence
  static void matrixMaking(){
    int i = 0;
    char[] pat = {'E','S','W','N'};
    while(num <=16){
      // System.out.println("sent");
      if(i>3){
        i=0;
      }
      direction(pat[i]);
      i++;
      }
    }



  static void direction(char dir){
    int i,j;
    switch(dir){
      case 'N': //System.out.println("North");
                j = Xstart;
                for(i = Yend;i >= Ystart;i--){
                    mat[i][j] = num;
                    num++;
                }
                Xstart++;
                break;
      case 'E': //System.out.println("East");
                i = Ystart;
                for(j = Xstart;j <= Xend;j++){
                    mat[i][j] = num;
                    num++;
                }
                Ystart++;
                break;
      case 'S': //System.out.println("South");
                j = Xend;
                for(i = Ystart;i <= Yend;i++){
                    mat[i][j] = num;
                    num++;
                }
                Xend--;
                break;
      case 'W': //System.out.println("West");
                i = Yend;
                for(j = Xend;j >= Xstart;j--){
                    mat[i][j] = num;
                    num++;
                }
                Yend--;
                break;
    }

  }

  // prints the matrix which contains the sequence
  static void matrixPrinting(){
    for(int i = 0;i < 4; i++){
      for(int j = 0;j < 4;j++){
        if(mat[i][j]<=9){
          System.out.print(" ");
        }
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
}
class Mainclass{
  public static void main(String[] dp){
    PattrenMatrix.matrixMaking();
    PattrenMatrix.matrixPrinting();
  }
}
