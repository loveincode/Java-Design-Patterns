package com.loveincode.Creational.prototype;

/**
 * 
 * OrcBeast
 *
 */
public class OrcBeast extends Beast {
  
  private String weapon;

  public OrcBeast(String weapon) {
    this.weapon = weapon;
  }
  
  public OrcBeast(OrcBeast orcBeast) {
    this.weapon = orcBeast.weapon;
  }

  @Override
  public Beast copy() throws CloneNotSupportedException {
    return new OrcBeast(this);
  }

  @Override
  public String toString() {
    return "Orcish wolf attacks with " + weapon;
  }
  

}