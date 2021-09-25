//create structure student and accept values from the user.

struct student
{
	int rno;
	char name[20];
	char course[20];
	char addr[20];
	double mobno;
};

int main()
{
	struct student s1;
	
	printf("\n enter the roll no.: ");
	scanf("%d",&s1.rno);
	printf("\n enter the student name: ");
	scanf("%s",&s1.name);
	printf("\n enter the course: ");
	scanf("%s",s1.course);
	printf("\n enter the address: ");
	scanf("%s",&s1.addr);
	printf("\n enter the mobile no.: ");
	scanf("%d",&s1.mobno);
	
	printf("\n details of a student: ");
	printf("\n student roll no. = %d",s1.rno);
	printf("\n student name = %s",s1.name);
	printf("\n course = %s",s1.course);
	printf("\n address = %s",s1.addr);
	printf("\n mobile no = %d",s1.mobno);
	
}