package com.loveincode.Structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Device class (adaptee in the pattern). We want to reuse this class.
 * Fishing boat moves by sailing.
 *
 */
public class FishingBoat {

  private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoat.class);

  public void sail() {
    LOGGER.info("渔船正在航行 The fishing boat is sailing");
  }

}