package de.schdef.slash.coding.template

import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import scala.collection.mutable.ListBuffer
import org.junit.Test
import org.junit.Before

class ExampleSuite extends JUnitSuite with ShouldMatchersForJUnit {

  var sb: StringBuilder = _
  var lb: ListBuffer[String] = _

  @Before def initialize() {
    sb = new StringBuilder("ScalaTest is ")
    lb = new ListBuffer[String]
  }

  @Test def verifyEasy() { // Uses ScalaTest assertions
    sb.append("easy!")
    assert(sb.toString === "ScalaTest is easy!")
    assert(lb.isEmpty)
    lb += "sweet"
    intercept[StringIndexOutOfBoundsException] {
      "concise".charAt(-1)
    }
  }
}