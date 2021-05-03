package Array2D;

public class TransporseOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c[][]={{7,9,3},{2,1,11},{4,1,3}};
int b[][]= new int[3][3];
for ( int i=0; i<c.length;i++){
	for(int j=0;j<c.length;j++){
		b[i][j]=c[j][i];
	System.out.print(b[i][j]+" ");
	}System.out.println();
}
}

}
