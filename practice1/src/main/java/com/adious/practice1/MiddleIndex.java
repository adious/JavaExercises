package com.adious.practice1;

public class MiddleIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 2, 4, 4, 5, 4, 1, 4, 6 };
		
		try {
				System.out.println(findMiddleIndex(num));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static int findMiddleIndex(int[] num) throws Exception
	{
		int startIndex=0;
		int endIndex=num.length-1;
		
		int rightSum=0, leftSum=0;
		
		while(true){
			if(leftSum > rightSum)
				rightSum += num[endIndex--];
			else
				leftSum+= num[startIndex++];
			
			if(startIndex > endIndex)
			{
				if(rightSum==leftSum)
					break;
				else
					throw new Exception("Please pass correct array");
			}
			
			
		}
		return endIndex;
	}

}
