package maelton.package19.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"maelton.package19"})
@EnableAspectJAutoProxy
public class ProjectConfiguration {
}
