#include<stdio.h>
void main()
{
    int number[]={5,3,8,4,2};
    int n=5;
    for(int i=1;i<n;i++)
    {
        int temp=number[i];
        int j=i-1;
        while(j>=0 && temp<number[j])
        {
            number[j+1]=number[j];
            j=j-1;
        }
        number[j+1]=temp;
    }
    for(int i=0;i<n;i++)
    {
        printf("%d",number[i]);
    }
}
