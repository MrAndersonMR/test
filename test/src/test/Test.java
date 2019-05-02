package test;

class test {
	public static void main(String args[]) {
		int array[][] = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				array[i][j]=i+1;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}