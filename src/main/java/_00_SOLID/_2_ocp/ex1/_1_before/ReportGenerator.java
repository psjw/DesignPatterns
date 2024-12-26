package _00_SOLID._2_ocp.ex1._1_before;

public class ReportGenerator {
    //XML이 추가시 ReportGenerator 클래스의 코드가 영향범위내로 들어온다.
    public void generateReport(String type) {
        if (type.equals("PDF")) {
            System.out.println("Generating PDF report...");
        } else if (type.equals("HTML")) {
            System.out.println("Generating HTML report...");
        }
        // If we need to add another format, we have to modify this method.
    }
}
