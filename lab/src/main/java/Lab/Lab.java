package Lab;

import Lab.Beans.ElectricEngine;
import Lab.Beans.GasEngine;
import Lab.Beans.NuclearEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Lab {

  /**
   * Notice that the ApplicationContext is itself a bean that can be retrieved from the Spring IOC
   * container (in a sense, from itself, since this is now a Bean used to retrieve Beans)
   */

  //Example of constructor injection
// private final ApplicationContext applicationContext;
//
// public Lab (ApplicationContext applicationContext) {
//   this.applicationContext = applicationContext;
// }


  //Example of setter injection
  private ApplicationContext applicationContext;
  @Autowired
  public void setApplicationContext(ApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  /**
   * Retrieves the ElectricPoweredBean from the ApplicationContext by requesting a bean of the class
   * ElectricEngine. There is no need to modify this method.
   *
   * @return an ElectricEngine bean
   */
  public ElectricEngine getElectricPoweredBean() {
    return applicationContext.getBean(ElectricEngine.class);
  }

  /**
   * TODO: Retrieve a GasEngine bean and return it.
   *
   * @return a GasEngine bean
   */
  public GasEngine getGasPoweredBean() {
    return applicationContext.getBean(GasEngine.class);
  }

  /**
   * TODO: Retrieve a NuclearEngine bean and return it.
   *
   * @return a NuclearEngine bean
   */
  public NuclearEngine getNuclearPoweredBean() {
    return applicationContext.getBean(NuclearEngine.class);
  }

    /*
    The `.class` is used in this context to get the `Class` object associated with the
    `NuclearEngine` class.
    The `getBean()` method of the `ApplicationContext` requires a `Class` object as an argument
    to specify the type of bean to retrieve from the Spring IoC container.

    When you use `NuclearEngine.class`, you're not creating a new instance
    of `NuclearEngine`, but rather you're referencing the `Class` object
     that represents the `NuclearEngine` class in the JVM.
     This `Class` object contains metadata about the `NuclearEngine` class,
       such as its methods, fields, annotations, etc.

    The `getBean()` method uses this `Class` object to find a bean
    of the same type in the Spring IoC container.
    If such a bean exists, it is returned; otherwise, an exception is thrown.

    So, `applicationContext.getBean(NuclearEngine.class)` is asking the
    Spring IoC container to find and return a bean of type `NuclearEngine`.
     */
}
