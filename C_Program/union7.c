//create a union customer with members custid(int), custname(char array), mobileno(double).

union customer
{
	int custid;
	char custname[20];
	long int mobileno;
}c1;

int main()
{
	union customer c1;
	
	//printf("\n memory accupied by data = %d",sizeof(c1));
	
	printf("\n enter custid: ");
	scanf("%d",&c1.custid);
	printf("\n enter name: ");
	scanf("%s",c1.custname);
	printf("\n enter mobile no: ");
	scanf("%ld",c1.mobileno);
	
	printf("\n again print cust name = %s",c1.custname);
}