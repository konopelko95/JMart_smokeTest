package kz.jusan.selenide;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class PageObjectsActions {

    PageObjectsValue pov = new PageObjectsValue();
    PageObjectsPath pop = new PageObjectsPath();

    public void authorization() {

        open(pov.urlPath);
        $(byXpath(pop.toMerchantKabBtn))
                .shouldBe(Condition.exist, Duration.ofMillis(12000))
                .scrollTo()
                .click();


        $(byXpath(pop.emailField))
                .shouldBe(Condition.visible, Duration.ofMillis(12000))
                .click();

        $(byXpath(pop.emailField)).sendKeys(pov.email);
        $(pop.passField).val(pov.pass);
        $(pop.entranceBtn).click();

        $(byXpath(pop.jusanLogo)).shouldBe(Condition.visible, Duration.ofMillis(12000));

        //checks
        $(byText(pop.ordersModule)).shouldBe(Condition.visible);
        $(byText(pop.accountStatementModule)).shouldBe(Condition.visible);
        $(byText(pop.productsModule)).shouldBe(Condition.visible);
        $(byText(pop.tariffModule)).shouldBe(Condition.visible);
        $(byText(pop.settingsModule)).shouldBe(Condition.visible);

    }

    public void ordersModule() {

        //open orders module
        $(byText(pop.ordersModule)).click();

        $(byXpath(pop.ordersHeader)).shouldBe(Condition.visible, Duration.ofMillis(12000));

        //orders page check
        $(byXpath(pop.ordersSearchField)).shouldBe(Condition.visible);
        $(byXpath(pop.allFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.newFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.readyForDeliveryFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.deliveringFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.issuedFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.toRefundFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.returnedFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.canceledFilter)).shouldBe(Condition.visible);


        //columns check
        $(byXpath(pop.ordersnumberOfOrderColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.ordersdateColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.statusColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.cityColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.buyerColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.phoneColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.typeOfDeliveryColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.totalSumColumn)).shouldBe(Condition.visible);
    }

    public void accountStatementModule() {

        //open account statement module
        $(byText(pop.accountStatementModule)).click();
        $(byXpath(pop.accStatHeader)).shouldBe(Condition.visible, Duration.ofMillis(12000));

        //Search Field & Button check
        $(byXpath(pop.accStatSearch)).shouldBe(Condition.visible);
        $(byText(pop.accStatAllTimeBtn)).shouldBe(Condition.visible);

        //columns check
        $(byXpath(pop.accStatDateColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.accStatTypeOfPayColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.accStatPriceWithoutDiscountColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.accStatWithDiscountColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.accStatComissionColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.accStatSumOfComColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.accStatTotalSum)).shouldBe(Condition.visible);

    }

    public void productsModule() {

        //open products module
        $(byText(pop.productsModule)).click();
        $(byXpath(pop.productsHeader)).shouldBe(Condition.visible, Duration.ofMillis(12000));

        //Menu's Buttons check
        $(byXpath(pop.productsList)).shouldBe(Condition.visible);
        $(byXpath(pop.productsUpload)).shouldBe(Condition.visible);
        $(byXpath(pop.productsBinding)).shouldBe(Condition.visible);

        //List Menu check
        $(byXpath(pop.productsSearch)).shouldBe(Condition.visible);

        //Upload Menu check
        $(byXpath(pop.productsUpload)).click();

        $(byXpath(pop.productsUploadBtn)).shouldBe(Condition.visible, Duration.ofMillis(12000));
        $(byXpath(pop.productsAutoUpdate)).shouldBe(Condition.visible);
        $(byXpath(pop.productsExcel)).shouldBe(Condition.visible);

        //Binding Menu check
        $(byXpath(pop.productsBinding)).click();

        $(byXpath(pop.productsBindingSearch)).shouldBe(Condition.visible, Duration.ofMillis(12000));
        $(byXpath(pop.productsRecognizedFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.productsSpecifyFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.productsUnrecFilter)).shouldBe(Condition.visible);

    }

    public void tariffModule() {

        //open tariff module
        $(byText(pop.tariffModule)).click();
    }

    public void settingsModule() {

        //open settings module
        $(byText(pop.settingsModule)).click();

        $(byXpath(pop.settingsHeader)).shouldBe(Condition.visible, Duration.ofMillis(21000));
        $(byXpath(pop.settingsInfo)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsDeliveryPoint)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsDelivery)).shouldBe(Condition.visible);

        //info menu check
        $(byXpath(pop.settingsResPersons)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsAccountantPers)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsPers)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsDeliveryPers)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsClaimsPers)).shouldBe(Condition.visible);

        //delivery point check
        $(byXpath(pop.settingsDeliveryPoint)).click();

        //delivery point menu check
        $(byXpath(pop.settingsDeliveryPointHeader)).shouldBe(Condition.visible, Duration.ofMillis(12000));
        $(byXpath(pop.settingsAllFilterBtn )).shouldBe(Condition.visible);
        $(byXpath(pop.settingsStoreFilterBtn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsStorageFilterBtn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsAddDeliveryPointBtn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsDeliveryPointSearch)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsIDColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsAdressColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsWorkTimeColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsTypeColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsTypeStorageColumn)).shouldBe(Condition.visible);

        //Delivery check
        $(byXpath(pop.settingsDelivery)).click();

        $(byXpath(pop.settingsInCityFilter)).shouldBe(Condition.visible, Duration.ofMillis(12000));
        $(byXpath(pop.settingsBtwnCitiesFilter)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsAddDeliveryBtn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsCityColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsPriceColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsTimeColumn )).shouldBe(Condition.visible);
        $(byXpath(pop.settingsTermColumn)).shouldBe(Condition.visible);
        $(byXpath(pop.settingsDeliveryColumn)).shouldBe(Condition.visible);

    }

}
