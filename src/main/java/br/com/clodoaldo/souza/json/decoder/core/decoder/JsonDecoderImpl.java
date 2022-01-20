package br.com.clodoaldo.souza.json.decoder.core.decoder;

import br.com.clodoaldo.souza.json.decoder.core.pojo.SuperHeroes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class JsonDecoderImpl implements JsonDecoder {
    private final ObjectMapper objectMapper;
    private final Logger logger;

    @Inject
    public JsonDecoderImpl(ObjectMapper objectMapper, Logger logger) {
        this.objectMapper = objectMapper;
        this.logger = logger;
    }

    @Override
    public SuperHeroes decodeJsonToClass(String str) {
        SuperHeroes superHeroes = null;
        try {
            logger.info("Converted from Json String to Classes...");
            superHeroes = objectMapper.readValue(str, SuperHeroes.class);
            logger.info("Decoded Message = {}",superHeroes.toString());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return null;
    }

}
