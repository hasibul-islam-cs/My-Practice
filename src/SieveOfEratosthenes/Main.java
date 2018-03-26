package SieveOfEratosthenes;

class Sieve{
	int Prime[] = new int [30000], nPrime=0;
	int mark[] = new int [1000002];
	
	int SieveFunc(int n){
		int i, j, limit = (int) (Math.sqrt(n*1)+2);
		mark[1] = 1;
		
		for (i = 4; i<=n; i = i+2)
			mark[i]=1;
		
		Prime[nPrime++] = 2;
		
		for (i = 3; i<=n; i=i+2){
		
			if (mark[i]!=1){
				Prime[nPrime++] = i;
				if (i<=limit){
					for (j=i; j<=n; j= j+i*2){
						mark[j] = 1;
					}
				}
			}
		}
		
		return 0;
	}
}

public class Main {
	public static void main (String[] args){
		Sieve sv = new Sieve();
		sv.SieveFunc(100);
		for (int i = 0; i<sv.nPrime; i++){
			System.out.println(sv.Prime[i]);
		}
		
		System.exit(0);
	}
}
