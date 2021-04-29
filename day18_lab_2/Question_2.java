package day18_lab_2;

public class Question_2 {

	public static void main(String[] args) {
		
		
		/*A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 
		 * serving in the bag and that a serving equals 300 calories. write a program that lets the user
		 *  enter the number of cookies he or she actually
		 *  ate and then reports the number of total calories consumed.
		 */
		int cookie=9;
		calorieTotal(cookie);
		
	}
    public static  void calorieTotal(int cookie) {
		 
		 int calorie =cookie*10;
		 System.out.println(cookie+" cookies, "+calorie+" calorie");
		
    	}
    }
