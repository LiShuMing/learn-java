package com.netease.study.learnjava.inject;

import com.google.inject.ImplementedBy;

/**
 * @author : lishuming
 */

@ImplementedBy(HelloImpl.class)
public interface Hello {
  void sayHello();
}
