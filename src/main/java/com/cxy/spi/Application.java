package com.cxy.spi;

import intface.Buy;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @desc
 * @author chenxy
 * @date createTime:May 18, 2017 2:35:42 AM
 */
public class Application {
  public static void main(String[] args) {
    Buy buy = newBuy();
    buy.buy();
  }

  public static Buy newBuy() {
    Buy buy = null;
    ServiceLoader<Buy> serviceLoader = ServiceLoader.load(Buy.class);
    Iterator<Buy> buys = serviceLoader.iterator();
    if (buys.hasNext()) {
      buy = buys.next();
    }
    return buy;
  }
}
