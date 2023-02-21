import com.haichao.day4.Factory.Chicago.ChichagoPizzaStore;
import com.haichao.day4.Factory.NYStyle.NYStylePizzaFactory;
import com.haichao.day4.Factory.NYStyle.NYStylePizzaStore;
import com.haichao.day4.Factory.PizzaStore;

public class factoryTest {

  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYStylePizzaStore();
    nyPizzaStore.orderPizza("cheese");

//    PizzaStore chicagoPizzaStore = new ChichagoPizzaStore();
//    chicagoPizzaStore.orderPizza("cheese");

  }
}
