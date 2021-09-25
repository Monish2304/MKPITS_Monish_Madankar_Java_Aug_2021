//create an array of 3 elements and pass it to the function display using for loop to display the array elements

int main()
{
	int arr[3]={1,2,3};
	display(arr);
}

void display(int arr[])
{
	int i;
	for(i=0;i<3;i++)
	{
		printf("\n arr[%d] = %d",i,arr[i]);
	}
}