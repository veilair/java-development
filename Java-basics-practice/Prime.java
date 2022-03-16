
// This script aims at getting the prime numbers with the range of 1-100 with sieve of Eratosthenes

public class Prime{
	public void filter(int a, int[] candidate){
		for(int i=2;i<candidate.length;i++){
			if(candidate[i]==1){
				if((i>a) && (i%a==0)){
					candidate[i]=0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Prime check = new Prime();
		int judge[] = new int[101];  
        	for(int i=2;i<=100;i++){
			judge[i]=1;
		}
		for(int j=2;j<=Math.sqrt(100);j++){
			check.filter(j,judge);
		}
		for(int k=2;k<=100;k++){
			if(judge[k]==1){
				System.out.println(k);
			}
		}
	}
}
