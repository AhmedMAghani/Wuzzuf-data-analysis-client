package Presenter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entity.WuzzufDataModel;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import service.WuzzufService;
import service.WuzzufServiceImpl;
import java.lang.reflect.Type;
import java.util.List;

public class WuzzufDataHandlerImpl implements  WuzzufDataHandler{
    private final Client restClient = ClientBuilder.newClient();
    private final WuzzufService wuzzufService = new WuzzufServiceImpl(restClient);
    private final Gson gsonParser = new Gson();
    private final Type listType = new TypeToken<List<WuzzufDataModel>>(){}.getType();

    public List<WuzzufDataModel> getCompanyDataCounts(){
        String wuzzufDataResponse =  wuzzufService.fetchWuzzufDataCount(restURL.COMPANY.getUrl());
        return gsonParser.fromJson(wuzzufDataResponse, listType);
    }
    public List<WuzzufDataModel> getJobDataCounts(){
        String wuzzufDataResponse =  wuzzufService.fetchWuzzufDataCount(restURL.JOBS.getUrl());
        return gsonParser.fromJson(wuzzufDataResponse, listType);
    }
    public List<WuzzufDataModel> getLocationDataCounts(){
        String wuzzufDataResponse =  wuzzufService.fetchWuzzufDataCount(restURL.LOCATIONS.getUrl());
        return gsonParser.fromJson(wuzzufDataResponse, listType);
    }
    public List<WuzzufDataModel> getSkillsDataCounts(){
        String wuzzufDataResponse =  wuzzufService.fetchWuzzufDataCount(restURL.SKILLS.getUrl());
        return gsonParser.fromJson(wuzzufDataResponse, listType);
    }
}
