import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean(("helloworld"));

        System.out.println(bean1.getMessage());

        boolean helloworld = (bean == bean1);
        System.out.println(helloworld);

        Cat bean2 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean2.getMessage());

        Cat bean3 =(Cat) applicationContext.getBean("cat");

        System.out.println(bean3.getMessage());

        boolean cat = (bean2 == bean3);

        System.out.println(cat);
    }
}