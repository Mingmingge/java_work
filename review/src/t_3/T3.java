package t_3;
public class T3 {

	public static void main(String[] args) {

	 int a[][]={{7,8,9},{3,6,5}}; 
         int b[][]={{3,5,2,1},{8,9,3,-5},{7,3,-4,-1}}; 
		
         int c[][]= new int[2][4];                 
         
         for(int i=0;i<2;i++)
           for(int j=0;j<4;j++)
        	   for(int k=0;k<3;k++)
                  c[i][j] += a[i][k] * b[k][j];

         for(int i=0;i<2;i++){
            for(int j=0;j<4;j++)
      	      System.out.print(c[i][j] + " "); 
            System.out.println();
         }
	}
}
