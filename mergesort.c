#include<stdio.h>
#include<stdlib.h>

void merge(int a[],int left[],int right[],int Ln,int Rn) // Ln and Rn are the length of left and right array
{
    int i,j,k;
    i=0;j=0;k=0;

    while(i<Ln && j<Rn)
    {
        if(left[i]<right[j])
        {
            a[k]=left[i];
            k=k+1;
            i=i+1;
        }
        else
        {
            a[k]=right[j];
            k=k+1;
            j=j+1;
        }
    }
    while(i<Ln)
    {
        a[k]=left[i];
        k=k+1;
        i=i+1;
    }
    while(j<Rn)
    {
        a[k]=right[j];
        j=j+1;
        k=k+1;
    }

}
void mergesort(int a[],int n)
{
    int mid;
    if(n<2)
    {
        return;
    }
    mid=n/2;

  int n1=mid;
  int n2=n-mid;
  int left[n1];
  int right[n2];
    for(int i=0;i<mid;i++)
    {
        left[i]=a[i];
    }

    for(int i=mid;i<n;i++)
    {
        right[i-mid]=a[i];
    }
    mergesort(left,mid);

    mergesort(right,n-mid);

    merge(a,left,right,mid,n-mid);

    free(left);
    free(right);
}
void main()
{
    int a[]={3,60,345,40,20,80,44,67,23,65};

    int n= sizeof(a)/sizeof(a[0]);

    mergesort(a,n);

    for(int i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
}
