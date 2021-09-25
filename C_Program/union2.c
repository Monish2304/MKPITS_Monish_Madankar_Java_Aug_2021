//example of declaring union variable inside main function.

union data 
{
	int i;
	float j;
	char name[10];
}d1;

int main()
{
	union data d1;
	
	d1.i=20;
	printf("\n value of i = %d",d1.i);
	d1.j=20.2f;
	printf("\n value of j = %.2f",d1.j);
	strcpy(d1.name,"amit");
	printf("\n name = %s",d1.name);
	
	printf("\n now value of j = %f",d1.j);
}