package br.com.clodoaldo.souza.json.decoder.core.builder;

import br.com.clodoaldo.souza.json.decoder.core.pojo.Member;
import org.springframework.stereotype.Component;

@Component
public interface MemberBuilder {

    Member create();

}
