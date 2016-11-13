
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/Copia Actual/DataBase/DealItSrv/conf/routes
// @DATE:Sun Nov 13 14:43:22 PST 2016


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
