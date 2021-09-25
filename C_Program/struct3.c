//create a structure employee with members empno, empname, designation and salary.

struct employee
{
	int empno;
	char empname[20];
	char desig[20];
	float salary;
};

int main()
{
	struct employee e1;
	
	e1.empno=123;
	strcpy(e1.empname,"Monish");
	strcpy(e1.desig,"Manager");
	e1.salary=50000.0f;
	
	printf("\n employee no. = %d",e1.empno);
	printf("\n employee name = %s",e1.empname);
	printf("\n employee designation = %s",e1.desig);
	printf("\n salary = %.2f",e1.salary);
	
}