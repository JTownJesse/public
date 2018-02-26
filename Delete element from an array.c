//2/25/18
//Delete element of an array 

#include<stdio.h>

int main(){
	

	int arr[10]={1,2,3,4,5,3,7,8,9,3};
	
	int i=0;
		
	
	while(i<10){
		
		printf("%d\n", arr[i]);
		i++;
	}
	
	int j;
	int counter=0;
	for (j=0;j<10;j++){
		
		if(arr[j]==3){
			counter++;
		}
		
	}
	
	int newArray[10-counter];
	
	int k, m=0;
	for(k=0;k<10;k++){
		
		if(arr[k]!=3){
			
			newArray[m]=arr[k];
			m++;
		}
		
	}
	
		int n=0;
	while(n<7){
		
		printf("New arr element %d\n", newArray[n]);
		n++;
	}
	
	
 	
	
}
