
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/Database/DataBase/DealItSrv/conf/routes
// @DATE:Tue Oct 11 15:41:24 PDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
