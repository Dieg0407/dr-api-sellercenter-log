package pe.seller.log.api.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("pe.seller.log")
@EnableTransactionManagement
@EnableConfigurationProperties
public class AppConfiguration {
}
