import java.util.Scanner;

public class CEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n= sc.nextInt();
		int project = 0;
		int developer = 0;
		for(int i = 0;i<n;i++){
			String input = sc.next();
			if(input.equalsIgnoreCase("NewProject")){
				project ++;
				if(developer>0){
					developer --;
					project --;
				}
			}
			else {
				developer +=Integer.parseInt(input);
				
			}
		}
		if(project - developer <= 0)
			System.out.println(0);
		else System.out.println(project - developer);
	}

}
