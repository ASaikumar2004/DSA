package ActualDSA;

public class duplicate {
	
	public static void main(String[] args) {
		int arr[]= {10,10,30,40,50,50};
		boolean found=false;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicates: "+arr[i]);
					found=true;
				}
			}
			if(found) {
				break;
			}
		}
		
		if(!found) {
			System.out.println("no duplicates");
		}

	}

}
