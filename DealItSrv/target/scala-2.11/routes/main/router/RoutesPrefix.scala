
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/DataBase/DealItSrv/conf/routes
// @DATE:Wed Oct 12 19:01:31 AST 2016


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
