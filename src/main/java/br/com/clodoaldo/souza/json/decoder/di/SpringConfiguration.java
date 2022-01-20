package br.com.clodoaldo.souza.json.decoder.di;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

@Configuration
@ComponentScan({"br.com.clodoaldo.souza.json.decoder.app", "br.com.clodoaldo.souza.json.decoder.core", "br.com.clodoaldo.souza.json.decoder.infra"})
public class SpringConfiguration {

    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper()
                .configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Bean
    public Logger gerLogger(){

        return LogManager.getLogger();
    }


}
