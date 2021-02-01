package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  val obj_email=new EmailValidator()

  "The email" should "be correct "in{
    var res:Boolean=obj_email.emailIdIsValid("Shashank123.goyal@knoldus.com")
    assert(res==true)

  }
  "email" should "invalid with missing @" in {
    var result: Boolean =obj_email.emailIdIsValid("shashank.goyalgmail.com")
    assert(result == false)
  }
  "email" should "invalid with missing top level domain" in {
    var result: Boolean =obj_email.emailIdIsValid("shashank@gil")
    assert(result == false)
  }

  "email" should "invalid when wrong top level domain except .com/.org/.net" in {
    var result: Boolean =obj_email.emailIdIsValid("shashank@gmail.uk")
    assert(result == false)
  }


}
