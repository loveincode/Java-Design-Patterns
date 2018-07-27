package com.loveincode.Structural.adapter;

/**
 * An adapter helps two incompatible interfaces to work together. This is the real world definition
 * for an adapter. Interfaces may be incompatible but the inner functionality should suit the need.
 * The Adapter design pattern allows otherwise incompatible classes to work together by converting
 * the interface of one class into an interface expected by the clients.
 * 
 * 适配器有助于两个不兼容的接口一起工作。这是适配器的真实世界定义。
 * 接口可能不兼容，但内部功能应适合需要。
 * 适配器设计模式允许通过将一个类的接口转换为客户端期望的接口来协同工作。
 *
 * There are two variations of the Adapter pattern: The class adapter implements the adaptee's
 * interface whereas the object adapter uses composition to contain the adaptee in the adapter
 * object. This example uses the object adapter approach.
 * 
 * 适配器模式有两种变体：
 * 类适配器实现适配器的接口，
 * 而对象适配器使用合成器在适配器对象中包含适配器。本示例使用对象适配器方法。
 *
 * The Adapter ({@link FishingBoatAdapter}) converts the interface of the adaptee class (
 * {@link FishingBoat}) into a suitable one expected by the client ( {@link RowingBoat} ).
 * 
 * 适配器（{FishingBoatAdapter 渔船适配器}）将适配器类的接口（
 * {FishingBoat 钓鱼船}）变成客户期望的合适的（{RowingBoat 划艇}）。
 *
 * The story of this implementation is this. 
 * Pirates are coming! we need a {@link RowingBoat} to flee! We have a {@link FishingBoat} and our
 * captain. We have no time to make up a new ship! we need to reuse this {@link FishingBoat}. The
 * captain needs a rowing boat which he can operate. The spec is in {@link RowingBoat}. We will
 * use the Adapter pattern to reuse {@link FishingBoat}.
 * 
 * 这个实现的故事是这样的。
 * 海盗来了！我们需要一艘{RowingBoat划艇}逃离！我们有一艘{FishingBoat渔船}和我们的队长。
 * 我们没有时间去组建一艘新船！我们需要重用这个{FishingBoat钓鱼船}。
 * 该队长需要一艘他可以操作的划艇。规格在{RowingBoat划艇}中。我们会使用适配器模式重新使用{渔船}。
 *
 */
public class App {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    // The captain can only operate rowing boats but with adapter he is able to use fishing boats as well
    Captain captain = new Captain(new FishingBoatAdapter());
    captain.row();
  }
}