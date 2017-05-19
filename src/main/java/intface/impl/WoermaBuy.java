package intface.impl;

import intface.Buy;

/**
 * @desc
 * @author chenxy
 * @date createTime:May 18, 2017 2:35:08 AM
 */
public class WoermaBuy implements Buy {

  @Override
  public void buy() {
    System.out.println("我去沃尔玛进行购物");
  }
}
