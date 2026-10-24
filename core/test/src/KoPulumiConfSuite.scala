package jp.ukiba.ko_pulumi

import scala.jdk.OptionConverters.*

class KoPulumiConfSuite extends munit.FunSuite:
  def protectOf(conf: KoPulumiConf): Option[Boolean] =
    conf.customResourceOptionsBuilder.build.getProtect.toScala.map(_.booleanValue)

  test("defaultProtect = None leaves protect unset"):
    assertEquals(protectOf(KoPulumiConf()), None)

  test("defaultProtect = Some(true) sets protect"):
    assertEquals(protectOf(KoPulumiConf(defaultProtect = Some(true))), Some(true))

  test("defaultProtect = Some(false) sets protect"):
    assertEquals(protectOf(KoPulumiConf(defaultProtect = Some(false))), Some(false))
