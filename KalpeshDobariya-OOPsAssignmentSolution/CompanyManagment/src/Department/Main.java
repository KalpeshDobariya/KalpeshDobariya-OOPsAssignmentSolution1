package Department;

public class Main {
	
public static void main (String args[]) {
	
	
	SuperDepartment obj=new AdminDepartment();
	obj.departmentName();
	obj.getTodaysWork();
	obj.getWorkDeadline();
	obj.isTodayAHoliday();
	
	SuperDepartment obj1=new HrDepartment();
	obj1.departmentName();
	((HrDepartment) obj1).doActivity();
	obj1.getTodaysWork();
	obj1.getWorkDeadline();
	obj1.isTodayAHoliday();
	
	SuperDepartment obj2=new TechDepartment();
	obj2.departmentName();
	obj2.getTodaysWork();
	obj2.getWorkDeadline();
	((TechDepartment) obj2).getTechStackInformation();
	obj2.isTodayAHoliday();
	
	
}
}
