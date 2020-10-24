package diPjt.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diPjt.di.entity.Exam;
import diPjt.di.entity.NewLecExam;
import diPjt.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewLecExam();		
		ExamConsole console = new InlineExamConsole(); //DI		
		console.setExam(exam);
		*/
				
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("diPjt/di/setting.xml");
		
		
		Exam exam = (Exam)context.getBean("exam4");
		
		System.out.println(exam.toString());
		ExamConsole console = (ExamConsole)context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		
		List<Exam> exams = (List<Exam>)context.getBean("exams"); //new ArrayList<>();
		//exams.add(new NewLecExam(1,1,1,1)); //setting.xml에서 설정함.
		
	
		
		for(Exam e: exams)
			System.out.println(e);
	}

}
