package com.cts.arrays.java;

public class LargestArray {
	
	//what this method is doig?
	//what is total?
		public  int getLargest(int a[]){
			int max=a[0];
			for(int i=1;i<=a.length;i++) 
				if(a[i]>max) 
				max= a[i];
			
				
			
			return max;
				
			}
			public  int getLargestByIndex(int a[]){
				int max=a[0];
				for(int i=1;i<=a.length;i++) 
					if(a[i]>max) 
						 max=i;
					return max+1;
		
		}

			
		}
