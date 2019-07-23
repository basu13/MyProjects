#include<stdio.h>
#include <stdlib.h>
#include<time.h>
#define size 5
int p[size];
struct team{
		char name[30];
		int wins;
}A,B;
void display()
{
   printf("\n\n\t************************************************************************************************************\n\t************************************************************************************************************\n\t**\t\t\t\t\t\t\t\t\t\t\t\t\t  **\n\t**\t***     ***  ***  ***       ***\t\t   **********   **********   ***       ***  *********\t  **\n\t**\t****    ***  ***  *****   *****\t\t  ****    ****  ***    ***   *****   *****  ***    **\t  **\n\t**\t*****   ***  ***  *** ** ** ***\t\t  ***           ***    ***   *** ** ** ***  ***      \t  **\n\t**\t*** *** ***  ***  ***  ***  ***\t\t  ***   ******  **********   ***  ***  ***  ******   \t  **\n\t**\t***   *****  ***  ***   *   ***\t\t  ****    ****  **********   ***   *   ***  ***      \t  **\n\t**\t***     ***  ***  ***       ***\t\t   ****  *****  ***    ***   ***       ***  ***    **\t  **\n\t**\t***     ***  ***  ***       ***\t\t    *********   ***    ***   ***       ***  *********\t  **\n\t**\t\t\t\t\t\t\t\t\t\t\t\t\t  **\n\t************************************************************************************************************\n\t************************************************************************************************************\n");
	printf("\tNim is a combinatorial game, where two players alternately take turns in taking objects from several heaps\n");
	printf("\n\tRules:-\n\n");
	printf("\t1. Each player must take at least one object on their turn.\n");
	printf("\t2. They may take more than one object in a single turn, as long as they all come from the same heap.\n");
	printf("\t3. It's allowed to make a tower empty,effectively removing the tower out of the game.\n");
	printf("\t4. Game gives the win to the last player making a move.\n");
}
void showpile()
{
    /*int i=1;
     for(i=0;i<5;i++)
       {
        printf("Tower %d : ",i+1);
        int j;
        for(j=0;j<p[i];j++)
         printf(" [] ");
         printf("\n");
       }
    printf("\n\n\n");*/
   	int i,j,d,max=p[0];
        int arr[5];
        for(int i=0;i<5;i++)
         arr[i]=p[i];
	for(i=0;i<5;i++)
	{  
	     //printf("TOWER %d :\t",i+1);
	     if(arr[i]>max)
	     max=arr[i];
		 
	}
	printf("\n\n");
	for(j=1;j<=max;j++)
	{  
	    
	    for(i=0;i<5;i++)
	    {
	        d=max-arr[i];
	        if(d>0)
	        {
	            printf("\t \t");
	            ++arr[i];
	        }
	        else
	        printf("\t[]\t");
	      }
	      printf("\n");
	   }
	   printf("\n");
	   printf("     ");
	   	for(i=0;i<5;i++)
	   	{
	    printf("Tower %d         ",i+1);
	   	}
      printf("\n\n");
}
int gameOver() 
{ 
    int i; 
    for (i=0; i<5; i++) 
        if(p[i]!=0) 
            return 1; 
    return 0; 
} 
void makemove(int p[],char turn)
{
   if(turn=='A')
    {
      int pn;
      int rem;
      aturn:
      printf("\n\n%s enter - Tower number and number of stone to remove.\n\n",A.name);
      scanf("%d%d",&pn,&rem);
      printf("\n");
	if(rem>p[pn-1] || rem==0)
	{
		printf("Invalid\n");
                goto aturn;	
	}
	else
	{
		p[pn-1]=p[pn-1]-rem;
		if(p[pn-1]<0)
		p[pn-1]=0;
		showpile();
	}
    }
    else
    {
      int pn;
      int rem;
      bturn:
      printf("\n\n%s enter - Tower number and number of stone to remove.\n\n",B.name);
      scanf("%d%d",&pn,&rem);
      printf("\n");
	if(rem>p[pn-1] || rem==0)
	{
		printf("Invalid\n\n");
               goto bturn;	
	}
	else
	{
		p[pn-1]=p[pn-1]-rem;
		if(p[pn-1]<0)
		p[pn-1]=0;
		showpile();
	}
    }
}
int main()
{
	A.wins=0;
	B.wins=0;
	display();
   int i;
   srand(time(0));
   printf("\n\nEnter 1st player name  :");
   scanf("%s",A.name);
   printf("\n\nEnter 2nd player name  :");
   scanf("%s",B.name);
	printf("\n\n");
    char turn ='A';
    int q=1;
     while(q){
	
		for(i=0;i<5;i++)
		{
	    	p[i]=rand()%10;
	    	if(p[i]==0)
	    	  p[i]=5;
	 	}    
   		showpile();
		int f=1;
   		while(f)
   		{
		    	 makemove(p,turn);
		    	 if(turn=='A')
		    	    turn='B';
		    	 else
		    	    turn='A';

			 f=gameOver();

   		}
   		if(turn=='B')
   		{
                 printf("\t\t\t\t\t\t\n\nWinner of this game %s \n\n\n",A.name);
   		 A.wins++;
                 turn='B';
                }
   		else
                {
    	         B.wins++;
                 turn='A';
		 printf("\t\t\t\t\t\t\n\nWinner of this game %s \n\n\n",B.name);
                }
    		
	
        printf("\t\t\tDo you want to play again ?[1/0].\n");
        scanf("%d",&q);
}
	
		printf("\n\n\n\n");
    	        printf("\t\t\t\t\t\t\t!!! GAME OVER !!!\n\n");
                printf("Total game played : %d\n\n",A.wins+B.wins);
                printf("%s win %d game.\n\n",A.name,A.wins);
                printf("%s win %d game.\n\n",B.name,B.wins);
          if(A.wins==B.wins)
                printf("\n\n\t\t\t\t!!! Game draw !!! \n\n");
    	  else if(A.wins>B.wins)
		printf("So, Winner is %s by %d - %d\n",A.name,A.wins,B.wins);
	  else
		printf("So, Winner is %s by %d - %d\n",B.name,B.wins,A.wins);
    
    	  printf("\n\n\n\n");
	
	return 0;
	
}
