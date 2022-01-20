package br.com.clodoaldo.souza.json.decoder.core.builder;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@Service
public class PowerBuilderImpl implements PowerBuilder {
    private final Logger logger;

    @Inject
    public PowerBuilderImpl(Logger logger) {
        this.logger = logger;
    }

    @Override
    public List<String> create() {
        logger.info ("Creating list of Powers...");
        return Arrays.asList("Force", "Speed", "Intelligence", "Courage");
    }
}
