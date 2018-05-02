package steps;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {
    @Step("Выбран раздел - Маркет")
    public void stepSelectMarket(){
        new MainPage().selectMerket();
    }

}
