package view;

import Presenter.WuzzufDataHandler;
import Presenter.WuzzufDataHandlerImpl;
import entity.WuzzufDataModel;

import java.util.List;

public class RestClientApplication {
    WuzzufDataHandler wuzzufDataHandler = new WuzzufDataHandlerImpl();

    public static void main(String[] args) {
        RestClientApplication restClientApplication = new RestClientApplication();
        restClientApplication.drawPieChart(restClientApplication.wuzzufDataHandler.getCompanyDataCounts(),"Companies job share on Wuzzuf",10);
        restClientApplication.drawPieChart(restClientApplication.wuzzufDataHandler.getSkillsDataCounts(),"Most demanded skills on Wuzzuf",10);
        restClientApplication.drawBarChart(restClientApplication.wuzzufDataHandler.getJobDataCounts(),"Most demanded jobs on Wuzzuf",10,"Job Title");
        restClientApplication.drawBarChart(restClientApplication.wuzzufDataHandler.getLocationDataCounts(),"Most job request locations on Wuzzuf",10,"Location");
    }

    public void drawPieChart(List<WuzzufDataModel> tobeDisplayedList,String chartTitle,int resultsNumber){
        ChartsDrawer.pieChart(tobeDisplayedList,chartTitle,resultsNumber);
    }

    public void drawBarChart(List<WuzzufDataModel> tobeDisplayedList,String chartTitle,int resultsNumber,String xAxisTitle){
        ChartsDrawer.barChart(tobeDisplayedList,chartTitle,resultsNumber,xAxisTitle,"Count");
    }
}
