
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kevin/Documents/DataBase/DealItSrv/conf/routes
// @DATE:Sun Dec 11 13:56:43 AST 2016

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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/logout""", """controllers.Application.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/submit/""" + "$" + """password<[^/]+>/""" + "$" + """username<[^/]+>""", """controllers.Application.loginUser(password:String, username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/signup2""", """controllers.Application.createUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/createAccount""", """controllers.Application.createAccount"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/createCred""", """controllers.Application.createCred"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/createPhone""", """controllers.Application.createPhone"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/createCreditCard""", """controllers.Application.createCreditCard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/user/""" + "$" + """aid<[^/]+>""", """controllers.Application.getUserInfo(aid:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/user/phone/""" + "$" + """uid<[^/]+>""", """controllers.Application.getPhoneNumbers(uid:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/user/creditcard/""" + "$" + """aid<[^/]+>""", """controllers.Application.getCreditCard(aid:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/user/products/""" + "$" + """aid<[^/]+>""", """controllers.Application.getProductsFromUser(aid:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateCreditCard""", """controllers.Application.updateCreditCard"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatePhoneNumber""", """controllers.Application.updatePhoneNumber"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserInfo""", """controllers.Application.updateUserInfo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/order/""" + "$" + """aid<[^/]+>""", """controllers.Application.getOrdersFromAccount(aid:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/order/content""", """controllers.Application.getOrderContent"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertOrder""", """controllers.Application.insertOrder"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertOrderLine""", """controllers.Application.insertOrderLine"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/items/""" + "$" + """id<[^/]+>""", """controllers.Application.getItemByID(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/itemsByCat/""" + "$" + """category<[^/]+>""", """controllers.Application.getItemsPerCategory(category:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/product/ownerinfo/""" + "$" + """pid<[^/]+>""", """controllers.Application.getProductOwnerInfo(pid:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/product/feedback/""" + "$" + """pid<[^/]+>""", """controllers.Application.getFeedbackFromProduct(pid:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/product/info/""" + "$" + """pid<[^/]+>""", """controllers.Application.getProductInfo(pid:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/filter/""" + "$" + """filter<[^/]+>/""" + "$" + """category<[^/]+>""", """controllers.Application.filterResults(filter:String, category:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/newPost""", """controllers.Application.insertNewPost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DealItSrv/categories""", """controllers.Application.getCategoryName"""),
    ("""GET""", this.prefix, """controllers.Assets.at(path:String = "/public/html/", file:String = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular", file:String = "angular.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-route.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-route", file:String = "angular-route.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main.js""", """controllers.Assets.at(path:String = "/public/javascripts/", file:String = "main.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-aria.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-aria", file:String = "angular-aria.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material", file:String = "angular-material.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-animate.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-animate", file:String = "angular-animate.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-messages.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-messages", file:String = "angular-messages.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material-icons.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material-icons", file:String = "angular-material-icons.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-grid.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-ui-grid", file:String = "ui-grid.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-local-storage.js""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-local-storage/src", file:String = "angular-local-storage.js")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angular-material.css""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-material", file:String = "angular-material.css")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-grid.css""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-ui-grid", file:String = "ui-grid.css")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-grid.woff""", """controllers.Assets.at(path:String = "/public/javascripts/node_modules/angular-ui-grid", file:String = "ui-grid.woff")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "home.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "about.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "login.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cars.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "cars.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """house.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "house.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "technology.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """furniture.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "furniture.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "profile.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "item.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPost.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "addPost.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "cart.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "checkout.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order_success.html""", """controllers.Assets.at(path:String = "/public/html/templates", file:String = "order_success.html")"""),
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
  private[this] lazy val controllers_Application_logout2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/logout")))
  )
  private[this] lazy val controllers_Application_logout2_invoker = createInvoker(
    Application_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "POST",
      """ Login / Logout""",
      this.prefix + """DealItSrv/logout"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_loginUser3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/submit/"), DynamicPart("password", """[^/]+""",true), StaticPart("/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_loginUser3_invoker = createInvoker(
    Application_1.loginUser(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "loginUser",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """login/submit/""" + "$" + """password<[^/]+>/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_createUser4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/signup2")))
  )
  private[this] lazy val controllers_Application_createUser4_invoker = createInvoker(
    Application_1.createUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createUser",
      Nil,
      "POST",
      """Sign Up""",
      this.prefix + """login/signup2"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_createAccount5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/createAccount")))
  )
  private[this] lazy val controllers_Application_createAccount5_invoker = createInvoker(
    Application_1.createAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """login/createAccount"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_createCred6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/createCred")))
  )
  private[this] lazy val controllers_Application_createCred6_invoker = createInvoker(
    Application_1.createCred,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createCred",
      Nil,
      "POST",
      """""",
      this.prefix + """login/createCred"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_createPhone7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/createPhone")))
  )
  private[this] lazy val controllers_Application_createPhone7_invoker = createInvoker(
    Application_1.createPhone,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createPhone",
      Nil,
      "POST",
      """""",
      this.prefix + """login/createPhone"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_createCreditCard8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/createCreditCard")))
  )
  private[this] lazy val controllers_Application_createCreditCard8_invoker = createInvoker(
    Application_1.createCreditCard,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createCreditCard",
      Nil,
      "POST",
      """""",
      this.prefix + """login/createCreditCard"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_getUserInfo9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/user/"), DynamicPart("aid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getUserInfo9_invoker = createInvoker(
    Application_1.getUserInfo(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserInfo",
      Seq(classOf[Integer]),
      "GET",
      """ Users""",
      this.prefix + """DealItSrv/user/""" + "$" + """aid<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_getPhoneNumbers10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/user/phone/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getPhoneNumbers10_invoker = createInvoker(
    Application_1.getPhoneNumbers(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPhoneNumbers",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/user/phone/""" + "$" + """uid<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_getCreditCard11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/user/creditcard/"), DynamicPart("aid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getCreditCard11_invoker = createInvoker(
    Application_1.getCreditCard(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getCreditCard",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/user/creditcard/""" + "$" + """aid<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_getProductsFromUser12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/user/products/"), DynamicPart("aid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getProductsFromUser12_invoker = createInvoker(
    Application_1.getProductsFromUser(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProductsFromUser",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/user/products/""" + "$" + """aid<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_updateCreditCard13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateCreditCard")))
  )
  private[this] lazy val controllers_Application_updateCreditCard13_invoker = createInvoker(
    Application_1.updateCreditCard,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateCreditCard",
      Nil,
      "POST",
      """""",
      this.prefix + """updateCreditCard"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_updatePhoneNumber14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatePhoneNumber")))
  )
  private[this] lazy val controllers_Application_updatePhoneNumber14_invoker = createInvoker(
    Application_1.updatePhoneNumber,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updatePhoneNumber",
      Nil,
      "POST",
      """""",
      this.prefix + """updatePhoneNumber"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_updateUserInfo15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserInfo")))
  )
  private[this] lazy val controllers_Application_updateUserInfo15_invoker = createInvoker(
    Application_1.updateUserInfo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUserInfo",
      Nil,
      "POST",
      """""",
      this.prefix + """updateUserInfo"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_getOrdersFromAccount16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/order/"), DynamicPart("aid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getOrdersFromAccount16_invoker = createInvoker(
    Application_1.getOrdersFromAccount(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getOrdersFromAccount",
      Seq(classOf[Integer]),
      "GET",
      """Orders""",
      this.prefix + """DealItSrv/order/""" + "$" + """aid<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_getOrderContent17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/order/content")))
  )
  private[this] lazy val controllers_Application_getOrderContent17_invoker = createInvoker(
    Application_1.getOrderContent,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getOrderContent",
      Nil,
      "POST",
      """""",
      this.prefix + """DealItSrv/order/content"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_insertOrder18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertOrder")))
  )
  private[this] lazy val controllers_Application_insertOrder18_invoker = createInvoker(
    Application_1.insertOrder,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "insertOrder",
      Nil,
      "POST",
      """""",
      this.prefix + """insertOrder"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_insertOrderLine19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertOrderLine")))
  )
  private[this] lazy val controllers_Application_insertOrderLine19_invoker = createInvoker(
    Application_1.insertOrderLine,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "insertOrderLine",
      Nil,
      "POST",
      """""",
      this.prefix + """insertOrderLine"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Application_getItemByID20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getItemByID20_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_Application_getItemsPerCategory21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/itemsByCat/"), DynamicPart("category", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getItemsPerCategory21_invoker = createInvoker(
    Application_1.getItemsPerCategory(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getItemsPerCategory",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """DealItSrv/itemsByCat/""" + "$" + """category<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Application_getProductOwnerInfo22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/product/ownerinfo/"), DynamicPart("pid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getProductOwnerInfo22_invoker = createInvoker(
    Application_1.getProductOwnerInfo(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProductOwnerInfo",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/product/ownerinfo/""" + "$" + """pid<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Application_getFeedbackFromProduct23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/product/feedback/"), DynamicPart("pid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getFeedbackFromProduct23_invoker = createInvoker(
    Application_1.getFeedbackFromProduct(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getFeedbackFromProduct",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/product/feedback/""" + "$" + """pid<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Application_getProductInfo24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/product/info/"), DynamicPart("pid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getProductInfo24_invoker = createInvoker(
    Application_1.getProductInfo(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProductInfo",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """DealItSrv/product/info/""" + "$" + """pid<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Application_filterResults25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/filter/"), DynamicPart("filter", """[^/]+""",true), StaticPart("/"), DynamicPart("category", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_filterResults25_invoker = createInvoker(
    Application_1.filterResults(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "filterResults",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """DealItSrv/filter/""" + "$" + """filter<[^/]+>/""" + "$" + """category<[^/]+>"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Application_insertNewPost26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/newPost")))
  )
  private[this] lazy val controllers_Application_insertNewPost26_invoker = createInvoker(
    Application_1.insertNewPost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "insertNewPost",
      Nil,
      "POST",
      """ Insert new data""",
      this.prefix + """DealItSrv/newPost"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Application_getCategoryName27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DealItSrv/categories")))
  )
  private[this] lazy val controllers_Application_getCategoryName27_invoker = createInvoker(
    Application_1.getCategoryName,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getCategoryName",
      Nil,
      "GET",
      """ Get Info""",
      this.prefix + """DealItSrv/categories"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Assets_at28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at28_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_Assets_at29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular.js")))
  )
  private[this] lazy val controllers_Assets_at29_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_Assets_at30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-route.js")))
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
      this.prefix + """angular-route.js"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Assets_at31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main.js")))
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
      this.prefix + """main.js"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Assets_at32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-aria.js")))
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
      this.prefix + """angular-aria.js"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Assets_at33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material.js")))
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
      this.prefix + """angular-material.js"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Assets_at34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-animate.js")))
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
      this.prefix + """angular-animate.js"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Assets_at35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-messages.js")))
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
      this.prefix + """angular-messages.js"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Assets_at36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material-icons.js")))
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
      this.prefix + """angular-material-icons.js"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Assets_at37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-grid.js")))
  )
  private[this] lazy val controllers_Assets_at37_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """ui-grid.js"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Assets_at38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-local-storage.js")))
  )
  private[this] lazy val controllers_Assets_at38_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """angular-local-storage.js"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_Assets_at39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angular-material.css")))
  )
  private[this] lazy val controllers_Assets_at39_invoker = createInvoker(
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

  // @LINE:71
  private[this] lazy val controllers_Assets_at40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-grid.css")))
  )
  private[this] lazy val controllers_Assets_at40_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """ui-grid.css"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Assets_at41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-grid.woff")))
  )
  private[this] lazy val controllers_Assets_at41_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """ui-grid.woff"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_Assets_at42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home.html")))
  )
  private[this] lazy val controllers_Assets_at42_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """Templates""",
      this.prefix + """home.html"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_Assets_at43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about.html")))
  )
  private[this] lazy val controllers_Assets_at43_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_Assets_at44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login.html")))
  )
  private[this] lazy val controllers_Assets_at44_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_Assets_at45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cars.html")))
  )
  private[this] lazy val controllers_Assets_at45_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """cars.html"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_Assets_at46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("house.html")))
  )
  private[this] lazy val controllers_Assets_at46_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """house.html"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_Assets_at47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology.html")))
  )
  private[this] lazy val controllers_Assets_at47_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """technology.html"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_Assets_at48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("furniture.html")))
  )
  private[this] lazy val controllers_Assets_at48_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """furniture.html"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_Assets_at49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile.html")))
  )
  private[this] lazy val controllers_Assets_at49_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """profile.html"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_Assets_at50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item.html")))
  )
  private[this] lazy val controllers_Assets_at50_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """item.html"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_Assets_at51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPost.html")))
  )
  private[this] lazy val controllers_Assets_at51_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """addPost.html"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_Assets_at52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart.html")))
  )
  private[this] lazy val controllers_Assets_at52_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """cart.html"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_Assets_at53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout.html")))
  )
  private[this] lazy val controllers_Assets_at53_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """checkout.html"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_Assets_at54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order_success.html")))
  )
  private[this] lazy val controllers_Assets_at54_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """order_success.html"""
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
    case controllers_Application_logout2_route(params) =>
      call { 
        controllers_Application_logout2_invoker.call(Application_1.logout)
      }
  
    // @LINE:15
    case controllers_Application_loginUser3_route(params) =>
      call(params.fromPath[String]("password", None), params.fromPath[String]("username", None)) { (password, username) =>
        controllers_Application_loginUser3_invoker.call(Application_1.loginUser(password, username))
      }
  
    // @LINE:18
    case controllers_Application_createUser4_route(params) =>
      call { 
        controllers_Application_createUser4_invoker.call(Application_1.createUser)
      }
  
    // @LINE:19
    case controllers_Application_createAccount5_route(params) =>
      call { 
        controllers_Application_createAccount5_invoker.call(Application_1.createAccount)
      }
  
    // @LINE:20
    case controllers_Application_createCred6_route(params) =>
      call { 
        controllers_Application_createCred6_invoker.call(Application_1.createCred)
      }
  
    // @LINE:21
    case controllers_Application_createPhone7_route(params) =>
      call { 
        controllers_Application_createPhone7_invoker.call(Application_1.createPhone)
      }
  
    // @LINE:22
    case controllers_Application_createCreditCard8_route(params) =>
      call { 
        controllers_Application_createCreditCard8_invoker.call(Application_1.createCreditCard)
      }
  
    // @LINE:25
    case controllers_Application_getUserInfo9_route(params) =>
      call(params.fromPath[Integer]("aid", None)) { (aid) =>
        controllers_Application_getUserInfo9_invoker.call(Application_1.getUserInfo(aid))
      }
  
    // @LINE:26
    case controllers_Application_getPhoneNumbers10_route(params) =>
      call(params.fromPath[Integer]("uid", None)) { (uid) =>
        controllers_Application_getPhoneNumbers10_invoker.call(Application_1.getPhoneNumbers(uid))
      }
  
    // @LINE:27
    case controllers_Application_getCreditCard11_route(params) =>
      call(params.fromPath[Integer]("aid", None)) { (aid) =>
        controllers_Application_getCreditCard11_invoker.call(Application_1.getCreditCard(aid))
      }
  
    // @LINE:28
    case controllers_Application_getProductsFromUser12_route(params) =>
      call(params.fromPath[Integer]("aid", None)) { (aid) =>
        controllers_Application_getProductsFromUser12_invoker.call(Application_1.getProductsFromUser(aid))
      }
  
    // @LINE:29
    case controllers_Application_updateCreditCard13_route(params) =>
      call { 
        controllers_Application_updateCreditCard13_invoker.call(Application_1.updateCreditCard)
      }
  
    // @LINE:30
    case controllers_Application_updatePhoneNumber14_route(params) =>
      call { 
        controllers_Application_updatePhoneNumber14_invoker.call(Application_1.updatePhoneNumber)
      }
  
    // @LINE:31
    case controllers_Application_updateUserInfo15_route(params) =>
      call { 
        controllers_Application_updateUserInfo15_invoker.call(Application_1.updateUserInfo)
      }
  
    // @LINE:35
    case controllers_Application_getOrdersFromAccount16_route(params) =>
      call(params.fromPath[Integer]("aid", None)) { (aid) =>
        controllers_Application_getOrdersFromAccount16_invoker.call(Application_1.getOrdersFromAccount(aid))
      }
  
    // @LINE:36
    case controllers_Application_getOrderContent17_route(params) =>
      call { 
        controllers_Application_getOrderContent17_invoker.call(Application_1.getOrderContent)
      }
  
    // @LINE:37
    case controllers_Application_insertOrder18_route(params) =>
      call { 
        controllers_Application_insertOrder18_invoker.call(Application_1.insertOrder)
      }
  
    // @LINE:38
    case controllers_Application_insertOrderLine19_route(params) =>
      call { 
        controllers_Application_insertOrderLine19_invoker.call(Application_1.insertOrderLine)
      }
  
    // @LINE:41
    case controllers_Application_getItemByID20_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Application_getItemByID20_invoker.call(Application_1.getItemByID(id))
      }
  
    // @LINE:42
    case controllers_Application_getItemsPerCategory21_route(params) =>
      call(params.fromPath[String]("category", None)) { (category) =>
        controllers_Application_getItemsPerCategory21_invoker.call(Application_1.getItemsPerCategory(category))
      }
  
    // @LINE:43
    case controllers_Application_getProductOwnerInfo22_route(params) =>
      call(params.fromPath[Integer]("pid", None)) { (pid) =>
        controllers_Application_getProductOwnerInfo22_invoker.call(Application_1.getProductOwnerInfo(pid))
      }
  
    // @LINE:44
    case controllers_Application_getFeedbackFromProduct23_route(params) =>
      call(params.fromPath[Integer]("pid", None)) { (pid) =>
        controllers_Application_getFeedbackFromProduct23_invoker.call(Application_1.getFeedbackFromProduct(pid))
      }
  
    // @LINE:45
    case controllers_Application_getProductInfo24_route(params) =>
      call(params.fromPath[Integer]("pid", None)) { (pid) =>
        controllers_Application_getProductInfo24_invoker.call(Application_1.getProductInfo(pid))
      }
  
    // @LINE:46
    case controllers_Application_filterResults25_route(params) =>
      call(params.fromPath[String]("filter", None), params.fromPath[String]("category", None)) { (filter, category) =>
        controllers_Application_filterResults25_invoker.call(Application_1.filterResults(filter, category))
      }
  
    // @LINE:49
    case controllers_Application_insertNewPost26_route(params) =>
      call { 
        controllers_Application_insertNewPost26_invoker.call(Application_1.insertNewPost)
      }
  
    // @LINE:52
    case controllers_Application_getCategoryName27_route(params) =>
      call { 
        controllers_Application_getCategoryName27_invoker.call(Application_1.getCategoryName)
      }
  
    // @LINE:55
    case controllers_Assets_at28_route(params) =>
      call(Param[String]("path", Right("/public/html/")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at28_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:58
    case controllers_Assets_at29_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular")), Param[String]("file", Right("angular.js"))) { (path, file) =>
        controllers_Assets_at29_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:59
    case controllers_Assets_at30_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-route")), Param[String]("file", Right("angular-route.js"))) { (path, file) =>
        controllers_Assets_at30_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:60
    case controllers_Assets_at31_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/")), Param[String]("file", Right("main.js"))) { (path, file) =>
        controllers_Assets_at31_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:61
    case controllers_Assets_at32_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-aria")), Param[String]("file", Right("angular-aria.js"))) { (path, file) =>
        controllers_Assets_at32_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:62
    case controllers_Assets_at33_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material")), Param[String]("file", Right("angular-material.js"))) { (path, file) =>
        controllers_Assets_at33_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:63
    case controllers_Assets_at34_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-animate")), Param[String]("file", Right("angular-animate.js"))) { (path, file) =>
        controllers_Assets_at34_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:64
    case controllers_Assets_at35_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-messages")), Param[String]("file", Right("angular-messages.js"))) { (path, file) =>
        controllers_Assets_at35_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:65
    case controllers_Assets_at36_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material-icons")), Param[String]("file", Right("angular-material-icons.js"))) { (path, file) =>
        controllers_Assets_at36_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:66
    case controllers_Assets_at37_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-ui-grid")), Param[String]("file", Right("ui-grid.js"))) { (path, file) =>
        controllers_Assets_at37_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:67
    case controllers_Assets_at38_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-local-storage/src")), Param[String]("file", Right("angular-local-storage.js"))) { (path, file) =>
        controllers_Assets_at38_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:70
    case controllers_Assets_at39_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-material")), Param[String]("file", Right("angular-material.css"))) { (path, file) =>
        controllers_Assets_at39_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:71
    case controllers_Assets_at40_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-ui-grid")), Param[String]("file", Right("ui-grid.css"))) { (path, file) =>
        controllers_Assets_at40_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:72
    case controllers_Assets_at41_route(params) =>
      call(Param[String]("path", Right("/public/javascripts/node_modules/angular-ui-grid")), Param[String]("file", Right("ui-grid.woff"))) { (path, file) =>
        controllers_Assets_at41_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:75
    case controllers_Assets_at42_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("home.html"))) { (path, file) =>
        controllers_Assets_at42_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:76
    case controllers_Assets_at43_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("about.html"))) { (path, file) =>
        controllers_Assets_at43_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:77
    case controllers_Assets_at44_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("login.html"))) { (path, file) =>
        controllers_Assets_at44_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:78
    case controllers_Assets_at45_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("cars.html"))) { (path, file) =>
        controllers_Assets_at45_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:79
    case controllers_Assets_at46_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("house.html"))) { (path, file) =>
        controllers_Assets_at46_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:80
    case controllers_Assets_at47_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("technology.html"))) { (path, file) =>
        controllers_Assets_at47_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:81
    case controllers_Assets_at48_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("furniture.html"))) { (path, file) =>
        controllers_Assets_at48_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:82
    case controllers_Assets_at49_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("profile.html"))) { (path, file) =>
        controllers_Assets_at49_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:83
    case controllers_Assets_at50_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("item.html"))) { (path, file) =>
        controllers_Assets_at50_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:84
    case controllers_Assets_at51_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("addPost.html"))) { (path, file) =>
        controllers_Assets_at51_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:85
    case controllers_Assets_at52_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("cart.html"))) { (path, file) =>
        controllers_Assets_at52_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:86
    case controllers_Assets_at53_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("checkout.html"))) { (path, file) =>
        controllers_Assets_at53_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:87
    case controllers_Assets_at54_route(params) =>
      call(Param[String]("path", Right("/public/html/templates")), Param[String]("file", Right("order_success.html"))) { (path, file) =>
        controllers_Assets_at54_invoker.call(Assets_0.at(path, file))
      }
  }
}
