import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
       HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        Cat cat = (Cat) applicationContext.getBean("catBean");
        System.out.println(cat.getMesseg());
        Cat cat1 = (Cat) applicationContext.getBean("catBean");
        System.out.println(cat1.getMesseg());
        System.out.println("Результат сравнения бинов helloworld = " +
                bean.equals(bean2));
        System.out.println("Результат сравнения биноа catBean = " +
                cat.equals(cat1));
    }
}