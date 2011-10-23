package de.schdef.slash.coding.template

import org.specs2.mutable._
import org.junit.runner._
import org.specs2.runner._
import de.schdef.slash.coding.dummy._

@RunWith(classOf[JUnitRunner])
class DataUtilSpec extends Specification {

  "The given value" should {
    "be invalid" in {
      var util = new DataUtil()
      util.isValid(12L) must be equalTo(false)
    }
  }
  
}