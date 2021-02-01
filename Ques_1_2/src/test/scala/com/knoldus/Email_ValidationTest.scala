package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class Email_ValidationTest extends AnyFlatSpec {

  val obj_email=new Email_Validation()

  "The email" should "be correct "in{
    var res:Boolean=obj_email.isValid(email="Shashank123.goyal@knoldus.com")
    assert(res==true)

  }
  "email" should "invalid with missing @" in {
    var result: Boolean =obj_email.isValid("shashank.goyalgmail.com")
    assert(result == false)
  }
  "email" should "invalid with missing top level domain" in {
    var result: Boolean =obj_email.isValid ("shashank@gil")
    assert(result == false)
  }

  "email" should "invalid when wrong top level domain except .com/.org/.net" in {
    var result: Boolean =obj_email.isValid("shashank@gmail.uk")
    assert(result == false)
  }


}
