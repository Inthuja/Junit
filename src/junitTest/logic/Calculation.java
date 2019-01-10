package junitTest.logic;

public class Calculation {
	
	public static int findMax(int arr[]){  
        int max=-1;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    } 
	
	public static int Add(int a,int b) {
		return a+b;
		
	}
	
	

}
