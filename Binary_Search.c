#include<stdio.h>
int main()
{
   int n=5;
    int arr[n];
    printf("Enter 5 elements\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int first,last,middle,search;
    printf("Enter search element\n");
    scanf("%d",&search);
    first=0;
    last=n-1;
    middle=(first+last)/2;
    while(first<=last)
    {
        if(arr[middle]<search)
        {
            first=middle+1;
        }
        else if(search==arr[middle])
        {
            printf("%d Found at index %d",search,middle+1);
            break;
        }
        else{
            last=middle-1;
        }
        middle=(first+last)/2;
    }
}
