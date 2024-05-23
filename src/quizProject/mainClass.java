package quizProject;

public class mainClass {

	public static void main(String[] args) {
		
		QuestionService q=new QuestionService();
		System.out.println("In display questions");		
		q.displayQuestions();
		q.printScore();
      

	}

}
