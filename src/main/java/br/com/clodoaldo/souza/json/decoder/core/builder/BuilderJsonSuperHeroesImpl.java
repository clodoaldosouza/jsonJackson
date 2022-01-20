package br.com.clodoaldo.souza.json.decoder.core.builder;

import br.com.clodoaldo.souza.json.decoder.core.pojo.SuperHeroes;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class BuilderJsonSuperHeroesImpl implements BuilderJsonSuperHeroes {


    private final Logger logger;
    private final SuperHeroesBuilder superHeroesBuilder;

    @Inject
    public BuilderJsonSuperHeroesImpl(
            Logger logger,
            SuperHeroesBuilder superHeroesBuilder
    ) {
        this.logger = logger;
        this.superHeroesBuilder = superHeroesBuilder;
    }


    @Override
    public SuperHeroes createJsonfromClass() {
        logger.info("Creating a class of SuperHeroes...");
        SuperHeroes superHeroes = superHeroesBuilder.create();
        return superHeroes;
    }
}
