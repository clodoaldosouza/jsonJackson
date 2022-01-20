package br.com.clodoaldo.souza.json.decoder.core.encoder;

import org.springframework.stereotype.Component;

@Component
public interface JsonEncoder {

    String encodeFromClassToString();

}
