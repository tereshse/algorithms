package org.tereshse.algorithms.sort.utils

import org.scalatest.FunSuite


class RandomUtilsTest extends FunSuite {

  test("test random generation in range") {
    for (i <- 0 until 100) {
      for (j <- 0 until 20) {
        assert(RandomUtils.getRandomInt(j) <= j)
      }
    }
  }
}
