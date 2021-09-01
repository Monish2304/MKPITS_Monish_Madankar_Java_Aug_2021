//create a structure student with members rno, name, course, address, mobileno.

struct student
{
	int rno;
	char name[20];
	char course[20];
	char addr[50];
	long int mobileno;
};

int main()
{
	struct student s1;
	s1.rno=21;
	strcpy(s1.name,"Monish");
	strcpy(s1.course,"Engineering");
	strcpy(s1.addr,"Ramtek");
	s1.mobileno=1234567891;
	
	printf("\n roll no.: = %d",s1.rno);
	printf("\n name: = %s",s1.name);
	printf("\n course: = %s",s1.course);
	printf("\n address: = %s",s1.addr);
	printf("\n mobile no: = %ld",s1.mobileno);
	
}