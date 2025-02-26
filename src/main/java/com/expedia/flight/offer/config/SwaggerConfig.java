package com.expedia.flight.offer.config;
import com.expedia.flight.offer.constant.SystemConstant;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class SwaggerConfig {

    @Bean
    public OpenAPI swaggerAPI() {
        return new OpenAPI()
                .info(new Info().title(SystemConstant.SWAGGER_TITLE)
                        .description(SystemConstant.SWAGGER_DESCRIPTION)
                        .version(SystemConstant.SWAGGER_VERSION));
    }
}