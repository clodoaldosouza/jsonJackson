package br.com.clodoaldo.souza.json.decoder.core.builder;

import br.com.clodoaldo.souza.json.decoder.core.pojo.SuperHeroes;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Collections;
import org.apache.logging.log4j.Logger;

@Service
public class SuperHeroesBuilderImpl implements SuperHeroesBuilder {

    private final MemberBuilder memberBuilder;
    private final Logger logger;

    @Inject
    public SuperHeroesBuilderImpl(MemberBuilder memberBuilder, Logger logger) {
        this.memberBuilder = memberBuilder;
        this.logger = logger;
    }

    @Override
    public SuperHeroes create() {
        logger.info ("Creating SuperHeroe...");
        SuperHeroes superHeroes = new SuperHeroes();
        superHeroes.setSquadName("Others");
        superHeroes.setSecretBase("Secret Place");
        superHeroes.setHomeTown("Secret Place");
        superHeroes.setFormed(1945);
        superHeroes.setActive(true);
        superHeroes.setMemberList(Collections.singletonList(memberBuilder.create()));
        return superHeroes;
    }
}
