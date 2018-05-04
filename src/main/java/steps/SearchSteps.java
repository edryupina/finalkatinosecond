package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SearchPage;
import ru.yandex.qatools.allure.annotations.Step;
import java.util.List;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class SearchSteps {

    @Step("Установлен фильтр")
    public void stepSetPrice() {
        new SearchPage().filterApply();
    }

    @Step("Выполнено нажатие на кнопку - Применить")
    public void stepClickButton() {
        new SearchPage().clickButtonApply();
    }

    @Step("Выполнена проверка количества элементов на странице")
    public void stepShowTwelve(String expectedShowElements) {
        Integer count = BaseSteps.getDriver().findElements(By.xpath("//div[@class='n-snippet-card2__title']")).size();
        }

    @Step("Найден первый элемент")
    public void stepFirstElementSeach() {
        new SearchPage().firstElement.isEnabled();
    }

    @Step("Выполнен поиск по первому элементу")
    public void stepSearchPasteSearchFirstElement() {
        new SearchPage().searchPasteSearchFirstElement();
    }

    @Step("Выполнена проверка на соответсвие наименования товара искомому")
    public void stepComareElements() {
        String tovar =  new SearchPage().tovar.getText();
        String header = new SearchPage().headerSearch.getAttribute("value");
        assertEquals("Найденный товар не соответствует поиску",header,tovar);
    }
}
