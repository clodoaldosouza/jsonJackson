package br.com.clodoaldo.souza.json.decoder.core.decoder;

import br.com.clodoaldo.souza.json.decoder.core.pojo.SuperHeroes;
import org.springframework.stereotype.Component;

@Component
public interface JsonDecoder {

    SuperHeroes decodeJsonToClass(String str);

}
