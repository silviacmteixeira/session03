package upskill
import scala.language.adhocExtensions
import org.scalatest.funsuite.AnyFunSuite

import java.math.BigInteger

class labRecursionTest extends AnyFunSuite:
  test("sumFirstNumber") {
    assert(labRecursion.sumFirstNumbers(3)===6)
    assert(labRecursion.sumFirstNumbers(2)===3)
    assert(labRecursion.sumFirstNumbers(1)===1)
    assert(labRecursion.sumFirstNumbers(-1)=== -1)
    assert(labRecursion.sumFirstNumbers(7)=== 28)
  }
  test("sumFirstNumbersTR") {
    assert(labRecursion.sumFirstNumbers(3)===6)
    assert(labRecursion.sumFirstNumbers(2)===3)
    assert(labRecursion.sumFirstNumbers(1)===1)
    assert(labRecursion.sumFirstNumbers(-1)=== -1)
    assert(labRecursion.sumFirstNumbers(7)=== 28)
}

  test("repeatChar") {
    assert(labRecursion.repeatChar('a',3)==="aaa")
    assert(labRecursion.repeatChar('2',4)==="2222")
    assert(labRecursion.repeatChar('?',5)==="?????")
    assert(labRecursion.repeatChar('F',7)==="FFFFFFF")
    assert(labRecursion.repeatChar('T',0)==="")
  }

  test("repeatCharTR") {
    assert(labRecursion.repeatChar('a', 3) === "aaa")
    assert(labRecursion.repeatChar('2', 4) === "2222")
    assert(labRecursion.repeatChar('?', 5) === "?????")
    assert(labRecursion.repeatChar('F', 7) === "FFFFFFF")
    assert(labRecursion.repeatChar('T', 0) === "")
  }

    test("repeatNumber") {
    assert(labRecursion.repeatNumber(1,3)==="111")
    assert(labRecursion.repeatNumber(2,4)==="2222")
    assert(labRecursion.repeatNumber(3,1)==="3")
    assert(labRecursion.repeatNumber(31,2)==="3131")
    assert(labRecursion.repeatNumber(7,0)==="")
  }

  test("repeatNumberTR") {
    assert(labRecursion.repeatNumber(1,3)==="111")
    assert(labRecursion.repeatNumber(2,4)==="2222")
    assert(labRecursion.repeatNumber(3,1)==="3")
    assert(labRecursion.repeatNumber(31,2)==="3131")
    assert(labRecursion.repeatNumber(7,0)==="")
  }

  test("repeatString") {
    assert(labRecursion.repeatString("sapo",3)==="saposaposapo")
    assert(labRecursion.repeatString("",4)==="")
    assert(labRecursion.repeatString("sapo",1)==="sapo")
    assert(labRecursion.repeatString("ola",0)==="")
    assert(labRecursion.repeatString("OK",2)==="OKOK")
  }

  test("repeatStringTR") {
    assert(labRecursion.repeatString("sapo",3)==="saposaposapo")
    assert(labRecursion.repeatString("",4)==="")
    assert(labRecursion.repeatString("sapo",1)==="sapo")
    assert(labRecursion.repeatString("ola",0)==="")
    assert(labRecursion.repeatString("OK",2)==="OKOK")
  }

  test("factorial") {
    assert(labRecursion.factorial(3)===6)
    assert(labRecursion.factorial(4)===24)
    assert(labRecursion.factorial(8)===40320)
    assert(labRecursion.factorial(0)===1)
    assert(labRecursion.factorial(5)===120)
  }

  test("factorialTR") {
    assert(labRecursion.factorialTR(3)===6)
    assert(labRecursion.factorialTR(4)===24)
    assert(labRecursion.factorialTR(4)===24)
    assert(labRecursion.factorialTR(4)===24)
    assert(labRecursion.factorialTR(4)===24)
  }

