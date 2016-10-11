
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/ProjectDataBase/DataBase-master/DealItSrv/conf/routes
// @DATE:Tue Oct 11 12:54:55 PDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Application_1: controllers.Application,
  // @LINE:11
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Application_1: controllers.Application,
    // @LINE:11
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv""", """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/submit""", """controllers.Application.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/logout""", """controllers.Application.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/signup""", """controllers.Application.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users""", """controllers.Application.getUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users/""" + "$" + """id<[^/]+>""", """controllers.Application.getUserByID(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users""", """controllers.Application.addUser"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users""", """controllers.Application.updateUser"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/users/""" + "$" + """id<[^/]+>""", """controllers.Application.deleteUserByID(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items""", """controllers.Application.getItems"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items/""" + "$" + """id<[^/]+>""", """controllers.Application.getItemByID(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items""", """controllers.Application.addItem"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items""", """controllers.Application.updateItem"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items/""" + "$" + """id<[^/]+>""", """controllers.Application.deleteItemByID(id:Integer)"""),
    ("""GET""", this.prefix, """controllers.Assets.at(path:String = "/public/html/", file:String = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular", file:String = "angular.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-route.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-route", file:String = "angular-route.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main.js""", """controllers.Assets.at(path:String = "/public/javascripts/", file:String = "main.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-aria.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-aria", file:String = "angular-aria.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material", file:String = "angular-material.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-animate.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-animate", file:String = "angular-animate.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-messages.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-messages", file:String = "angular-messages.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material-icons.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material-icons", file:String = "angular-material-icons.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material.css""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material", file:String = "angular-material.css")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "home.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "about.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "login.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/login""", """controllers.Assets.at(path:String = "/public/images", file:String = "login.jpg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/car""", """controllers.Assets.at(path:String = "/public/images", file:String = "car.jpg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/conversation""", """controllers.Assets.at(path:String = "/public/images", file:String = "conversation.jpeg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/furniture""", """controllers.Assets.at(path:String = "/public/images", file:String = "furniture.jpeg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/gray""", """controllers.Assets.at(path:String = "/public/images", file:String = "gray.jpg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/house""", """controllers.Assets.at(path:String = "/public/images", file:String = "house.jpeg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/startup""", """controllers.Assets.at(path:String = "/public/images", file:String = "startup.jpg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/technology""", """controllers.Assets.at(path:String = "/public/images", file:String = "technology.jpeg")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/write""", """controllers.Assets.at(path:String = "/public/images", file:String = "write.jpg")"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv")))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page (Must be called first)""",
      this.prefix + """DealItSrv"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/submit")))
  )
  private[this] lazy val controllers_Application_login2_invoker = createInvoker(
    Application_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "POST",
      """ Login / Logout""",
      this.prefix + """login/submit"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_logout3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/logout")))
  )
  private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
    Application_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/logout"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_signup4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/signup")))
  )
  private[this] lazy val controllers_Application_signup4_invoker = createInvoker(
    Application_1.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "signup",
      Nil,
      "POST",
      """Sign Up""",
      this.prefix + """login/signup"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_getUsers5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users")))
  )
  private[this] lazy val controllers_Application_getUsers5_invoker = createInvoker(
    Application_1.getUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUsers",
      Nil,
      "GET",
      """ Users""",
      this.prefix + """DealItSrv/users"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_getUserByID6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getUserByID6_invoker = createInvoker(
    Application_1.getUserByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserByID",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_addUser7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users")))
  )
  private[this] lazy val controllers_Application_addUser7_invoker = createInvoker(
    Application_1.addUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/users"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_updateUser8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users")))
  )
  private[this] lazy val controllers_Application_updateUser8_invoker = createInvoker(
    Application_1.updateUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUser",
      Nil,
      "PUT",
      """""",
      this.prefix + """DealItSrv/users"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_deleteUserByID9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUserByID9_invoker = createInvoker(
    Application_1.deleteUserByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteUserByID",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """DealItSrv/users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_getItems10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_getItems10_invoker = createInvoker(
    Application_1.getItems,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getItems",
      Nil,
      "GET",
      """ Items""",
      this.prefix + """DealItSrv/items"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_getItemByID11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getItemByID11_invoker = createInvoker(
    Application_1.getItemByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getItemByID",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/items/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_addItem12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_addItem12_invoker = createInvoker(
    Application_1.addItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addItem",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/items"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_updateItem13_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items")))
  )
  private[this] lazy val controllers_Application_updateItem13_invoker = createInvoker(
    Application_1.updateItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateItem",
      Nil,
      "PUT",
      """""",
      this.prefix + """DealItSrv/items"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_deleteItemByID14_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteItemByID14_invoker = createInvoker(
    Application_1.deleteItemByID(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteItemByID",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """DealItSrv/items/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_at15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_at16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular.js")))
  )
  private[this] lazy val controllers_Assets_at16_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Javascripts routes""",
      this.prefix + """angular.js"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-route.js")))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-route.js"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Assets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main.js")))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """main.js"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Assets_at19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-aria.js")))
  )
  private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-aria.js"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Assets_at20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material.js")))
  )
  private[this] lazy val controllers_Assets_at20_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-material.js"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Assets_at21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-animate.js")))
  )
  private[this] lazy val controllers_Assets_at21_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-animate.js"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Assets_at22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-messages.js")))
  )
  private[this] lazy val controllers_Assets_at22_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-messages.js"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Assets_at23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material-icons.js")))
  )
  private[this] lazy val controllers_Assets_at23_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-material-icons.js"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_at24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material.css")))
  )
  private[this] lazy val controllers_Assets_at24_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Stylesheet routes""",
      this.prefix + """angular-material.css"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Assets_at25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home.html")))
  )
  private[this] lazy val controllers_Assets_at25_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """home.html"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Assets_at26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about.html")))
  )
  private[this] lazy val controllers_Assets_at26_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """about.html"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Assets_at27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login.html")))
  )
  private[this] lazy val controllers_Assets_at27_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """login.html"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Assets_at28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/login")))
  )
  private[this] lazy val controllers_Assets_at28_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/login"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Assets_at29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/car")))
  )
  private[this] lazy val controllers_Assets_at29_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/car"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Assets_at30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/conversation")))
  )
  private[this] lazy val controllers_Assets_at30_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/conversation"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Assets_at31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/furniture")))
  )
  private[this] lazy val controllers_Assets_at31_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/furniture"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Assets_at32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/gray")))
  )
  private[this] lazy val controllers_Assets_at32_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/gray"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Assets_at33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/house")))
  )
  private[this] lazy val controllers_Assets_at33_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/house"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Assets_at34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/startup")))
  )
  private[this] lazy val controllers_Assets_at34_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/startup"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Assets_at35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/technology")))
  )
  private[this] lazy val controllers_Assets_at35_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/technology"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Assets_at36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/write")))
  )
  private[this] lazy val controllers_Assets_at36_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """images/write"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:11
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:14
    case controllers_Application_login2_route(params) =>
      call { 
        controllers_Application_login2_invoker.call(Application_1.login)
      }
  
    // @LINE:15
    case controllers_Application_logout3_route(params) =>
      call { 
        controllers_Application_logout3_invoker.call(Application_1.logout)
      }
  
    // @LINE:18
    case controllers_Application_signup4_route(params) =>
      call { 
        controllers_Application_signup4_invoker.call(Application_1.signup)
      }
  
    // @LINE:21
    case controllers_Application_getUsers5_route(params) =>
      call { 
        controllers_Application_getUsers5_invoker.call(Application_1.getUsers)
      }
  
    // @LINE:22
    case controllers_Application_getUserByID6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_getUserByID6_invoker.call(Application_1.getUserByID(id))
      }
  
    // @LINE:23
    case controllers_Application_addUser7_route(params) =>
      call { 
        controllers_Application_addUser7_invoker.call(Application_1.addUser)
      }
  
    // @LINE:24
    case controllers_Application_updateUser8_route(params) =>
      call { 
        controllers_Application_updateUser8_invoker.call(Application_1.updateUser)
      }
  
    // @LINE:25
    case controllers_Application_deleteUserByID9_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_deleteUserByID9_invoker.call(Application_1.deleteUserByID(id))
      }
  
    // @LINE:28
    case controllers_Application_getItems10_route(params) =>
      call { 
        controllers_Application_getItems10_invoker.call(Application_1.getItems)
      }
  
    // @LINE:29
    case controllers_Application_getItemByID11_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_getItemByID11_invoker.call(Application_1.getItemByID(id))
      }
  
    // @LINE:30
    case controllers_Application_addItem12_route(params) =>
      call { 
        controllers_Application_addItem12_invoker.call(Application_1.addItem)
      }
  
    // @LINE:31
    case controllers_Application_updateItem13_route(params) =>
      call { 
        controllers_Application_updateItem13_invoker.call(Application_1.updateItem)
      }
  
    // @LINE:32
    case controllers_Application_deleteItemByID14_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_deleteItemByID14_invoker.call(Application_1.deleteItemByID(id))
      }
  
    // @LINE:35
    case controllers_Assets_at15_route(params) =>
      call(Param[String]("path", Right("/public/html/")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at15_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:38
    case controllers_Assets_at16_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular")), Param[String]("file", Right("angular.js"))) { (path, file) =>
        controllers_Assets_at16_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:39
    case controllers_Assets_at17_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-route")), Param[String]("file", Right("angular-route.js"))) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:40
    case controllers_Assets_at18_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/")), Param[String]("file", Right("main.js"))) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:41
    case controllers_Assets_at19_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-aria")), Param[String]("file", Right("angular-aria.js"))) { (path, file) =>
        controllers_Assets_at19_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:42
    case controllers_Assets_at20_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material")), Param[String]("file", Right("angular-material.js"))) { (path, file) =>
        controllers_Assets_at20_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:43
    case controllers_Assets_at21_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-animate")), Param[String]("file", Right("angular-animate.js"))) { (path, file) =>
        controllers_Assets_at21_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:44
    case controllers_Assets_at22_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-messages")), Param[String]("file", Right("angular-messages.js"))) { (path, file) =>
        controllers_Assets_at22_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:45
    case controllers_Assets_at23_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material-icons")), Param[String]("file", Right("angular-material-icons.js"))) { (path, file) =>
        controllers_Assets_at23_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:48
    case controllers_Assets_at24_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material")), Param[String]("file", Right("angular-material.css"))) { (path, file) =>
        controllers_Assets_at24_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:53
    case controllers_Assets_at25_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("home.html"))) { (path, file) =>
        controllers_Assets_at25_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:54
    case controllers_Assets_at26_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("about.html"))) { (path, file) =>
        controllers_Assets_at26_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:55
    case controllers_Assets_at27_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("login.html"))) { (path, file) =>
        controllers_Assets_at27_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:59
    case controllers_Assets_at28_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("login.jpg"))) { (path, file) =>
        controllers_Assets_at28_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:60
    case controllers_Assets_at29_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("car.jpg"))) { (path, file) =>
        controllers_Assets_at29_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:61
    case controllers_Assets_at30_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("conversation.jpeg"))) { (path, file) =>
        controllers_Assets_at30_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:62
    case controllers_Assets_at31_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("furniture.jpeg"))) { (path, file) =>
        controllers_Assets_at31_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:63
    case controllers_Assets_at32_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("gray.jpg"))) { (path, file) =>
        controllers_Assets_at32_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:64
    case controllers_Assets_at33_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("house.jpeg"))) { (path, file) =>
        controllers_Assets_at33_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:65
    case controllers_Assets_at34_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("startup.jpg"))) { (path, file) =>
        controllers_Assets_at34_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:66
    case controllers_Assets_at35_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("technology.jpeg"))) { (path, file) =>
        controllers_Assets_at35_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:67
    case controllers_Assets_at36_route(params) =>
      call(Param[String]("path", Right("/public/images")), Param[String]("file", Right("write.jpg"))) { (path, file) =>
        controllers_Assets_at36_invoker.call(Assets_0.at(path, file))
      }
  }
}
