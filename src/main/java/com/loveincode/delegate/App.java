package com.loveincode.delegate;

/**
 * The delegate pattern provides a mechanism to abstract away the implementation and control of the desired action.
 * 委托模式提供了一种机制来抽象出所需操作的实现和控制。
 * 
 * The class being called in this case {@link PrinterController} is not responsible for the actual desired action,
 * but is actually delegated to a helper class either {@link CanonPrinter}, {@link EpsonPrinter} or {@link HpPrinter}.
 * The consumer does not have or require knowledge of the actual class carrying out the action, only the
 * container on which they are calling.
 * 在这种情况下调用的类{@PrinterControlController}不负责实际需要的操作，
 * 而是实际上委托给帮助程序类{@link CanonPrinter}，{@link EpsonPrinter}或{@link HpPrinter}。
 * 消费者没有或不需要知道实际行动的类别，只有他们正在呼叫的容器。
 *
 * In this example the delegates are {@link EpsonPrinter}, {@link HpPrinter} and {@link CanonPrinter} they all implement
 * {@link Printer}. The {@link PrinterController} class also implements {@link Printer}. However neither provide the
 * functionality of {@link Printer} by printing to the screen, they actually call upon the instance of {@link Printer}
 * that they were instantiated with. Therefore delegating the behaviour to another class.
 * 在这个例子中，代表是{@link EpsonPrinter}，{@link HpPrinter}和{@link CanonPrinter}，他们都实现了{@link Printer}。
 * {@link PrinterController}类还实现{@link Printer}。
 * 但是，它们既不通过打印到屏幕上来提供{@link Printer}的功能，而是实际调用它们实例化的{@link Printer}实例。 因此将行为委托给另一个类。
 */
public class App {

  public static final String MESSAGE_TO_PRINT = "hello world";

  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    PrinterController hpPrinterController = new PrinterController(new HpPrinter());
    PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
    PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

    hpPrinterController.print(MESSAGE_TO_PRINT);
    canonPrinterController.print(MESSAGE_TO_PRINT);
    epsonPrinterController.print(MESSAGE_TO_PRINT);
  }

}