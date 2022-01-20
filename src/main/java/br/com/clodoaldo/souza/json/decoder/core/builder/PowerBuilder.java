package br.com.clodoaldo.souza.json.decoder.core.builder;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PowerBuilder {

    List<String> create();

}
