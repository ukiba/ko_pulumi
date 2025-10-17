package jp.ukiba.ko_pulumi

class JavaResourceSuite extends munit.FunSuite:
  val readResourcesRegex = JavaResource.readResourcesRegex(getClass)
  val readResourcesGlob  = JavaResource.readResourcesGlob (getClass)

    /*
      echo -n A   > core/test/resources/A.txt
      echo -n A1  > core/test/resources/A1.txt
      echo -n A12 > core/test/resources/A12.txt
      echo -n B1  > core/test/resources/B1.txt

      echo -n PA   > core/test/resources/jp/ukiba/ko_pulumi/A.txt
      echo -n PA1  > core/test/resources/jp/ukiba/ko_pulumi/A1.txt
      echo -n PA12 > core/test/resources/jp/ukiba/ko_pulumi/A12.txt
      echo -n PB1  > core/test/resources/jp/ukiba/ko_pulumi/B1.txt
    */

  test("/A.txt"):
    assertEquals(readResourcesRegex("/A.txt"), Seq("A"))

  test("/A1*.txt"):
    assertEquals(readResourcesGlob("/A1*.txt"), Seq("A1", "A12"))

  test("A.txt"):
    assertEquals(readResourcesRegex("A.txt"), Seq("PA"))

  test("A1*.txt"):
    assertEquals(readResourcesGlob("A1*.txt"), Seq("PA1", "PA12"))
