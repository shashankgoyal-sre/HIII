package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadDto {


  val User1:User=User("Shashank","Goyal","shashank.goyal@knoldus.com","Knoldus")
  val User2:User=User("Shivam","Agarwal","shivam.agarwal@knoldus.com","Knoldus")

  val Users: HashMap[String,User] = HashMap("Shashank" -> User1, "Shivam" -> User2)

  def getUserByName(name: String): Option[User] = Users.get(name)

}
