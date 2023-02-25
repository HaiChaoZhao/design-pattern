package AdapterAndWrapper;

import com.haichao.day7.AdaptorAndFacade.Duck;
import com.haichao.day7.AdaptorAndFacade.MallardDuck;
import com.haichao.day7.AdaptorAndFacade.TurkeyAdapter;
import com.haichao.day7.AdaptorAndFacade.WildTurkey;

public class DuckTestDrive {
  public static void main(String[] args) {
    MallardDuck mallardDuck = new MallardDuck();
    WildTurkey wildTurkey = new WildTurkey();

    Duck turkeyAdpter = new TurkeyAdapter(wildTurkey);

    System.out.println("The Turkey says...");
    wildTurkey.gobble();
    wildTurkey.fly();

    System.out.println("\n The Duck says...");
    testDuck(mallardDuck);

    System.out.println("\n The TurkeyAdapter says...");
    testDuck(turkeyAdpter);
  }

  static void testDuck(Duck duck){
    duck.quack();
    duck.fly();
  }
}
