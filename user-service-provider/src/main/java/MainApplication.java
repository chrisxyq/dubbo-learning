import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yuanqixu
 * 创建这个主启动类是为了测试dubbo服务提供者是否注册到了注册中心
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
