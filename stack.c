#include<stdio.h>
#include<process.h>
#include<stdlib.h>

int stack[10],top=-1,n=10;	
void push()
 {
    int val;
 	if(top==n-1)
 	{
 		printf("Stack is full");
	 }
	 else
	 {
	 	printf("Enter value to be pushed");
	 	scanf("%d",&val);
	 	top++;
	 	stack[top]=val;
	 	
	 }
 }	
 void pop()
 {
 	int temp;
 	if(top==-1)
 	{
 		printf("stack is empty");
 		
	}
	else
	{
		printf("stack is popped !!");
		temp=stack[top];
		top--;
	 } 
 }
 void display()
 {
    int i;
   
    if(top==-1){
    	printf("Stack is empty");
	}
	else{
	 printf("Stack is");
 	for( i=top;i>=0;i--)
 	{
 		printf("%d",stack[i]);
 	
	 }
}
 }
void main()
{
char ch;
while(1)
{
 printf("\n Enter your choice \n 1.push \n 2.pop \n 3.display \n 4.exit ");
 scanf("%d",&ch);
 switch(ch)
 {
 	case 1: push();
 	break;
 	case 2: pop();
 	break;
 	case 3:  display();
 	break;
 	case 4: exit(0);
 	defaut: printf("wrong choice");
 }
 
 
}
	
}
