package com.loveincode.Behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * The Strategy pattern (also known as the policy pattern) is a software design pattern that enables
 * an algorithm's behavior to be selected at runtime.
 * 策略模式（也称为策略模式）是一种软件设计模式，可以在运行时选择算法的行为。
 * <p>
 * Before Java 8 the Strategies needed to be separate classes forcing the developer
 * to write lots of boilerplate code. With modern Java it is easy to pass behavior
 * with method references and lambdas making the code shorter and more readable.
 * 在Java 8之前，Strategies需要成为独立的类，迫使开发人员编写大量样板代码。 使用现代Java，使用方法引用和lambda表达式来传递行为很容易，从而使代码更短，更易读。
 * <p>
 * In this example ({@link DragonSlayingStrategy}) encapsulates an algorithm. The containing object
 * ({@link DragonSlayer}) can alter its behavior by changing its strategy.
 * 在这个例子中（{@link DragonSlayingStrategy}）封装了一个算法。 包含对象（{@link DragonSlayer}）可以通过更改其策略来改变其行为。
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  
  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    // GoF Strategy pattern
    LOGGER.info("Green dragon spotted ahead!");
    DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
    dragonSlayer.goToBattle();
    LOGGER.info("Red dragon emerges.");
    dragonSlayer.changeStrategy(new ProjectileStrategy());
    dragonSlayer.goToBattle();
    LOGGER.info("Black dragon lands before you.");
    dragonSlayer.changeStrategy(new SpellStrategy());
    dragonSlayer.goToBattle();

    // Java 8 Strategy pattern
    LOGGER.info("Green dragon spotted ahead!");
    dragonSlayer = new DragonSlayer(
        () -> LOGGER.info("With your Excalibur you severe the dragon's head!"));
    dragonSlayer.goToBattle();
    LOGGER.info("Red dragon emerges.");
    dragonSlayer.changeStrategy(() -> LOGGER.info(
        "You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
    dragonSlayer.goToBattle();
    LOGGER.info("Black dragon lands before you.");
    dragonSlayer.changeStrategy(() -> LOGGER.info(
        "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
    dragonSlayer.goToBattle();
  }
}