package view;

import entity.WuzzufDataModel;
import org.knowm.xchart.*;
import org.knowm.xchart.PieChartBuilder;

import java.util.ArrayList;
import java.util.List;

public class ChartsDrawer {
    public static void pieChart(List<WuzzufDataModel> data, String chartTitle,int topResultNumber) {
        PieChart piechart = new PieChartBuilder().width(800).height(1500).title(chartTitle).build();
        data.subList(0,topResultNumber).forEach(wuzzufDataModel ->
                piechart.addSeries(wuzzufDataModel.getCountedCol(), wuzzufDataModel.getCount()));
        new SwingWrapper<PieChart>(piechart).displayChart();
    }

    public static void barChart(List<WuzzufDataModel> data, String title, int topResultNumber, String xTitle, String yTitle) {
        List<String> names = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        data.subList(0, topResultNumber).forEach(wuzzufDataModel -> names.add(wuzzufDataModel.getCountedCol()));
        data.subList(0, topResultNumber).forEach(wuzzufDataModel -> count.add((int)wuzzufDataModel.getCount()));
        CategoryChart barChart = new CategoryChartBuilder().height(800).width(1500).title(title).xAxisTitle(xTitle)
                .yAxisTitle((yTitle)).build();
        barChart.addSeries(title, names, count);
        new SwingWrapper<CategoryChart>(barChart).displayChart();
    }
}
