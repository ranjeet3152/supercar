import org.hibernate.cfg.Configuration ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.buildSessionFactory();
    }
}
