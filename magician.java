import java.util.Scanner;

class magician {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N[]=new int[T];
		int X[]=new int[T];
		int S[]=new int[T];

		int A[][]=new int[T][10000];
		int B[][]=new int[T][10000];

		for(int i=0;i<T;i++)
		{
			N[i] = sc.nextInt();
			X[i] = sc.nextInt();
			S[i] = sc.nextInt();

			for(int j=0;j<S[i];j++)
			{
				A[i][j] = sc.nextInt();
				B[i][j] = sc.nextInt();	
			}
		}
		sc.close();
		int pos;
		for(int i=0;i<T;i++)
		{
			pos=X[i];
			for(int j=0;j<S[i];j++)
			{
				if(pos==A[i][j])
					pos=B[i][j];
				else if(pos==B[i][j])
					pos=A[i][j];

			}

			System.out.println(pos);


		}


	}


}



