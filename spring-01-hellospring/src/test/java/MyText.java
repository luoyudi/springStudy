import cn.luoyvdi.pojo.hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {

    @Test
    public void helloTest() {
//        获取spring上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        我们的对象都在spring容器中管理,使用时只需要取出来即可
        hello hello = (hello) applicationContext.getBean("hello");
//        在这里相当于是调用了无参构造函数new对象
        System.out.println(hello.getStr());


    }
}
