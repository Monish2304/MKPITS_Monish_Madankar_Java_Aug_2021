//wap to accept age and print whether the person is minor, young or old.

#include<stdio.h>
void main() {
	int age;
	printf("enter the age of a person");
	scanf("%d",&age);
	if (age<18) {
		printf("the person is minor");
	}
	else if (age>=18 && age<40) {
		printf("the person is young");
	}
	else {
		printf("the person is old");
	}
}