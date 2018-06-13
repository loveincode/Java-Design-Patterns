package com.loveincode.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * The Prototype pattern is a creational design pattern in software development. It is used when the
 * type of objects to create is determined by a prototypical instance, which is cloned to produce
 * new objects. This pattern is used to: - avoid subclasses of an object creator in the client
 * application, like the abstract factory pattern does. - avoid the inherent cost of creating a new
 * object in the standard way (e.g., using the 'new' keyword)
 * 原型模式是软件开发中一种创造性的设计模式。
 * 当要创建的对象的类型由一个原型实例确定时，它被克隆以生成新的对象。此模式用于：避免客户端应用程序中的对象生成器的子类，
 * 如抽象工厂模式。-避免以标准方式创建新对象的固有成本（例如，使用“新”关键字）
 * <p>
 * In this example we have a factory class ({@link HeroFactoryImpl}) producing objects by cloning
 * the existing ones. The factory's prototype objects are given as constructor parameters.
 * 在这个例子中，我们有一个工厂类（{@ HeroFactoryImpl}），通过克隆现有的类生成对象。 工厂的原型对象作为构造函数参数给出。
 * 
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    HeroFactory factory;
    Mage mage;
    Warlord warlord;
    Beast beast;

    factory = new HeroFactoryImpl(new ElfMage("cooking"), new ElfWarlord("cleaning"), new ElfBeast("protecting"));
    mage = factory.createMage();
    warlord = factory.createWarlord();
    beast = factory.createBeast();
    LOGGER.info(mage.toString());
    LOGGER.info(warlord.toString());
    LOGGER.info(beast.toString());

    factory = new HeroFactoryImpl(new OrcMage("axe"), new OrcWarlord("sword"), new OrcBeast("laser"));
    mage = factory.createMage();
    warlord = factory.createWarlord();
    beast = factory.createBeast();
    LOGGER.info(mage.toString());
    LOGGER.info(warlord.toString());
    LOGGER.info(beast.toString());
  }
}