package org.tereshse.algorithms.shuffling

import org.scalatest.FunSuite
import org.tereshse.algorithms.sort.utils.{RandomUtilsTest, SortUtils}
import collection.mutable

class ShuffleTest  extends FunSuite {
  val shuffle = new Shuffle()
  test("that shuffle of emply Array is empty Array") {
    //given //when //then
    assert(shuffle.shuffle(Array[Int]()).length == 0)
  }

  test("that shuffle of (1,2,3,4) Array shuffles Array") {
    //given
    val ar: Array[Int] = Array(1,2,3,4)
    // //when //then
    assert(!SortUtils.isSorted(shuffle.shuffle(ar)))
  }

  test("test shufling algo on predefined random number sequence"){
    //given
    val randomSequence = mutable.Stack(0,0,2,1)
    val sortedArray = Array(1,2,3,4)
    shuffle.random = (n: Int) => randomSequence.pop
    //when
    val shuffledArray = shuffle.shuffle(sortedArray)
    //then
    assert(shuffledArray === Array(2,4,3,1))
  }
}
