//create an array of 3 elements and pass it to the function display to display the elements of an array.

int main()
{
	int arr[3]={1,2,3};
	display(arr);
}

void display(int arr[])
{
	printf("\n arr[0] = %d",arr[0]);
	printf("\n arr[1] = %d",arr[1]);
	printf("\n arr[2] = %d",arr[2]);
}