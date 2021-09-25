//create a program to accept 10 subject marks in array and then pass this array to function calculate_result,
//percentage, grade.

int main()
{
	int marks[10],i;
	for(i=0;i<10;i++)
	{
		printf("\n enter 10 subjects marks: ");
		scanf("%d",&marks[i]);
	}
	calculate_result(marks);
 } 
 void calculate_result(int marks[])
 {
 	int total=0,i;
 	float per;
 	for(i=0;i<10;i++)
 	{
 		total=total+marks[i];
	 }
	 printf("\n total marks = %d",total);
	 per=(float)(total/1000.0f)*100.0f;
	 printf("\n percentage = %.2f",per);
	 
	 if(per>=75)
	 {
	 	printf("\n Grade = A");
	 }
	 else if(per>60 && per<75)
	 {
	 	printf("\n Grade = B");
	 }
	 else
	 {
	 	printf("\n fail");
	 }
 }