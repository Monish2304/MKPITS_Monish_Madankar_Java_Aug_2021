#include<stdio.h>
enum weekdays{Sunday=1,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};
int main()
{
	enum weekdays w;
	w=Monday;
	printf("\n the value of w = %d",w);
}