package Recurssion;

public class SubArray_MinAvg {

	public static void main(String[] args) {
		int[] a= {3,7,90,20,5,50,40};
		int k=3;
		int minIndex=0;
		int minAvg=Integer.MAX_VALUE;
		for(int i=0; i<a.length-k+1; i++)
		{
			int sum=giveSum(a,i,i+k-1);
			if(sum/k<minAvg)
			{
				minAvg=sum/k;
				minIndex=i;
			}
		}
		System.out.println(minAvg);
		System.out.println(minIndex);
	}

	private static int giveSum(int[] a, int i, int j) {
		if(i<=j)
			return a[i]+giveSum(a, i+1, j);
		return 0;
	}

}
