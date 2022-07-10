package com.project.client;

import java.util.Scanner;

import com.project.presentation.EmployeeProjectPresentation;
import com.project.presentation.EmployeeProjectPresentationImpl;

public class Client {

	public static void main(String[] args) {
		EmployeeProjectPresentation employeePresentation=new EmployeeProjectPresentationImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
					
		}

	}

}
