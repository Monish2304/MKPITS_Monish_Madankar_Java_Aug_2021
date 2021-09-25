//create a structure employee with members empid, empname, designation and salary accept the value from the user

struct employee
{
	int empid;
	char empname[20];
	char desig[20];
	float salary;
};

int main()
{
	struct employee e1;
	
	printf("\n enter employee id: ");
	scanf("%d",&e1.empid);
	printf("\n enter employee name: ",e1.empname);
	scanf("%s",&e1.empname);
	printf("\n enter designation: ");
	scanf("%s",&e1.desig);
	printf("\n enter salary: ");
	scanf("%f",&e1.salary);
	
	printf("\n employee details are: ");
	printf("\n employee id = %d",e1.empid);
	printf("\n employee name = %s",e1.empname);
	printf("\n designation = %s",e1.desig);
	printf("\n salary = %.2f",e1.salary);
}