package br.com.clodoaldo.souza.json.decoder.core.builder;

import br.com.clodoaldo.souza.json.decoder.core.pojo.Member;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

@Service
public class MemberBuilderImpl implements MemberBuilder {

    private final PowerBuilder powerBuilder;
    private final Logger logger;

    @Inject
    public MemberBuilderImpl(PowerBuilder powerBuilder, Logger logger) {
        this.powerBuilder = powerBuilder;
        this.logger = logger;
    }

    @Override
    public Member create() {
        logger.info ("Creating Member...");
        Member member = new Member();
        member.setAge(18);
        member.setName("ZQF1");
        member.setSecretIdentity("Elvis");
        member.setPowerList(powerBuilder.create());
        return member;
    }
}
