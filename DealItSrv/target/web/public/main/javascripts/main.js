var app= angular.module('myapp',["ngRoute","ngMaterial","ngMdIcons","ui.grid","ui.grid.selection","LocalStorageModule"]);

    app.service('SharedVariables', function(){
        var itemID = 0;
        var userAID = 0;
        var itemName, itemPrice;
        var shoppingCartID = [];
        var logged = false;
        var orderID ="";
        return {
            getUserAID: function getUserAID() {
                return userAID;
            },
            setUserAID: function setUserAID(value) {
                userAID = value;
            },
            getItemID: function getItemID() {
                return itemID;
            },
            setItemID: function setItemID(value) {
                itemID = value;
            },
            addToShoppingCart: function(id){
                shoppingCartID.push(id);
            },
            removeFromShoppingCart: function(id){
                var itr = shoppingCartID.indexOf(id);
                shoppingCartID.splice(itr,1);
            },
            getShoppingCart: function(){
                return shoppingCartID;
            },
            cleanShoppingCart: function(){
                shoppingCartID = [];
            },
            isInShoppingCart: function(id){
                var itr = shoppingCartID.indexOf(id);
                return itr != -1;
            },
            getOrderNum: function(){
                return orderID;
            },
            setOrderNum: function(id){
                orderID=id;
            }
        };
    });
    
    
    
    // routing configuration
    app.config(function($routeProvider){
        $routeProvider
        .when("/",{
            templateUrl: "home.html",  //set the template that is going to be used by that view
            controller: "homeController"  //set the controller that is going to be used by that view
        })
        .when("/about", {
            templateUrl: "about.html",
            controller: "aboutController"
        })
        .when("/login", {
            templateUrl: "login.html",
            controller: "loginController"
        })
        .when("/cars", {
            templateUrl: "cars.html",
            controller: "carController"
        })
        .when("/house", {
            templateUrl: "house.html",
            controller: "houseController"
        })
        .when("/technology", {
            templateUrl: "technology.html",
            controller: "technologyController"
        })
        .when("/furniture", {
            templateUrl: "furniture.html",
            controller: "furnitureController"
        })
        .when("/profile", {
            templateUrl: "profile.html",
            controller: "profileController"
        })
        .when("/item/:pid",{
            templateUrl: "item.html",
            controller: "itemController"
        })
        .when("/addPost", {
            templateUrl: "addPost.html",
            controller: "addPostController"
        })
        .when("/cart", {
            templateUrl: "cart.html",
            controller: "cartController"
        })
        .when("/checkout",{
            templateUrl: "checkout.html",
            controller: "checkoutController"
        })
        .when("/order_success",{
            templateUrl: "order_success.html",
            controller: "orderSuccessController"
        });
    });


    //configuration local storage
    app.config(['localStorageServiceProvider', function(localStorageServiceProvider){

         localStorageServiceProvider.setPrefix('dealit');


    }]);


    // configuring theming
    app.config(function($mdThemingProvider) {
        $mdThemingProvider.theme('default')
            .primaryPalette('amber')
            .accentPalette('red');

        $mdThemingProvider.theme('altTheme')
            .primaryPalette('blue-grey')
            .accentPalette('amber');
    });

    //Main controller
    app.controller('mainController',['$scope','$http','$location','$mdSidenav','localStorageService',function($scope,$http,$location,$mdSidenav,localStorageService){
        var currentPath = $location.path();
        //check if user is Log
        islogged();


        function islogged(){
           var aid = localStorageService.get('aid');
           if(aid != null){
               $scope.log = true;
           }
           else{
               $scope.log = false;
           }
        }

        $scope.toggleLeft = buildToggler('left');
        $scope.toggleRight = buildToggler('right');

        $http.get(currentPath+"/DealItSrv")
              .then(function(response){   

			});

        function buildToggler(componentId) {
            return function() {
                $mdSidenav(componentId).toggle();
            }
        }

        //Navegation configuration (All this functions just change the url in which you are current located)

        $scope.logout = function(){
            firebase.auth().signOut().then(function() {
              // Sign-out successful.
            }, function(error) {
              // An error happened.
            });
           localStorageService.set('aid', null);
           islogged();
           $location.path('/');
        };
        $scope.navHome= function(){
            $location.path('/');  //The parameter is the path to which you want to change
        };

        $scope.navAbout= function(){

            $location.path('/about');
        };

        $scope.logNav = function(){

            $location.path('/login');
        };

        $scope.navCar = function(){
            $location.path('/cars');
        };

        $scope.navHouse = function(){
            $location.path('/house');
        };

        $scope.navTechnology = function(){
            $location.path('/technology');
        };

        $scope.navFurniture = function(){
            $location.path('/furniture');
        };

        $scope.navProfile = function(){
            $location.path('/profile');
        };

         $scope.navPost = function(){
            $location.path('/addPost');
        };

        $scope.navItem = function(){
            $location.path('/item');
        };

        $scope.shoppingCart = function(){
            $location.path('/cart');
        };
    }]);

    //Home controller (Home Page)
    app.controller('homeController',['$scope','$http', '$location','localStorageService','$window', function($scope,$http, $location, localStorageService,$window){

        if(localStorageService.get('status') != null){
           localStorageService.set('status', null);
           $window.location.reload();
        }

        $scope.marketing="What's better than having a tool that makes easy advertise your items."
                        +" What are you waiting for? Join our family today!";

        $scope.capabilities=[
            'Sale/Buy or Trade Cars',
            'Sale/Buy Houses',
            'Sale/Buy or Trade technology items',
            'Sale/Buy Furniture'
        ]

        // Navegation inside home view
        $scope.learnMore= function(){
            $location.path('/about');
        }
        $scope.joinUs= function(){
            $location.path('/login');
        }

        $scope.navCar = function(){
            $location.path('/cars');
        };

        $scope.navHouse = function(){
            $location.path('/house');
        };

        $scope.navTechnology = function(){
            $location.path('/technology');
        };

        $scope.navFurniture = function(){
            $location.path('/furniture');
        };


    }]);


    //About page controller
    app.controller('aboutController',['$scope','localStorageService', function($scope,localStorageService){
    $scope.aboutUs="We are a group of students looking to contribute with innovating ideas.We live on a society that depends on  science and technology. As technology advance  our goal is making things easier."
                  +" Things like cars, houses, and clothes advertisement are now performed online.";

    $scope.clients="DealIt is a web application that offers a user friendly interface were can be placed sales/trades and special offers."
                  +" The sales/trade transactions could be anything such as: vehicles, houses, electronics, furniture, and miscellaneous.As mentioned before"
                  +" sales/trades could be anything, so this web application targets everyone willing to"
                  +" sale/buy/trade something that fits in one of the above categories.";
    }]);



    //Car Category Controller
    app.controller('carController', ['$scope','$http','$location','SharedVariables','localStorageService','$timeout',function($scope,$http,$location,SharedVariables,localStorageService, $timeout){
        var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.carCategory="This is the car category page";
        $scope.category="car";
        $scope.filterName="";

        $http.get(generalPath+"/DealItSrv/itemsByCat/"+$scope.category)
        .then(function(response){

			$scope.items=response.data;


        });

        $scope.viewDetails= function(index){
            var id = $scope.items[index].id;
            SharedVariables.setItemID(id);
            $location.path('/item/'+id);
        };

        $scope.filterResults= function(){

                     if($scope.filterName != null){
                           $http.get(generalPath+"/DealItSrv/filter/"+$scope.filterName+"/"+$scope.category)
                                    .then(function(response){
                                        $timeout(function(){
                                             $scope.items=response.data;
                                        });

                                    })
                     }
                 };


    }]);

    //House Category Controller
    app.controller('houseController', ['$scope','$http','$location','SharedVariables','localStorageService','$timeout', function($scope,$http,$location,SharedVariables,localStorageService, $timeout){
		var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.houseCategory="This is the house category page";
        $scope.category="house";
		$scope.filterName="";

        $http.get(generalPath+"/DealItSrv/itemsByCat/"+$scope.category)
        .then(function(response){

			$scope.items=response.data;


        });

         $scope.viewDetails= function(index){
                    var id = $scope.items[index].id;
                    SharedVariables.setItemID(id);
                    $location.path('/item/'+id);
                };

         $scope.filterResults= function(){

                      if($scope.filterName != null){
                            $http.get(generalPath+"/DealItSrv/filter/"+$scope.filterName+"/"+$scope.category)
                                     .then(function(response){
                                         $timeout(function(){
                                              $scope.items=response.data;
                                         });

                                     })
                      }
                  };
    }]);

    //Technology Category Controller
    app.controller('technologyController', ['$scope','$http','$location','SharedVariables','localStorageService','$timeout', function($scope,$http,$location,SharedVariables,localStorageService, $timeout){
		var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.technologyCategory="This is technology category page";
		$scope.category="technology";
        $scope.filterName="";

        $http.get(generalPath+"/DealItSrv/itemsByCat/"+$scope.category)
        .then(function(response){

			$scope.items=response.data;


        });

         $scope.viewDetails= function(index){
                    var id = $scope.items[index].id;
                    SharedVariables.setItemID(id);
                    $location.path('/item/'+id);
                };


         $scope.filterResults= function(){

                      if($scope.filterName != null){
                            $http.get(generalPath+"/DealItSrv/filter/"+$scope.filterName+"/"+$scope.category)
                                     .then(function(response){
                                         $timeout(function(){
                                              $scope.items=response.data;
                                         });

                                     })
                      }
                  };

		
    }]);

    //Furniture Category Controller
    app.controller('furnitureController', ['$scope','$http','$location','SharedVariables','localStorageService','$timeout', function($scope,$http,$location,SharedVariables,localStorageService,$timeout){
		var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.furnitureCategory="This is furniture category page";
        $scope.category="furniture";
		$scope.filterName="";

        $http.get(generalPath+"/DealItSrv/itemsByCat/"+$scope.category)
        .then(function(response){

			$scope.items=response.data;


        });

         $scope.viewDetails= function(index){
                    var id = $scope.items[index].id;
                    SharedVariables.setItemID(id);
                    $location.path('/item/'+id);
                };

         $scope.filterResults= function(){

             if($scope.filterName != null){
                   $http.get(generalPath+"/DealItSrv/filter/"+$scope.filterName+"/"+$scope.category)
                            .then(function(response){
                                $timeout(function(){
                                     $scope.items=response.data;
                                });

                            })
             }
         };
    }]);

    //Item Details controller
    app.controller('itemController', ['$scope','$http','$location', 'SharedVariables','$q','$timeout',
    '$routeParams','localStorageService' ,function($scope,$http,$location, SharedVariables,$q,$timeout,$routeParams,localStorageService ){
        var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.log= false;
        var pid = $routeParams.pid;

        if(localStorageService.get('aid') != null){
           $scope.log= true;
        }

        SharedVariables.setItemID(pid);
        $scope.inShoppingCart = false;

        if(SharedVariables.isInShoppingCart(SharedVariables.getItemID())){
            $scope.inShoppingCart = true;
        }

         $http.get(generalPath+"/DealItSrv/product/info/"+pid)
                 .then(function(response){

                     $timeout(function(){
                         //any code in here will automatically have an apply run afterwards
                          $scope.itemName = response.data.item;
                          $scope.itemDesc = response.data.description;
                          $scope.itemPrice = response.data.price;
                          $scope.image = response.data.image;
                          $scope.pid= response.data.id;
                          $scope.itemCond = response.data.condition;
                          $scope.itemBrand = response.data.brand;

                          $http.get(generalPath+"/DealItSrv/product/ownerinfo/"+$scope.pid)
                                 .then(function(response){

                                   $timeout(function(){

                                        $scope.email = response.data.email;
                                        $scope.firstName = response.data.firstName;
                                        $scope.lastName = response.data.lastName;
                                        $scope.city = response.data.city;
                                        $scope.state = response.data.state;
                                        $scope.uid= response.data.userID;


                                        $http.get(generalPath+"/DealItSrv/user/phone/"+$scope.uid)
                                               .then(function(response){
                                                    $timeout(function(){

                                                        $scope.phones=response.data;

                                                        $http.get(generalPath+"/DealItSrv/product/feedback/"+$scope.pid)
                                                               .then(function(response){
                                                                   $timeout(function(){
                                                                         ;
                                                                         $scope.feedback= response.data;

                                                                   });
                                                               });
                                                    });

                                               });
                                   });

                                 });
                     });

                 });

          $scope.addToShoppingCart = function(){
              SharedVariables.addToShoppingCart(SharedVariables.getItemID());
              alert("Item added to Shopping Cart");
              $scope.inShoppingCart = true;
          };

          $scope.removeFromShoppingCart = function(){
              SharedVariables.removeFromShoppingCart(SharedVariables.getItemID());
              alert("Item removed from Shopping Cart");
              $scope.inShoppingCart = false;
          };




    }]);

    //Shopping Cart controller
    app.controller('cartController', ['$scope','$http','$location' ,'SharedVariables','localStorageService','$timeout',
    function($scope,$http,$location, SharedVariables, localStorageService,$timeout){
       var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();


        $scope.total = 0;


        $scope.gridOptions1= {
            enableSorting: true,
            enableRowSelection: true,
            enableRowHeaderSelection: false,
            enableHorizontalScrollbar: 0,
            enableVerticalScrollbar: 0,
            columnDefs: [
                {field: 'item'},
               // {field: 'brand'},
               // {field: 'condition'},
                {field: 'price', cellFilter: 'currency'},
                {field: 'id'}
            ],
            onRegisterApi: function (gridApi) {
                $scope.grid1Api = gridApi;
                gridApi.selection.on.rowSelectionChanged($scope, function (row) {
                    var id = row.entity.id;
                    SharedVariables.setItemID(id);
                    $location.path('/item/'+id);
                });
                $scope.gridOptions1.columnDefs[2].visible = false;
            }
        };


        var shopCart = SharedVariables.getShoppingCart();
        var iData = [];
        for(var i = 0; i < shopCart.length ; i++){
            $http.get(generalPath+"/DealItSrv/items/" + shopCart[i])
                .then(function(response){
                    iData.push(response.data);
                    $scope.total += response.data.price;
                });
        }

        $scope.gridOptions1.data = iData;
        $scope.gridOptions1.columnDefs[0].enableHiding=false;
        $scope.gridOptions1.columnDefs[1].enableHiding=false;
        $scope.gridOptions1.columnDefs[2].enableHiding=false;

        $scope.goToCheckout = function() {
            if(shopCart.length == 0)
                alert("Your shopping cart is empty!");
            else
                $location.path('/checkout');
        };

    }]);

    //Checkout controller
    app.controller('checkoutController', ['$scope','$http','$location' ,
    'SharedVariables','localStorageService','$timeout',function($scope,$http,$location, SharedVariables,localStorageService,$timeout){
         var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
         var AID = localStorageService.get('aid');
         $scope.placeOrder = function(){
            $http.post(generalPath+"/insertOrder",{aid: AID})
                   .then(function(response){
                       $scope.oid = response.data;
                       for(var i=0;i< iData.length; i++){
                            var name = iData[i].item;
                            var ID = iData[i].id;

                           $timeout(function(){
                               $http.post(generalPath+"/insertOrderLine",{oid: $scope.oid, pid: ID,
                                pname: name})
                                         .then(function(response){
                                              if(i === iData.length){
                                                 SharedVariables.cleanShoppingCart();
                                                 SharedVariables.setOrderNum($scope.oid);
                                                 $location.path('/order_success');
                                              }

                                         });
                           });
                       }

                   });
         };

         $scope.total = 0;
        $scope.gridOptions1= {
            enableSorting: true,
            enableRowSelection: false,
            enableRowHeaderSelection: false,
            enableHorizontalScrollbar: 0,
            enableVerticalScrollbar: 0,
            columnDefs: [
                {field: 'item'},
                // {field: 'brand'},
                // {field: 'condition'},
                {field: 'price', cellFilter: 'currency'},
                {field: 'id'}
            ],
            onRegisterApi: function (gridApi) {
                $scope.grid1Api = gridApi;
                $scope.gridOptions1.columnDefs[2].visible = false;
            }
        };


        var shopCart = SharedVariables.getShoppingCart();
        var iData = [];
        for(var i = 0; i < shopCart.length ; i++){
            $http.get(generalPath+"/DealItSrv/items/" + shopCart[i])
                .then(function(response){
                    iData.push(response.data);
                    $scope.total += response.data.price;

                });
        }

        $scope.gridOptions1.data = iData;
        $scope.gridOptions1.columnDefs[0].enableHiding=false;
        $scope.gridOptions1.columnDefs[1].enableHiding=false;
        $scope.gridOptions1.columnDefs[2].enableHiding=false;


        //Fill Credit Card info

        $http.get(generalPath+"/DealItSrv/user/creditcard/"+AID)
                       .then(function(response){

                            $timeout(function(){
                               $scope.creditCard=response.data;
                            });

                       });

    }]);

    //Order Success controller
    app.controller('orderSuccessController', ['$scope','$http','$location' ,'SharedVariables','localStorageService',function($scope,$http,$location, SharedVariables,localStorageService){
     var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.ordernum= SharedVariables.getOrderNum();
        $scope.returnToHomePage = function(){
            SharedVariables.setOrderNum("");
            $location.path('/');
        };

    }]);

    //Profile Controller
    app.controller('profileController',['$scope','$http','$location','SharedVariables', '$timeout','localStorageService','$window',
     function($scope,$http,$location, SharedVariables, $timeout, localStorageService, $window){
        var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.edit=false;
        //var AID = SharedVariables.getUserAID();
        var AID = localStorageService.get('aid');
        $http.get(generalPath+"/DealItSrv/user/"+AID)
                .then(function(response){

                    $timeout(function(){
                        $scope.email = response.data.email;
                        $scope.name = response.data.firstName + " " + response.data.lastName;
                        $scope.ufirst = response.data.firstName;
                        $scope.ulast =response.data.lastName;
                        $scope.ucity = response.data.city;
                        $scope.ustate = response.data.state;
                        $scope.ubirth = response.data.birthDate;
                        var userid = response.data.userID;
                        $scope.uid = response.data.userID;
                        $http.get(generalPath+"/DealItSrv/user/phone/"+userid)
                        .then(function(response){
                            $scope.phones = response.data;
                            $scope.phone=$scope.phones[0];
                        });

                    });
                });

        $http.get(generalPath+"/DealItSrv/user/creditcard/"+AID)
                .then(function(response){

                     $timeout(function(){
                        $scope.cnumber = response.data.cardNumber;
                        $scope.ctype = response.data.type;
                        $scope.scode = response.data.securityCode;
                        $scope.baddress = response.data.baddress;
                        $scope.bzip = response.data.bzip;
                        $scope.country = response.data.country;
                        $scope.bstate = response.data.bstate;
                        $scope.bcity = response.data.bcity;
                        $scope.expdate= response.data.expDate;
                     });

                });

        //Get active items

        $http.get(generalPath+"/DealItSrv/user/products/"+AID)
                .then(function(response){
                    $timeout(function(){
                         $scope.activeItems= response.data

                    });
                });


        //Get past orders

        $http.get(generalPath+"/DealItSrv/order/"+AID)
                .then(function(response){
                     $timeout(function(){
                          $scope.orders= response.data;

                     });
                });

        $scope.editar = function(){
          $scope.edit = true;
        };

        $scope.save = function(isValid){
          if(isValid){

             $http.post(generalPath+"/updateCreditCard",
                {aid: AID, cnumber: $scope.cnumber, expDate: $scope.expdate, scode: $scope.scode,
                type: $scope.ctype, bzip: $scope.bzip, bcity: $scope.bcity, country: $scope.country,
                bstate: $scope.bstate, baddress: $scope.baddress})
                        .then(function(response){
                             $timeout(function(){
                                $http.post(generalPath+"/updatePhoneNumber",{phone: $scope.phone, uid: $scope.uid})
                                                        .then(function(response){

                                                            $timeout(function(){
                                                                $http.post(generalPath+"/updateUserInfo",{email: $scope.email, ufirst: $scope.ufirst, ulast: $scope.ulast,
                                                                              ucity: $scope.ucity, ustate: $scope.ustate, ubirth: $scope.ubirth, uid: $scope.uid})
                                                                                        .then(function(response){
                                                                                           $window.location.reload();
                                                                                        });
                                                            });
                                                        });
                             });
                        });


          }
        };

        $scope.cancel= function(){
           $scope.edit=false;
        }

    }]);


    // Login , Sign up controller
    app.controller('loginController',['$scope','$http','$location', 'SharedVariables','localStorageService','$route','$timeout','$window',
    function($scope,$http,$location, SharedVariables, localStorageService, $route,$timeout,$window){




    // Controller Instances

     var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port()+$location.path(); //the current location is stored on this variable

     $scope.username="";
     $scope.password="";

     $scope.rePassword="";
     $scope.email="";
     $scope.ufirst="";
     $scope.ulast="";
     $scope.ubirth="";
     $scope.ucity="";
     $scope.ustate="";
     $scope.cnumber="";
     $scope.ctype="";
     $scope.scode="";
     $scope.expdate="";
     $scope.baddress="";
     $scope.country="";
     $scope.bstate="";
     $scope.bcity="";
     $scope.bzip="";
     $scope.phone="";


    $scope.errorFlag = {
        emptyEP: false,
        email: false,
        password: false,
        name: false,
        date: false
    };

    //===================== Functions ==============================================

    /*
     * Call to submit login credentials
    */
    $scope.login = function(){
        if(validateLogin()){
            $http.get(generalPath+"/submit/"+$scope.password+"/"+$scope.username)
                .then(function(response){
                    resetFlags();
				    resetFields();
				    if(response.data.valid){
                        SharedVariables.setUserAID(response.data.aid);
                        localStorageService.set('aid', response.data.aid);
                        localStorageService.set('status', 'cambio');
                        firebase.auth().signInWithEmailAndPassword("kevin.santiago1@upr.edu", "prueba").catch(function(error) {
                            // Handle Errors here.
                            var errorCode = error.code;
                            var errorMessage = error.message;
                            // ...
                        });
                        $location.path('/');
                    } else
                        alert(response.data.exeLog);
               });
        }
        else{
            alert("Login failure");
        }
    };




   
	$scope.signup2 = function(isValid){
         if(isValid && passwordIsSame()){

              $http.get(generalPath+"/checkUsernameInUse/"+$scope.username)
                        .then(function(response){
                         if(response.data === "true"){
                            $timeout(function(){
                               $http.post(generalPath+"/signup2",{email: $scope.email, ufirst: $scope.ufirst, ulast: $scope.ulast, ucity: $scope.ucity, ustate: $scope.ustate, ubirth: $scope.ubirth})
                                                 .then(function(response){
                                                       $scope.uid=response.data;
                                                      $timeout(function(){


                                                         $http.post(generalPath+"/createAccount",{uid: $scope.uid})
                                                               .then(function(response){
                                                                   $scope.aid= response.data;

                                                                   $timeout(function(){

                                                                       $http.post(generalPath+"/createCred", {aid: $scope.aid, username: $scope.username, password: $scope.password})
                                                                               .then(function(response){
                                                                                  $timeout(function(){
                                                                                       firebase.auth().createUserWithEmailAndPassword($scope.email, $scope.password).catch(function(error) {
                                                                                         // Handle Errors here.
                                                                                         var errorCode = error.code;
                                                                                         var errorMessage = error.message;
                                                                                         // ...
                                                                                         console.log(errorCode + " " + errorMessage);
                                                                                       });


                                                                                       $http.post(generalPath+"/createPhone",
                                                                                       {uid: $scope.uid, phone: $scope.phone})
                                                                                                   .then(function(response){
                                                                                                        $timeout(function(){
                                                                                                           $http.post(generalPath+"/createCreditCard",
                                                                                                               {aid: $scope.aid, cnumber: $scope.cnumber, expDate: $scope.expdate, scode: $scope.scode,
                                                                                                               type: $scope.ctype, bzip: $scope.bzip, bcity: $scope.bcity, country: $scope.country,
                                                                                                               bstate: $scope.bstate, baddress: $scope.baddress})
                                                                                                                       .then(function(response){
                                                                                                                          alert("Signup Successful!");
                                                                                                                          $window.location.reload();
                                                                                                                       });

                                                                                                        });
                                                                                                   });

                                                                                  });
                                                                               })


                                                                   })

                                                               });
                                                      });

                                                       var auth = firebase.auth();

                                                       auth.sendPasswordResetEmail($scope.email).then(function() {
                                                         // Email sent.
                                                       }, function(error) {
                                                         // An error happened.
                                                         console.log("error en enviar email");
                                                       });

                                                 });
                           });
                   }else{
                       alert("username is already taken!");
                   }
                });
         }else{
              alert("There is a problem with the form!");
         }
    };
   
    /*
     * Validates that the email field or the password field isn't empty
    */
    var validateLogin = function(){
        if ($scope.username === "" || $scope.password === ""){
            $scope.errorFlag.emptyEP= true;
            return false;
        }
        return true;
    };

    /*
     * Validates that the email entered is the same
    */
    var emailIsSame = function(){
        if ($scope.email != $scope.reEmail){
            $scope.errorFlag.email= true;
            return false;
        }
        return true;
    };

    var emptyInputs = function(){
             if($scope.username.trim().length === 0){
                return true;
             }
             if($scope.password.trim().length === 0){
                return true;
             }
             if($scope.rePassword.trim().length === 0){
                return true;
             }
             if($scope.email.trim().length === 0){
                return true;
             }
             if($scope.ufirst.trim().length === 0){
                return true;
             }
             if($scope.ulast.trim().length === 0){
                return true;
             }
             if($scope.ubirth.trim().length === 0){
                return true;
             }
             if($scope.ucity.trim().length === 0){
                return true;
             }
             if($scope.ustate.trim().length === 0){
                return true;
             }
             if($scope.cnumber.trim().length === 0){
                return true;
             }
             if($scope.ctype.trim().length === 0){
                return true;
             }
             if($scope.scode.trim().length === 0){
                return true;
             }
             if($scope.expdate.trim().length === 0){
                return true;
             }
             if($scope.baddress.trim().length === 0){
                return true;
             }
             if($scope.country.trim().length ===0){
                return true;
             }
             if($scope.bstate.trim().length === 0){
                return true;
             }
             if($scope.bzip.trim().length === 0){
                return true;
             }
             if($scope.phone.trim().length ===0){
                return true;
             }
             return false;
    };

    /*
     * Validates that the password entered is the same
    */
    var passwordIsSame = function(){
        if ($scope.password != $scope.rePassword){
            $scope.errorFlag.password = true;
            return false;
        }
        return true;
    };

    /*
     * Validates date field isn't empty
    */

    var dateFieldIsEmpty = function(){
        if  ($scope.submitedDate === ""){
            $scope.errorFlag.date = true;
            return true
        }
        return false;
    }

    /*
     * Validate is name field is empty
    */
    var nameIsEmpty = function(){
        if ($scope.username === ""){
            $scope.errorFlag.name = true;
            return true;
        }
        return false;
    }

    /*
     *  Validate sign up
    */
    var validateSignUp = function(){
        return true;
    }

    /*
     *  Reset Flags
    */
    var resetFlags = function(){
        $scope.errorFlag.emptyEP= false;
        $scope.errorFlag.email= false;
        $scope.errorFlag.password= false;
        $scope.errorFlag.name= false;
        $scope.errorFlag.date= false;
    }

    /*
     * Reset Fields
    */
    var resetFields = function(){
        $scope.email="";
        $scope.password="";
        $scope.name="";
        $scope.submitedDate="";
        $scope.reEmail="";
        $scope.rePassword="";
    }
}]);

// Create New Post
    app.controller('addPostController', ['$scope', '$http', '$location','localStorageService', function($scope, $http, $location, localStorageService){

        //var currentPath=$location.path();
        var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        var AID = localStorageService.get('aid');
        $http.get(generalPath+"/DealItSrv/categories")
        .then(function(response){
            $scope.categories = response.data;
        });

        $scope.name="";
        $scope.conditions="";
        $scope.category="";
        $scope.price=0;
        $scope.brand="";
        $scope.img_url=""
        $scope.description=""
//        $scope.seller="";

        $scope.errorFlag = {
            emptyEP: false,
            name: false,
            category: false,
            seller: false,
        };


        $scope.post = function(isValid){
            if(isValid && validatePost()){


                    $http.post(generalPath+"/DealItSrv/newPost", {category: $scope.categorySelected, aid: AID,
                     product: $scope.product, brand: $scope.brand, condition: $scope.conditions, price: $scope.cost,
                     description: $scope.description, img_url: $scope.img_url})
                     .then(function(response){
                         $location.path("/");
                     });


            }
            else{
               alert("Not Valid");
            }
        };

        var validatePost = function(){
            if ($scope.product === "" || $scope.categorySelected === ""){
                $scope.errorFlag.emptyEP= true;
                return false;
            }
            return true;
        };

        var nameIsEmpty = function(){
            if ($scope.product === ""){
                $scope.errorFlag.name = true;
                return true;
            }
            return false;
        };

        var categoryIsEmpty = function(){
            if ($scope.category === ""){
                $scope.errorFlag.category = true;
                return true;
            }
            return false;
        };

        var priceIsInvalid = function(){
            if (typeof($scope.price) != 'number') {
                $scope.errorFlag.price = true;
                return true;
            }
            return false;
        };

//        var sellerIsEmpty = function(){
//            if ($scope.seller === ""){
//                $scope.errorFlag.seller = true;
//                return true;
//            }
//            return false;
//        }

        /*
         *  Reset Flags
        */
        var resetFlags = function(){
            $scope.errorFlag.emptyEP= false;
            $scope.errorFlag.name= false;
            $scope.errorFlag.category= false;
//            $scope.errorFlag.seller= false;
            $scope.errorFlag.price = false;
        };

        /*
         * Reset Fields
        */
        var resetFields = function(){
            $scope.name="";
            $scope.seller="";
            $scope.category="";
            $scope.description="";
            $scope.price="";
        };
    }]);
