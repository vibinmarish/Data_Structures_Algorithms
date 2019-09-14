#include<stdio.h>
void main()
{

int a[]={4,3,6,7,2};
int min,n=5;
for(int i=0;i<n-1;i++)
{
    min=i;
    for(int j=i+1;j<n;j++)
        {
        if(a[j]<a[min])
        {
            min=j;
        }
        }
        int temp=a[i];
        a[i]=a[min];
        a[min]=temp;
        }
    for(int i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }
}
