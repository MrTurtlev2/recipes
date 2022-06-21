package MrTurtle.recipes;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.util.ResourceUtils;

@Configuration
@EntityScan("MrTurtle.recipes.model")
@EnableJpaAuditing
public class RepositoryConfig {
}
