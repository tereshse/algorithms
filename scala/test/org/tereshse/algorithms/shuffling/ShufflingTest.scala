package org.tereshse.algorithms.shuffling

import org.scalatest.FunSuite
import org.tereshse.algorithms.sort.utils.SortUtils

class ShufflingTest  extends FunSuite {
  val shuffling = new Shuffling()
  test("that shuffle of emply Array is empty Array") {
    //given //when //then
    assert(shuffling.shuffle(Array[Int]()).length == 0)
  }

  test("that shuffle of (1,2,3,4) Array shuffles Array") {
    //given
    val ar: Array[Int] = Array(1,2,3,4)
    // //when //then
    assert(!SortUtils.isSorted(shuffling.shuffle(ar)))
  }
}
