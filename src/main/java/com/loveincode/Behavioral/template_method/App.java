package com.loveincode.Behavioral.template_method;

/**
 * 
 * Template Method defines a skeleton for an algorithm. The algorithm subclasses provide
 * implementation for the blank parts.
 * 模板方法为算法定义了一个框架。 算法子类为空白部分提供实现。
 * <p>
 * In this example {@link HalflingThief} contains {@link StealingMethod} that can be changed. First
 * the thief hits with {@link HitAndRunMethod} and then with {@link SubtleMethod}.
 * 在此示例中，{@link HalflingThief}包含可更改的{@link StealingMethod}。 
 * 首先，小偷用{@link HitAndRunMethod}然后用{@link SubtleMethod}击中。
 * 
 */
public class App {

  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    HalflingThief thief = new HalflingThief(new HitAndRunMethod());
    thief.steal();
    thief.changeMethod(new SubtleMethod());
    thief.steal();
  }
}