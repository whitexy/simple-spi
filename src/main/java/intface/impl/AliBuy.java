package intface.impl;

import intface.Buy;

/**
 * @desc
 * @author chenxy
 * @date createTime:May 18, 2017 2:33:58 AM
 */
public class AliBuy implements Buy {

  @Override
  public void buy() {
    System.out.println("我使用阿里巴巴的淘宝进行网购。");

  }

}
