import cn.luoyvdi.pojo.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class MyTest {
    @Test
    public void studentMapTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        student student = (student) context.getBean("student");
        for (Object obj : student.getCart().keySet()) {
            String key = (String) obj;
            String value = student.getCart().get(key);
            System.out.println(key + "+" + value);
        }
    }

    @Test
    public void studentSetTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        student student = (student) context.getBean("student");
        for (String s : student.getGame()) {
            System.out.println(s);
        }
    }

    @Test
    public void studentNullTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        student student = (student) context.getBean("student");
        System.out.println(student.getWife());
    }

    @Test
    public void studentPropsTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        student student = (student) context.getBean("student");
        Set<String> set = student.getInfo().stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"+"+student.getInfo().getProperty(s));
        }
    }
}
