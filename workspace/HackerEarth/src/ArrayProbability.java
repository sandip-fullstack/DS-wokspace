import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayProbability {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String testCase = buffer.readLine();
		int testNum = Integer.parseInt(testCase);
		for (int i = 0; i < testNum; i++) {
			String input1String = buffer.readLine();
			int n = Integer.parseInt(input1String.split(" ")[0]);
			int q = Integer.parseInt(input1String.split(" ")[1]);
			String arrayString = buffer.readLine();
			int inputArray[] = new int[n];
			String[] splitArrayString = arrayString.split(" ");
			for (int j = 0; j < splitArrayString.length; j++) {
				inputArray[j] = Integer.parseInt(splitArrayString[j]);
			}
			for (int k = 0; k < q; k++) {
				float probEven = 0;
				float probOdd = 0;
				String queryString = buffer.readLine();
				String[] queryStringArray = queryString.split(" ");
				int L, R;
				switch (queryStringArray[0]) {

				case "0":
					L = Integer.parseInt(queryStringArray[1]);
					R = Integer.parseInt(queryStringArray[2]);
					int evenCount = 0;
					int totalCount = 0;

					for (int s = L; s <= R; s++) {
						totalCount++;
						if (inputArray[s - 1] % 2 == 0) {
							evenCount++;
						}
					}
					probEven = (float) evenCount / (float) totalCount;
					if (probEven == 0.0) {
						System.out.println("0");
					} else if (probEven == 1.0) {
						System.out.println("1");
					} else {
						System.out.println(evenCount + " " + totalCount);
					}
					break;
				case "1":
					L = Integer.parseInt(queryStringArray[1]);
					R = Integer.parseInt(queryStringArray[2]);
					int oddCount = 0;
					int totalCountOdd = 0;
					for (int s = L; s <= R; s++) {
						totalCountOdd++;
						if (inputArray[s - 1] % 2 != 0) {
							oddCount++;
						}
					}
					probOdd = (float) oddCount / (float) totalCountOdd;
					if (probOdd == 0.0) {
						System.out.println("0");
					} else if (probOdd == 1.0) {
						System.out.println("1");
					} else {
						System.out.println(oddCount + " " + totalCountOdd);
					}
					break;
				case "2":
					L = Integer.parseInt(queryStringArray[1]);
					R = Integer.parseInt(queryStringArray[2]);
					int K = Integer.parseInt(queryStringArray[3]);
					for (int p = L; p <= R; p++) {
						inputArray[p - 1] = inputArray[p - 1] + K;
					}
					break;
				}
			}
		}

	}
}
