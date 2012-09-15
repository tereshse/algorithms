package org.tereshse.algorithms.sort.elementary

import org.scalatest.FunSuite
import org.tereshse.algorithms.sort.utils.SortUtils.swap
import org.tereshse.algorithms.sort.utils.SortUtils.less
import org.tereshse.algorithms.sort.utils.SortUtils.greater
import org.tereshse.algorithms.sort.utils.SortUtils.isSorted

class SortUtilsTest extends FunSuite {
  test("swap on null array do nothing") {
    //given
    try {
      //when
      swap(null, 0, 0)
    }
    catch {
      //then
      case _ => fail("swap method shouldn't throw any exception in null array case")
    }

  }

  test("swap on empty array do nothing") {
    //given
    val ar = Array[String]()
    //when
    try {
      swap(ar, 0, 0)
      //then
      assert(ar.length == 0)
    }
    catch {
      case _ => fail("swap method shouldn't throw any exception in empty array case")
    }
  }

  test("swap on one element array do nothing") {
    //given
    val ar = Array[java.lang.Integer](1)
    //when
    try {
      swap(ar, 0, 3)
      //then
      assert(ar.length == 1)
      assert(ar(0) == 1)
    }
    catch {
      case _ => fail("swap method shouldn't throw any exception in one element array case")
    }
  }
  test("swap on array elements") {
    //given
    val ar = Array[java.lang.Integer](1, 2, 4)
    //when
    swap(ar, 0, 2)
    //then
    assert(ar.length == 3)
    assert(ar(0) == 4)
    assert(ar(1) == 2)
    assert(ar(2) == 1)

  }

  test("less method test cases, quite obvious") {
    assert(less(1,2))
    assert(!less(2,1))
    assert(!less(2,2))
  }

  test("greater method test cases, quite obvious") {
    assert(!greater(1,2))
    assert(greater(2,1))
    assert(!greater(2,2))
  }
  test("isSorted returns true on null array") {
    //given //when //then
     assert(isSorted(null))
  }
  test("isSorted returns true on 0 and 1 element array") {
    //given //when //then
    assert(isSorted(Array[Int]()))
    assert(isSorted(Array[Int](1)))
  }

  test("isSorted returns true on 0,1,2,3 array") {
    //given //when //then
    assert(isSorted(Array[Int](0,1,2,3)))
  }

  test("isSorted returns true on 0,1,1,2,3 array") {
    //given //when //then
    assert(isSorted(Array[Int](0,1,1,2,3)))
  }


  test("isSorted returns false on 0,1,3,2 array") {
    //given //when //then
    assert(!isSorted(Array[Int](0,1,3,2)))
  }
}
