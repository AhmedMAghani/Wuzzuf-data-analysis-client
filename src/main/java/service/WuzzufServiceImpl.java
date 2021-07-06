package service;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
public class WuzzufServiceImpl implements WuzzufService {
    private final Client restClient;

    public WuzzufServiceImpl(Client restClient) {
        this.restClient = restClient;
    }


    public String fetchWuzzufDataCount(String url) {
        return restClient
                .target(url)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
    }
}
