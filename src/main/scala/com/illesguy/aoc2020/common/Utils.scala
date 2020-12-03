package com.illesguy.aoc2020.common

import scala.io.Source

object Utils {
  def getInputForDay(day: Int): Seq[String] = Source.fromFile(s"data/day$day/input.txt").getLines()
    .toSeq.map(_.stripLineEnd)
}
