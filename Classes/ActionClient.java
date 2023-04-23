package Classes;

/**Создание наследика класса Actor*/
public class ActionClient extends Actor{
    /**Поле имя акции*/
    private String actionName;
    /**Сатическое поле номер акционного клиента*/
    static int numberOfActionClient;

    /** Конструктор из 3 переменных
     * @param name
     * @param actionsName
     * @param numbersOfActionClient
     */
    public ActionClient(String name, String actionsName, int numbersOfActionClient) {
        super(name);
        this.actionName = actionsName;
        numberOfActionClient = numbersOfActionClient;
    }

    /** Переопределение геттера getName()*/
    @Override
    public String getName() {
        return super.name;
    }
    /** Геттер getActionName()*/
    public String getActionName() {
        return actionName;
    }
    /** Геттер getNumberOfActionClient()*/
    public static int getNumberOfActionClient() {
        return numberOfActionClient;
    }
    /**Сеттер setActionName()
     * @param actionName
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**Сеттер setNumberOfActionClient()
     * @param numberOfActionClient
     */
    public static void setNumberOfActionClient(int numberOfActionClient) {
        ActionClient.numberOfActionClient = numberOfActionClient;
    }

    /**Переопределение сеттера сделать заказ
     * @param makeOrder
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**Переопределение сеттера забрать заказ
     * @param pickUpOrder
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        //if (numberOfActionClient < 2) {
        super.isTakeOrder = pickUpOrder;
        //}
        //else {
        //    System.out.println("Акция закончилась. В покупке акционного товара отказано!");
        //    super.isTakeOrder = false;
        //}
    }

    /**Переопределение метода сделан заказ*/
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**Переопределение метода забрать заказ*/
    @Override
    public boolean isTakeOrder() {
        //if (numberOfActionClient < 2) {
        return super.isTakeOrder;
        //}
        //    else {
        //       //System.out.println("Акция закончилась. В покупке акционного товара отказано");
        //       return true;
        // }
    }

    /**Переопределение геттера getActor()*/
    @Override
    public Actor getActor() {
        return this;
    }
    /**Переопределение сеттера возврат заказа*/
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }
    /**Переопределение метода возврат заказа*/
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
}
