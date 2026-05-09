import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.WebStep;
import testData.TestData;

public class StepsTest {
    @Test
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Тест с Steps")
    @Tag("test")
    @Owner("LazVal")
    public void testIssueSearchSteps() {
        WebStep steps = new WebStep();

        steps.openMainPage();
        steps.clickSearchButton();
        steps.searchRepository();
        steps.clickIssues();
        steps.existIssues();
    }
}
