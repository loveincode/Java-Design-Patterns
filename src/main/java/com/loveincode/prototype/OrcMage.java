package com.loveincode.prototype;

/**
 * 
 * OrcMage
 *
 */
public class OrcMage extends Mage {

  private String weapon;

  public OrcMage(String weapon) {
    this.weapon = weapon;
  }
  
  public OrcMage(OrcMage orcMage) {
    this.weapon = orcMage.weapon;
  }

  @Override
  public OrcMage copy() throws CloneNotSupportedException {
    return new OrcMage(this);
  }

  @Override
  public String toString() {
    return "Orcish mage attacks with " + weapon;
  }

}