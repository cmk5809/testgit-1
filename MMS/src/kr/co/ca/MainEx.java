package kr.co.ca;

import java.util.Scanner;

import com.naver.Command;
import com.naver.GetListCommand;
import com.naver.InsertCommand;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Command[] com = {new InsertCommand(), 
						new GetListCommand(), 
				
				/*
				 * new GetMemberDTOByIdCommand(), new UpdateCommand(), new DeleteCommand()
				 */
				 };
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("0: ���, 1: ��ȸ, 2: ����");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu != com.length) {
				com[menu].execute(sc);
			}else {
				isTrue = false;
			}
		}
		
		
		
		sc.close();
	}

}
