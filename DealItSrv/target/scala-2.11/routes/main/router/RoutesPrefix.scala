
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deadmanpr/Documents/Git/DataBase/DealItSrv/conf/routes
// @DATE:Thu Oct 13 14:26:14 AST 2016


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
