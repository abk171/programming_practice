

package greedy;

import java.util.Arrays;

public class Activity_Selection {
	public void most_work(int[] start, int[] finish) {
		int j = 0;
		for(int i = 0; i < finish.length; i++) {
			if(i == 0) {
				System.out.println(i);
				j = 0;
			}
			if(finish[j] <= start[i]) {
				System.out.println(i);
				j = i;
			}
		}
	}
	
	public void insertion_sort(int[] arr1, int[] arr2) {
		int j;
		int k1;
		int k2;
		for(int i = 1; i < arr1.length; i++) {
			j = i-1;
			k1 = arr1[i];
			k2 = arr2[i];
			while(j >= 0 && arr1[j] > k1) {
				arr1[j+1] = arr1[j];
				arr2[j+1] = arr2[j];
				j--;
			}
			arr1[j+1] = k1;
			arr2[j+1] = k2;
		}
	}
	
	public static void main(String[] args) {
		int s[] = {5,1,3,0,5,8};
		int f[] = {9,2,4,6,7,9};
		
		Activity_Selection a = new Activity_Selection();
		a.insertion_sort(f, s);
		System.out.println(Arrays.toString(f));
		a.most_work(s,f);
	}
}
