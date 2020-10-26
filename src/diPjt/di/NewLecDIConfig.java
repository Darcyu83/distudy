package diPjt.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import diPjt.di.entity.Exam;
import diPjt.di.entity.NewLecExam;

@ComponentScan("dipjt.di.ui")
@Configuration
public class NewLecDIConfig {

	
	@Bean
	public Exam exam() { //exam() << 아이디 : exam 변수명 IOC 컨테이너에서 호출할때,		
		return new NewLecExam();
	}
}
