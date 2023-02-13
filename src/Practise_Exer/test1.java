package Practise_Exer;

public class test1 {

	public static void main(String[] args) {
		
		int arr[]={10,91,29,72,45};

		int asc[]=new int[arr.length];

		int temp;
		for(int i=0;i<arr.length-1;i++){
		for(int j=0;j<arr.length-i-1;j++){
		if(arr[j]>arr[j+1]){
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		}}}

		for(int i=0;i<asc.length;i++){
		System.out.println(arr[i]+" ");
		}


	}

}
