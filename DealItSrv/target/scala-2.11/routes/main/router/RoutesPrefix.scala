
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/ProjectDataBase/DataBase-master/DealItSrv/conf/routes
// @DATE:Sat Oct 08 16:58:43 PDT 2016


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
