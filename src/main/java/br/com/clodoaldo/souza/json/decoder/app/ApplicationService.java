package br.com.clodoaldo.souza.json.decoder.app;

import br.com.clodoaldo.souza.json.decoder.core.decoder.JsonDecoder;
import br.com.clodoaldo.souza.json.decoder.core.encoder.JsonEncoder;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ApplicationService {

    private final JsonEncoder jsonEncoder;
    private final JsonDecoder jsonDecoder;
    private final Logger logger;

    @Inject
    public ApplicationService(
            JsonEncoder jsonEncoder,
            JsonDecoder jsonDecoder,
            Logger logger
    ) {
        this.jsonEncoder = jsonEncoder;
        this.jsonDecoder = jsonDecoder;
        this.logger = logger;
    }


    public void start() {
        logger.info("Starting Json Example..");
        String jsonMessage = "{\"squadName\":\"Super hero squad\",\"homeTown\":\"Metro City\",\"formed\":2016,\"secretBase\":\"Super tower\",\"active\":true,\"members\":[{\"name\":\"Molecule Man\",\"age\":29,\"secretIdentity\":\"Dan Jukes\",\"powers\":[\"Radiation resistance\",\"Turning tiny\",\"Radiation blast\"]},{\"name\":\"Madame Uppercut\",\"age\":39,\"secretIdentity\":\"Jane Wilson\",\"powers\":[\"Million tonne punch\",\"Damage resistance\",\"Superhuman reflexes\"]},{\"name\":\"Eternal Flame\",\"age\":1000000,\"secretIdentity\":\"Unknown\",\"powers\":[\"Immortality\",\"Heat Immunity\",\"Inferno\",\"Teleportation\",\"Interdimensional travel\"]}]}";
        jsonDecoder.decodeJsonToClass(jsonMessage);
        jsonEncoder.encodeFromClassToString();

    }
}
