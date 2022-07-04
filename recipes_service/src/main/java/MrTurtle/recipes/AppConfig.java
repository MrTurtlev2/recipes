package MrTurtle.recipes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value = "MrTurtle.recipes")
@EnableAspectJAutoProxy(proxyTargetClass=true)
@Import({RepositoryConfig.class})
public class AppConfig {}