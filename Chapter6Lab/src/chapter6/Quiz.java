//Made by Rebecca Zhu 11/1/19

package chapter6;

import java.util.Scanner;

public class Quiz {
	private Question[] quizQuestions = new Question[25]; //makes an array of questions
	private int right;
	
	//constructor that instantiates the Quiz object
	public void Quiz() {
		right = 0; //sets how many questions were answered right
	}
	
	//method that adds a question given the question, answer, and complexity
	public void addQuestion(String question, String answer, int complex) {
		for(int i = 0; i < quizQuestions.length; i++) {
			if(quizQuestions[i] == null) { //finds the next open index of array
				quizQuestions[i] = new Question(question, answer, complex);
				break;
			}
		}
	}
	
	//method that gives the quiz
	public void giveQuiz() {
		System.out.println("DIRECTIONS: Please enter the letter for your answer choice for each question. All questions have complexity levels between 1 and 4 inclusive.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lower bound of the complexity for the question.");
		int lower = scan.nextInt(); //asks for lower and upper bound
		System.out.println("Enter the upper bound of the complexity for the question.");
		int upper = scan.nextInt();
		scan.nextLine();
		int index = 0;
		while(quizQuestions[index] != null) { //checks if there is a question there
			//checks to only give the questions within certain complexities
			if((quizQuestions[index].getComplexity() >= lower) && (quizQuestions[index].getComplexity() <= upper)) {
				//prints the question and the compelexity
				System.out.println("(complexity of " + quizQuestions[index].getComplexity() + ") " + quizQuestions[index].getQuestion());
				String input = scan.nextLine();
				if(input.equals(quizQuestions[index].getAnswer()))
					right++; //increments right if the question is answered correctly
			}
			index++; //moves on to the next index
		}
	}
	
	//returns the number of right answers
	public int getRight() {
		return right;
	}
	
}
