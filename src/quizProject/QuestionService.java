package quizProject;

import java.util.Scanner;

public class QuestionService {
	
	Question []questions=new Question[5];
	String selection[]=new String[5];
	
	String question,opt1,opt2,opt3,opt4,answer;
	
	
	public QuestionService() {
	questions[0]=new Question(1, "What is Java?","Testing","Communication language", "Object Oriented", "Nothing", "Object Oriented");
	questions[1]=new Question(2, "What is int?","Testing","Communication language", "something", "primitive dataType", " primitive dataType");
	questions[2]=new Question(3, "What is double?","Testing","Communication language", "something", "primitive dataType", "primitive dataType");
	questions[3]=new Question(4, "What is char?","Testing","Communication language", "something", "primitive dataType", "primitive dataType");
	questions[4]=new Question(5, "What is testing?","Testing","Communication language", "something", "Software testing is the process of evaluating and verifying that a software product or application does what it's supposed to do.", "Software testing is the process of evaluating and verifying that a software product or application does what it's supposed to do.");
	}




	public void displayQuestions(){
		
		int i=0;
		for(Question q:questions) {
			
			System.out.println("Question No : "+q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			Scanner sc=new Scanner(System.in);
			selection[i]=sc.nextLine();
			i++;
		}
		
		for(String s: selection) {
			System.out.println(s);
		}
	}
	
	public void printScore(){
		
		
	
	int score=0;
	for(int i=0; i<questions.length;i++) {
		Question que=questions[i];
		String actAnswer=que.getAnswer();
		String userAnswer=selection[i];
		
		if(userAnswer.equals(actAnswer)) {
			score++;
			
		}
	}
		System.out.println("Your final score is "+ score);
		
	
	}

}
