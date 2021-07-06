package Presenter;

import entity.WuzzufDataModel;

import java.util.List;

public interface WuzzufDataHandler {
    List<WuzzufDataModel> getCompanyDataCounts();
    List<WuzzufDataModel> getJobDataCounts();
    List<WuzzufDataModel> getLocationDataCounts();
    List<WuzzufDataModel> getSkillsDataCounts();
}
