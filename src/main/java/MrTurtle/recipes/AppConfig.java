package MrTurtle.recipes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value = "MrTurtle.recipes")
@Import({RepositoryConfig.class})
public class AppConfig {}

