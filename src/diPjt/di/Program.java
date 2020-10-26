package diPjt.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diPjt.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewLecExam();		
		ExamConsole console = new InlineExamConsole(); //DI		
		console.setExam(exam);
		*/
			
		
		//1.XML 설정 호출시 사용
		//ApplicationContext context = 
		//		new ClassPathXmlApplicationContext("diPjt/di/setting.xml");
		
		//2.annotation설정방법 1
		//ApplicationContext context = 
		//		new AnnotationConfigApplicationContext(NewLecDIConfig.class);
		
		
		
		
		//Exam exam = (Exam)context.getBean("exam4");		
		//System.out.println(exam.toString());

		
	
		
		
		//List<Exam> exams = (List<Exam>)context.getBean("exams"); //new ArrayList<>();
		//exams.add(new NewLecExam(1,1,1,1)); //setting.xml에서 설정함.
		
	
		
		//for(Exam e: exams)
		//	System.out.println(e);
		
		
		
		//3. 설정방법 2 from Config.java
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(NewLecDIConfig.class);
		context.refresh();
		
		
		
		
		ExamConsole console = (ExamConsole)context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
