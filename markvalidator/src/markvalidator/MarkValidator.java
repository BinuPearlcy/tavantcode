package markvalidator;

public class MarkValidator 
{

	public static void main(String[] args) 
	{
		System.out.println("Marks 95 \n Result: "+markGrade(95));
		System.out.println();
		System.out.println("Marks 85 \n Result: "+markGrade(85));
		System.out.println();
		System.out.println("Marks 65 \n Result: "+markGrade(65));
		System.out.println();
		System.out.println("Marks 55 \n Result: "+markGrade(55));
		System.out.println();
		System.out.println("Marks 35 \n Result: "+markGrade(35));
		System.out.println();
	}
	
	public static boolean isPass(int mark)
	{
		if(mark>=40)
		{
			System.out.println("Youe'r PASS");
			return true;
		}
		else
		{
			System.out.println("Youe'r FAIL");
			return false;
		}
	}
	public static String markGrade(int mark)
	{
		if(isPass(mark))
		{
			if(mark>90)
			{
				return("Grade A");
			}
			else if(mark>75)
			{
				return("Grade B");
			}
			else if(mark>60)
			{
				return("Grade C");
			}
			else
			{
				return("Grade D");
			}	
		}
		return "";
	}
}


