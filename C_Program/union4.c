//example of union displaying corrupted values of i and j.

union data
{
	int i;
	float j;
	char name[10];
}d1;

int main()
{
	//printf("\n memory accupied by data = %d",sizeof(d1));
	
	d1.i=20;
	printf("\n value of i = %d",d1.i);
	d1.j=20.2f;
	printf("\n value of j = %.2f",d1.j);
	strcpy(d1.name,"amit");
	printf("\n name = %s",d1.name);
	
	printf("\n now value of i = %d",d1.i);
	printf("\n now value of j = %f",d1.j);
	printf("\n name = %s",d1.name);
}