package br.com.clodoaldo.souza.json.decoder.core.builder;

import br.com.clodoaldo.souza.json.decoder.core.pojo.SuperHeroes;
import org.springframework.stereotype.Component;

@Component
public interface SuperHeroesBuilder {

    SuperHeroes create();

}
