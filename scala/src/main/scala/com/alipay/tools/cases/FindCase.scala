package com.alipay.tools.cases

import scala.util.Try

object FindCase {
  def parseInt(value: String): Try[Int] = Try(value.toInt)
  def main(args: Array[String]): Unit = {

    val a = Array("a", "1", "2", "3")

    val xx = a.map(x => {
      println(s"x=${x}")
      parseInt(x)
    }).find(_.isSuccess).getOrElse("0")

    println(xx)
  }
}
