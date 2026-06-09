package reports;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateReport {

    public static void generate() {
        System.out.println("SE ESTÁ GENERANDO EL REPORTE");

        File reportOutputDirectory = new File("target/advanced-report");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("targe/cucumber-reports/cucumber.json");

        Configuration configuration =
                new Configuration(reportOutputDirectory,
                        "Proyecto Selenium Cucumber");

        ReportBuilder reportBuilder =
                new ReportBuilder(jsonFiles, configuration);

        reportBuilder.generateReports();
    }
}
