//wap to accept age and print whether the person is elegible to vote or not.

#include<stdio.h>
void main() {
	int age;
	printf("enterthe age: ");
	scanf("%d",&age);
	if (age>=18) {
		printf("the person is eligible to vote");
	}
	else {
		printf("the person is not eligible to vote");
	}
}