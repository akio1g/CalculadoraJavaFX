package application;

public class teste {

	public static void main(String[] args) {
		int j = 1;
		int x = 0;
		Integer[] vetor = new Integer[10];
		
		
		System.out.println("****************");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null) {
				vetor[i] = 1;
				break;
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null) {
				vetor[i] = 1;
				break;
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null) {
				vetor[i] = 1;
				break;
			}
		}
		for(Integer z: vetor) {
			System.out.println(z);
		}
		
		int i = 9;
		j = 1;
		while (vetor[i] == null) {
			i--;
			if (vetor[i] != null) {
				while (i >= 0) {
					if (i == 0) {
						x += (vetor[i] * j);
						j *= 10;
						break;
					} else {
						x += (vetor[i] * j);
						j *= 10;
						i--;
					}
				}
			}
		}
		String res = "R: " +x;
		System.out.println(res);
	}

}
