
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kevin/Documents/DataBase/DealItSrv/conf/routes
// @DATE:Wed Oct 12 22:00:25 AST 2016


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
