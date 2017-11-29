
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alejandro.arboleda/eclipse-workspace/play-java/conf/routes
// @DATE:Wed Nov 29 09:33:18 COT 2017


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
