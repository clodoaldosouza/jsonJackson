package br.com.clodoaldo.souza.json.decoder.core.encoder;

import br.com.clodoaldo.souza.json.decoder.core.builder.SuperHeroesBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;


@Service
public class JsonEncoderImpl implements JsonEncoder {

    private final Logger logger;
    private final SuperHeroesBuilder superHeroesBuilder;
    private final ObjectMapper objectMapper;

    @Inject
    public JsonEncoderImpl(Logger logger, SuperHeroesBuilder superHeroesBuilder, ObjectMapper objectMapper) {
        this.logger = logger;
        this.superHeroesBuilder = superHeroesBuilder;
        this.objectMapper = objectMapper;
    }

    @Override
    public String encodeFromClassToString() {

        try {
            String jsonHero = objectMapper.writeValueAsString(superHeroesBuilder.create());
            logger.info("Converted from Classes to Json String =  {}", jsonHero);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
