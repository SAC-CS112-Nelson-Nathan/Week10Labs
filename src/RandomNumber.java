public class RandomNumber
{
	public int GetANumber(int high)
	{
		
		int randomNumber = 0 + (int) (Math.random() * high);
		return randomNumber;
	}
	public int GetANumber()
	{
		
		int randomNumber = 0 + (int) (Math.random() * 10);
		return randomNumber;
	}
	public int GetANumber(int lo, int hi)
	{
		
		int randomNumber = lo + (int) (Math.random() * (hi - lo));
		return randomNumber;		
	}
	/*public int SetLowNumber(int low)
	{
		
		
	}
	public int SetLowNumber(int high)
	{
		
	}*/
}