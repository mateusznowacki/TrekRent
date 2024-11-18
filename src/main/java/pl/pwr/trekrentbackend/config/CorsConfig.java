package pl.pwr.trekrentbackend.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Zezwala na wszystkie endpointy
                        .allowedOrigins("http://localhost:5173") // Zezwala na frontend
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Metody HTTP
                        .allowedHeaders("*") // Wszystkie nagłówki
                        .allowCredentials(true); // Zezwala na ciasteczka (opcjonalne)
            }
        };
    }
}
