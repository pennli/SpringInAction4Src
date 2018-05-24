package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
indicates that the class can be used by the Spring IoC 
container as a source of bean definitions. 
 */
@Configuration

/*
1. 通知spring开启组件扫描
2. 默认扫描配置类所在包、子包
 */
@ComponentScan
public class CDPlayerConfig { 
}
