package MrTurtle.recipes;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.util.ResourceUtils;

@Configuration
@EntityScan("MrTurtle.recipes")
@EnableJpaAuditing
@EnableJpaRepositories(value = "MrTurtle.recipes")
@PropertySource(ResourceUtils.CLASSPATH_URL_PREFIX + "repository-default.properties")
public class RepositoryConfig {
}
