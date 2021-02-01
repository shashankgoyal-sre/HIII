package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class UserReadDtoTest extends AnyFlatSpec {

  val user = new UserReadDto()

  "Shashank User " should "exist in database" in
  {
    val result = user.getUserByName("Shashank")
    assert(!result.isEmpty)
  }

  "Sam User " should "exist in database" in
    {
      val result = user.getUserByName("Sam")
      assert(result.isEmpty)
    }




}
