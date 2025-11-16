package BasicJava;

public class arrays {

	public static void main(String[] args) {
		int [] marks = {100,90,80,70,60};
		System.out.println("Length of the array: "+marks.length);
		for(int i=0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//multi-dimensional arrays
		int [] m ; // 1-D array
		int [][] flats ; //2-D array
		flats = new int [2][3];
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;
		
		/*3d arrays are also there and it can be written as 
		 * String [][][] arr = new String [2][3][4]
		 * 
		 */
		
		//Displaying 2 dimensional array using for loop
		System.out.println("Printing a 2-D array using for loop:");
		for(int i=0; i<flats.length; i++) {
			for(int j=0; j<flats[i].length; j++) {
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}	
			System.out.println(" ");
		}
		
		//3-D Array
		int [][][] flat ;
		flat = new int [3][3][3];
		flat [0][0][0] = 101;
		flat [0][0][1] = 102;
		flat [0][0][2] = 103;
		
		flat [1][0][0] = 201;
		flat [1][0][1] = 202;
		flat [1][0][2] = 203;

		flat [2][0][0] = 301;
		flat [2][0][1] = 302;
		flat [2][0][2] = 303;
		 //Displaying 3 dimensional array using for loop
		System.out.println("Displaying a 3-D array using for loop:");
		for(int i=0;i<flat.length;i++) {
			for(int j=0;j<flat[i].length;j++) {
				for(int k=0;k<flat[i][j].length;k++) {
					System.out.print(flat[i][j][k]);
					System.out.print(" ");
				}	
				System.out.println();
			}
			System.out.println();
		}
		
		//practice problem
		float [] f_marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
		float sum = 0;
		for(float element:f_marks) {
			sum = sum + element;
		}
		System.out.println("The value of sum is " + sum);
		
		//To check the presence of a number in an array
		boolean isInArray = false;
		float num = 43.7f;
		for(float element:f_marks) {
			if(num==element) {
				isInArray = true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("The value is present in array.");
		}
		else {
			System.out.println("The value is not present in array.");
		}
		
		/*To calculate the average marks from an array 
		 * containing marks of all students in physics using
		 * for-each loop
		 */
		float [] f_marks1 = {45.7f,67.8f,63.4f,99.2f,100.0f};
		float sum1 = 0;
		for(float element:f_marks) {
			sum1 = sum1 + element;
		}
		System.out.println("The value of average marks is " + sum1/marks.length);
		
		//To add matrices of size 2*3
		int [][] mat1 = { {1, 2, 3},
				          {4, 5, 6}};
		int [][] mat2 = { {7, 8, 9},
	                      {10, 11, 12}};
		int [][] result = { {0, 0, 0},
				            {0, 0, 0}};
		
		for (int i=0;i<mat1.length;i++) { //row number of times
			for(int j=0;j<mat1[i].length;j++) { //column number of times
				System.out.format("Setting value for i=%d and j=%d\n", i, j);
				result[i][j] = mat1[i][j] + mat2[i][j];
								
			}
		}
		for (int i=0;i<mat1.length;i++) { //row number of times
			for(int j=0;j<mat1[i].length;j++) { //column number of times
				System.out.print(result[i][j] + " " );
							
			}
			System.out.println("");
		}
		
		//To reverse an array
		int [] arr = {10,12,33,54,85};
		int l = arr.length;
		int t = Math.floorDiv(l ,2);
		int temp;
		System.out.println(t);
		System.out.println("Reversed array is:");
		
		for(int i=0; i<t; i++) {
			//swap a[i] and a[l-1-i]
			//a b temp
			temp = arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1] = temp; 
		}
		for(int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		
		//To find the maximum and minimum element in the array.
		//maximum
		int [] arr_m = {103,612,233,854,785};
		int max = 0;
		for(int element:arr_m) {
			if(element>max) {
				max = element;
			}
		}
		System.out.println("The maximum value of the element is:"+max);
		//minimum 
		int min=max;
		for(int e:arr_m) {
			if(e<min) {
				min = e;
			}
		}
		System.out.println("The element with the minimum values is:"+min);
		
		//to sort an array
		boolean isSorted = true;
		for(int i=0; i<arr_m.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				isSorted = false;
				break;	
			}
			
		}
		if(isSorted) {
			System.out.println("The array is sorted.");
		}
		else {
			System.out.println("The array is not sorted.");
		}

	}

}
