package TemplateMethod;

import com.haichao.day8.TemplateMethod.Coffee;
import com.haichao.day8.TemplateMethod.Tea;

public class TeamplateMethodTest {
  public static void main(String[] args) {
    Tea myTea = new Tea();
    myTea.prepareRecipe();

    Coffee coffee = new Coffee();
  }
}
