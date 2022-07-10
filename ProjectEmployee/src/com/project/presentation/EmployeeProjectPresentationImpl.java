package com.project.presentation;

import java.util.Scanner;

import com.project.bean.Employee;
import com.project.bean.Project;
import com.project.service.EmployeeService;
import com.project.service.EmployeeServiceImpl;
import com.project.service.ProjectService;
import com.project.service.ProjectServiceImpl;

public class EmployeeProjectPresentationImpl implements EmployeeProjectPresentation {

	private EmployeeService employeeService = new EmployeeServiceImpl();
	private ProjectService projectService = new ProjectServiceImpl();
	
	private Employee empl;
	private Project prj;
	
	private int empid;
	private int pid;
	
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Project Allocation Portal!!");
		System.out.println("1. Show all Employees");
		System.out.println("2. Show Employee by ID");
		System.out.println("3. Show all Projects");
		System.out.println("4. Show Project by ID");
		System.out.println("5. Allocate");
		System.out.println("6.Reallocate/Deallocate Employee");
		System.out.println("7. Project wise Employee Details");
		System.out.println("8. Exit");
		
	}

	@Override
	public void performMenu(int choice) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			
			switch (choice) {
			case 1:
				Employee[] employees = employeeService.getAllEmployees();
				for(Employee employee:employees) {
					System.out.println(employee.getEmpId()+"  "+employee.getEmpName());
				}
				break;

			case 2:
				System.out.println("Enter Employee ID : ");
				empid=sc.nextInt();
				empl=employeeService.search(empid);
				if(empl!=null) {
					System.out.println(empl.getEmpId()+"  "+empl.getEmpName() + " " +empl.getpId());
				}
				else
					System.out.println("Employee with id "+empid+" does not exist");
				break;

			case 3:
				Project[] projects = projectService.getAllProjects();
				for(Project project:projects) {
					System.out.println(project.getProjectId()+"  "+project.getDept());
				}
				break;

			case 4:
				System.out.println("Enter Project ID : ");
				pid=sc.nextInt();
				prj=projectService.searchProject(pid);
				if(prj!=null) {
					System.out.println(prj.getProjectId()+"  "+prj.getDept()+ prj.getCount());
				}
				else
					System.out.println("Project with id "+pid+" does not exist");
				break;

			case 5:
				System.out.println("Enter Employee ID: ");
				empid=sc.nextInt();
				empl=employeeService.search(empid);
				
				if(empl!=null) {
					
					System.out.println("Enter Project ID for allocation:");
					pid=sc.nextInt();
					prj=projectService.searchProject(pid);
					
					if(prj!=null) {
						
						if(employeeService.allocateProject(empl, prj)) {
							System.out.println("Allocation successful");
						}
						else {
							System.out.println("Allocation failed");
						}
					}
					else {
						System.out.println("Project with id "+pid+" does not exist");
					}
					
				}
				else {
					System.out.println("Employee with id "+empid+" does not exist");
				}
				break;

			case 6:
				System.out.println("Enter Employee ID: ");
				empid=sc.nextInt();
				empl=employeeService.search(empid);
				
				if(empl!=null) {
					
					System.out.println("Enter Project ID for reallocation/deallocation: ");
					pid=sc.nextInt();
					prj=projectService.searchProject(pid);
					
					if(prj!=null) {
						
						Project prj1 = projectService.searchProject(empl.getpId());
						if(employeeService.reallocateProject(empl, prj1, prj)) {
							System.out.println("Allocation successful");
						}
						else {
							System.out.println("Allocation failed");
						}
					}
					else {
						System.out.println("Project with id "+pid+" does not exist");
					}
					
				}
				else {
					System.out.println("Employee with id "+empid+" does not exist");
				}
				
				break;

			case 7: 
				Project[] projectList = projectService.getAllProjects();
				for(Project project:projectList) {
					System.out.println("Employees in Project: "+project.getProjectId()+" /Department: "+project.getDept()+"  ===  " +project.getCount());
					Employee[] emp = employeeService.getEmployeebyProject(project);
					for(Employee empl: emp) {
						System.out.println(empl.getEmpId()+" "+empl.getEmpName());
					}
				}
				break;
				
			case 8:
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong Choice!!");
				break;
			}
			
		} catch (Exception e) {
			
		}
	}

}
