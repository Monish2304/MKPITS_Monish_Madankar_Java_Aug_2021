#include<stdio.h>
enum days{sunday=1,monday,tuesday,wednesday,thursday,friday,saturday};
int main()
{
	enum days d;
	d=saturday;
	switch(d)
	{
		case sunday:
			printf("\n Today is Sunday");
			break;
		case monday:
			printf("\n Today is Monday");
			break;
		case tuesday:
			printf("\n Today is Tuesday");
			break;
		case wednesday:
			printf("\n Today is Wednesday");
			break;
		case thursday:
			printf("\n Today is Thursday");
			break;
		case friday:
			printf("\n Today is Friday");
			break;
		case saturday:
			printf("\n Today is Saturday");
			break;				
	}
}