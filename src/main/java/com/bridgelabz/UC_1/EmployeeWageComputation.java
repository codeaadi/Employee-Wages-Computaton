package com.bridgelabz.UC_1;


	public class EmployeeWageComputation  {
		void checkEmployeeAttendence() {
		 	   int IS_FULL_TIME = 1;
		 	   double empCheck = Math.floor(Math.random() * 10)%2;
		 	   if(empCheck == IS_FULL_TIME)
		 		   System.out.println("Employee is present");
		 	   else
		 		   System.out.println("Employee is Absent");
		}
//		 	  public static void main(String[] args) {
//		 				EmployeeWageComputation  Emp = new EmployeeWageComputation ();
//		 				Emp.checkEmployeeAttendence();

		    
	//UC-2
		//Daily Employee Wage
		void checkDailyWages() {
			int IsFullTime=1;
		    int EmployeeRatePerHr=20;
		    int FulldayHr=8;
		    
		    double employeeCheck = Math.floor(Math.random() * 10) %2;
			if ( employeeCheck == IsFullTime ) {
				System.out.println( "EmployeeFulldaywage = " + ( FulldayHr * EmployeeRatePerHr));
			}
				else {
					System.out.println ("Employeewage=" + (0));
				}
		}
		
//		public static void main(String[] args) {
//			EmployeeWageComputation  Emp = new EmployeeWageComputation ();
//			Emp.checkDailyWages();
		
	
		//UC-3
		void checkPartimeandFulltimeWages() {
			int IsFullTime = 1;
		    int IsPartTime= 2 ;
		    int EmployeeRatePerHr= 20;
		    int empHrs= 0;
		    int empWage= 0;
		    
		    double employeeCheck = Math.floor(Math.random() * 10) %3;
			if ( employeeCheck == IsFullTime ) {
				empHrs= 8;
			}
				else if ( employeeCheck == IsPartTime){		
					empHrs=4;
				}
			empWage = empHrs * EmployeeRatePerHr;
		System.out.println("empWage : =" + empWage);
		}

//		public static void main(String[] args) {
//			EmployeeWageComputation  Emp = new EmployeeWageComputation ();
//				Emp.checkPartimeandFulltimeWages();
	}
	//UC-5----------------
		void employeeMonthlyWage() {
			int fullTime = 2;
			int partTime = 1;
			int employeeWagePerHour = 20;
			int workingDaysPerMonth = 20;
			int employeeHrs = 0;
			int employeeWage = 0;
			int monthlyWage = 0;
			for (int day = 0; day < workingDaysPerMonth; day++) {
				int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (employeeCheck) {
				case 1:
					employeeHrs = 16;
					break;
				case 2:
					employeeHrs = 8;
					break;
				default:
					employeeHrs = 0;

				}
				employeeWage = employeeHrs * employeeWagePerHour;
				monthlyWage += employeeWage;
				System.out.println("Employee wage:" + employeeWage);
			}
			System.out.println("Total Employee Wage " + monthlyWage);
		}
//		public static void main(String[] args) {
//			EmployeeWageComputation Emp = new EmployeeWageComputation();
//			Emp.employeeMonthlyWage();
	

		//UC-6
		void employeeMonthlyWageWhileloop() {

					int employeeWagePerHour = 20;
					int workingDaysPerMonth = 20;
					int employeeHrs = 0;
					int employeeWage = 0;
					int totalEmployeeHours=0;
					int maximumHoursInMonth=100;
					int totalWorkingDays=0;
					while(totalEmployeeHours<= maximumHoursInMonth &&
							totalWorkingDays<workingDaysPerMonth) {
						totalWorkingDays++; {
						int employeeCheck=(int)Math.floor(Math.random() *10) %3;
						 switch(employeeCheck) {
						 case 1 :
							 employeeHrs=16;
							 break;
						 case 2 :
							 employeeHrs=8;
							 break;
							 default:
								 employeeHrs=0;

						 }
						 employeeWage = employeeHrs * employeeWagePerHour;

						totalEmployeeHours += employeeHrs;
						 System.out.println("Day#: " + totalWorkingDays + " EmpHour: " +employeeHrs);
					}
					int totalEmployeeWage= totalEmployeeHours * employeeWagePerHour;
					System.out.println("Total Employee Wage " +totalEmployeeWage);
					}
		}
					public static void main(String[] args) {
						EmployeeWageComputation Emp = new EmployeeWageComputation();
						Emp.employeeMonthlyWageWhileloop();
					}
		}
		
	
	
