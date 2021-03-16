import java.util.Scanner;

public class AtableMain{
	public static Scanner scan = new Scanner(System.in);
	public AtableMain() {
		ManagerAtable ma = new ManagerAtable();
		while(true){
			System.out.println("뭐할래 ? 1번 insert 2번 update 3번 delete 4번 select");
			int select = scan.nextInt();
			if(select == 1)
				ma.insertAtable();
			else if(select == 2)
				ma.updateAtable();
			else if(select == 3)
				ma.deleteAtable();
			else if(select == 4)
				ma.selectAtable();
			else
				System.exit(1);
		}
	}

	public static void main(String[] args) {
		new AtableMain();
	}

}









