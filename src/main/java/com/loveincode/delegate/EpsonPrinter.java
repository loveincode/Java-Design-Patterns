package com.loveincode.delegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Specialised Implementation of {@link Printer} for a Epson Printer, in
 * this case the message to be printed is appended to "Epson Printer : "
 *
 * @see Printer
 */
public class EpsonPrinter implements Printer {

  private static final Logger LOGGER = LoggerFactory.getLogger(EpsonPrinter.class);

  /**
   * {@inheritDoc}
   */
  @Override
  public void print(String message) {
    LOGGER.info("Epson Printer : {}", message);
  }

}