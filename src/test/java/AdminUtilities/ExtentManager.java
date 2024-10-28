package AdminUtilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;

    public static ExtentReports getInstance() {
        if (extent == null) {
            sparkReporter = new ExtentSparkReporter("C:/Users/VrundaYajurvedi/eclipse-workspace/ALFFramework_v1.0/Reports/ExtentReport.html");
            sparkReporter.config().setDocumentTitle("ALF Test Report");
            sparkReporter.config().setReportName("ALF ADMIN Report");
            sparkReporter.config().setTheme(Theme.DARK);

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Host Name", "Dev");
            extent.setSystemInfo("Environment", "Staging");
            extent.setSystemInfo("User Name", "Vrunda Yajurvedi");
        }
        return extent;
    }
}
