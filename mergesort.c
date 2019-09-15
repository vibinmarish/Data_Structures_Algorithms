#include<stdio.h>
#include<stdlib.h>

void Merge(int *A,int *L,int Ln,int *R,int Rn) // Rn is the Length of right array
{
	int i,j,k;

	i = 0; j = 0; k =0;

	while(i<Ln && j< Rn)
    {
		if(L[i]  < R[j])
		{
            A[k] = L[i];
            k=k+1;
            i=i+1;
		}
        else
         {
            A[k] = R[j];
            k=k+1;
            j=j+1;
	     }
	     }
	while(i < Ln)
    {
        A[k] = L[i];
        k=k+1;
        i=i+1;
    }
	while(j < Rn)
	{
	    A[k] = R[j];
	    k=k+1;
            j=j+1;
	}
}

void MergeSort(int *A,int n)
{
	int mid,i, *L, *R;

	if(n < 2) return;

	mid = n/2;

	L = (int*)malloc(mid*sizeof(int));
	R = (int*)malloc((n- mid)*sizeof(int));

	for(i = 0;i<mid;i++)
    {
        L[i] = A[i];
    }
	for(i = mid;i<n;i++)
    {
        R[i-mid] = A[i];
    }

	MergeSort(L,mid);
	MergeSort(R,n-mid);
	Merge(A,L,mid,R,n-mid);
        free(L);
        free(R);
}

int main()
{
	int A[] = {7,8,4,1,9,2,13};
	int i,n;

	n = sizeof(A)/sizeof(A[0]);

	MergeSort(A,n);

	for(i = 0;i < n;i++)
        printf("%d ",A[i]);
	return 0;
}
