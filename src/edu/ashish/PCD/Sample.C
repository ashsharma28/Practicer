




void drawDashed(double x1,double y1, double x2, double y2, int choice);

void main()
{
	double x1=0, y1=0, x2=0 , y2=0, dx=0, dy=0, x=0, y=0, p=0 ;
	int i=0, choice;

	int gdriver = DETECT, gmode, errorcode, width;


	/* initialize graphics and local variables */
	initgraph(&gdriver, &gmode, "");

	/* read result of initialization */
	errorcode = graphresult();
	/* an error occurred */
	if (errorcode != grOk)
	{
	   printf("Graphics error: %s\n", grapherrormsg(errorcode));
	   printf("Press any key to halt:");
	   getch();
	   exit(1);
	}



	printf("Enter the first X-coordinate: ");
	scanf("%lf" , &x1);
	printf("Enter the first Y-coordinate: ");
	scanf("%lf" , &y1);
	printf("Enter the second X-coordinate: ");
	scanf("%lf" , &x2);
	printf("Enter the second Y-coordinate: ");
	scanf("%lf" , &y2);
	printf("What type of line do u wany\n\t1.Solid\n\t2.Dashed\n---->");
	scanf("%d" , &choice);

	clrscr();
	putpixel(x1, y1, 14);


	drawDashed( x1, y1, x2, y2, choice );


	getch();

	}


void drawDashed(double x1,double y1, double x2, double y2, int choice)
{

double dx=0, dy=0, x=0, y=0, p=0 ;
int i=0;

	dx = x2- x1 ;
	dy = y2- y1 ;

	p = (2*dy) - dx ;
	x = x1;
	y = y1;




switch(choice)
{
	case 1:
	while( x < x2)
	{
		if(p<0)
		{
			x = x+1;
			//if( i%10 == 0 )
			putpixel(x, y, BLACK);
			p = p + (2*dy) ;
		}
		else
		{
			x = x+1; y = y+1;
			//if( i%10 == 0 || i%10 == 3 || i%10 == 6 || i%10 == 6 )
			putpixel(x, y, BLACK);
			p = p +( (2*dy) - (2*dx) ) ;
		}


		i++;
	}
	break;


	case 2:
	while( x < x2)
	{
		if(p<0)
		{
			x = x+1;
			if( i%10 == 0 )
			putpixel(x, y, RED);
			p = p + (2*dy) ;
		}
		else
		{
			x = x+1; y = y+1;
			if( i%10 == 0 || i%10 == 3 || i%10 == 6 || i%10 == 6 )
			putpixel(x, y, i%6);
			p = p +( (2*dy) - (2*dx) ) ;
		}


		i++;
	}
	break;

	default: printf("Please Enter a right value");
	break;

}


}
