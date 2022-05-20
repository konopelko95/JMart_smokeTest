package kz.jusan.selenide;

public class PageObjectsPath {

    /**
     * Authorization
     */


    //go to merchant Kabinet Button
    String toMerchantKabBtn = "/html[1]/body[1]/j-root[1]/div[1]/j-login[1]/section[1]/j-footer[1]/j-copyright[1]/j-environment-change[1]/div[1]/div[2]/button[1]";

    //email field
    String emailField = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-auth-form[1]/section[1]/div[1]/div[1]/section[1]/form[1]/j-input[1]/div[1]/input[1]";

    //password field
    String passField = "[type=password]";
    //entrance button
    String entranceBtn = "[type=submit]";


    //jusan logo
    String jusanLogo = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[1]/j-aside[1]/section[2]/section[1]/section[1]/div[1]";


    /**
     * modules
     */

    String ordersModule = "Заказы";
    String accountStatementModule = "Выписка";
    String productsModule = "Товары";
    String tariffModule = "Тарифы";
    String settingsModule ="Настройки";

    /**
     * orders module
     */

    //orders header
    String ordersHeader = "//h2[contains(text(),'Заказы')]";

    //search Field
    String ordersSearchField = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-orders[1]/section[1]/j-main-orders-page[1]/j-order-search[1]/j-search-input[1]/div[1]/input[1]";
    //filters
    String allFilter = "//button[contains(text(),'Все')]";
    String newFilter = "//button[contains(text(),'Новые')]";
    String readyForDeliveryFilter = "//button[contains(text(),'Готовы к выдаче')]";
    String deliveringFilter = "//button[contains(text(),'Доставляются')]";
    String issuedFilter = "//button[contains(text(),'Выданные')]";
    String toRefundFilter = "//button[contains(text(),'На возврат')]";
    String returnedFilter = "//button[contains(text(),'Возвращённые')]";
    String canceledFilter = "//button[contains(text(),'Отмененные')]";

    //columns
    String ordersnumberOfOrderColumn = "//span[contains(text(),'№ заказа')]";
    String ordersdateColumn  = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-orders[1]/section[1]/j-main-orders-page[1]/j-order-table[1]/div[1]/j-table[1]/table[1]/thead[1]/tr[1]/th[1]";
    String statusColumn = "//span[contains(text(),'Статус')]";
    String cityColumn = "//span[contains(text(),'Город')]";
    String buyerColumn = "//span[contains(text(),'Покупатель')]";
    String phoneColumn = "//span[contains(text(),'Телефон')]";
    String typeOfDeliveryColumn = "//span[contains(text(),'Телефон')]";
    String totalSumColumn = "//span[contains(text(),'Телефон')]";


    /**
     * Account Statement Module
     */

    String accStatHeader = "//h2[contains(text(),'Выписка')]";

    //account Statement Search Field
    String accStatSearch = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-account-statement[1]/section[1]/div[1]/div[1]/j-account-statement-search[1]/j-search-input[1]/div[1]/input[1]";

    //all time button
    String accStatAllTimeBtn = "За всё время";

    //columns
    String accStatDateColumn = "//th[contains(text(),'Дата')]";
    String accStatTypeOfPayColumn = "//th[contains(text(),'Тип оплаты')]";
    String accStatPriceWithoutDiscountColumn = "//th[contains(text(),'Цена без скидки')]";
    String accStatWithDiscountColumn = "//th[contains(text(),'Цена со скидкой')]";
    String accStatComissionColumn = "//th[contains(text(),'Комиссия')]";
    String accStatSumOfComColumn = "//th[contains(text(),'Сумма комиссии')]";
    String accStatTotalSum = "//th[contains(text(),'Сумма комиссии')]";

    /**
     * Products module
     */

    String productsHeader = "//h2[contains(text(),'Товары')]";
    String productsList = "//a[contains(text(),'Список')]";
    String productsUpload = "//a[contains(text(),'Загрузка')]";
    String productsBinding = "//a[contains(text(),'Привязка')]";

    //listMenu
    String productsSearch = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-jmart-products[1]/section[1]/j-main-product-page[1]/div[1]/j-search-input[1]/div[1]/input[1]";

    //uploadMenu
    String productsUploadBtn = "//button[contains(text(),'Загрузка файла')]";
    String productsAutoUpdate = "//button[contains(text(),'Автообновление')]";
    String productsExcel = "//div[contains(text(),'Перетащите и отпустите файл Excel для загрузки')]";

    //BindingMenu
    String productsBindingSearch = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-jmart-products[1]/section[1]/j-binding-product-page[1]/div[3]/j-search-input[1]/div[1]/input[1]";
    String productsRecognizedFilter = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-jmart-products[1]/section[1]/j-binding-product-page[1]/div[2]/button[1]";
    String productsSpecifyFilter = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-jmart-products[1]/section[1]/j-binding-product-page[1]/div[2]/button[2]";
    String productsUnrecFilter = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-jmart-products[1]/section[1]/j-binding-product-page[1]/div[2]/button[3]";

    /**
     * Tariff Module
     */

    /**
     * Settings Module
     */
    String settingsHeader = "//h2[contains(text(),'Настройки')]";
    String settingsInfo = "//a[contains(text(),'Информация')]";
    String settingsDeliveryPoint = "//a[contains(text(),'Пункт выдачи')]";
    String settingsDelivery = "//a[contains(text(),'Доставка')]";

    //info menu
    String settingsResPersons = "//h5[contains(text(),'Ответственные лица')]";
    String settingsAccountantPers = "//h6[contains(text(),'Бухгалтерские вопросы')]";
    String settingsPers = "//h6[contains(text(),'Обновление остатков')]";
    String settingsDeliveryPers = "//h6[contains(text(),'Вопросы доставки')]";
    String settingsClaimsPers = "//h6[contains(text(),'Жалобы и отзывы клиентов')]";

    //delivery point menu
    String settingsDeliveryPointHeader = "//h6[contains(text(),'Пункты выдачи заказа')]";
    String settingsAllFilterBtn = "//button[contains(text(),'Все')]";
    String settingsStoreFilterBtn = "//button[contains(text(),'Магазин')]";
    String settingsStorageFilterBtn = "//button[contains(text(),'Склад')]";
    String settingsAddDeliveryPointBtn = "//span[contains(text(),'Добавить пункт выдачи')]";
    String settingsDeliveryPointSearch = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-jmart-settings[1]/section[1]/j-pickup-points[1]/section[1]/div[1]/div[2]/div[1]/j-form-field[1]/div[1]/div[1]/div[1]/div[2]";
    String settingsIDColumn = "//p[contains(text(),'ID')]";
    String settingsAdressColumn = "//p[contains(text(),'Адрес')]";
    String settingsWorkTimeColumn = "//p[contains(text(),'Режим работы')]";
    String settingsTypeColumn = "/html[1]/body[1]/j-root[1]/div[1]/j-jmart-cabinet-layout[1]/j-layout-home[1]/section[1]/section[2]/j-main[1]/div[1]/section[1]/section[1]/j-jmart-settings[1]/section[1]/j-pickup-points[1]/section[1]/div[2]/j-points-table[1]/section[1]/div[1]/p[4]";
    String settingsTypeStorageColumn = "//p[contains(text(),'Тип склада')]";

    //Delivery menu
    String settingsInCityFilter = "//a[contains(text(),'По городу')]";
    String settingsBtwnCitiesFilter = "//a[contains(text(),'Межгород')]";
    String settingsAddDeliveryBtn = "//span[contains(text(),'Добавить доставку')]";
    String settingsCityColumn = "//span[contains(text(),'Населенный пункт')]";
    String settingsPriceColumn = "//span[contains(text(),'Стоимость')]";
    String settingsTimeColumn = "//span[contains(text(),'Время')]";
    String settingsTermColumn = "//span[contains(text(),'Срок')]";
    String settingsDeliveryColumn = "//span[contains(text(),'Доставка')]";

}
