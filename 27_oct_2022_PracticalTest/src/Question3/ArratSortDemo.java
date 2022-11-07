package Question3;

public class ArratSortDemo {
	void sortArray(float[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					float temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println("Array in Decending order at index:"+i+array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArratSortDemo obj=new ArratSortDemo();
		float arr[]= {5.5f,5.6f,5.7f,5.9f,6.1f};
		obj.sortArray(arr);

	}

}
