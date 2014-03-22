package MathCourse.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class MathCourseUploadQuiz implements Serializable {

	public MathCourseUploadQuiz(){
	}
	
	public String getQuizName(){
		return QuizName;
	}
	
	public void setQuizName(String QuizName){
		this.QuizName = QuizName;
	}
	
	public int getQuizID(){
		return QuizID;
	}
	
	public void setQuizID(int QuizID){
	    this.QuizID = QuizID;
	}
	
	private String QuizName;
	private int QuizID;

	private Set consumeServices = new HashSet();
	private Set provideServices = new HashSet();
	
}
