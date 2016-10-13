var app= angular.module('myapp',["ngRoute","ngMaterial","ngMdIcons","ui.grid"]);

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
        });
    });

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
    app.controller('mainController',['$scope','$http','$location','$mdSidenav',function($scope,$http,$location,$mdSidenav){
        var currentPath = $location.path();
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
    }]);

    //Home controller (Home Page)
    app.controller('homeController',['$scope','$http', '$location', function($scope,$http, $location){

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
    app.controller('aboutController',['$scope', function($scope){
    $scope.aboutUs="We are a group of students looking to contribute with innovating ideas.We live on a society that depends on  science and technology. As technology advance  our goal is making things easier."
                  +" Things like cars, houses, and clothes advertisement are now performed online.";

    $scope.clients="DealIt is a web application that offers a user friendly interface were can be placed sales/trades and special offers."
                  +" The sales/trade transactions could be anything such as: vehicles, houses, electronics, furniture, and miscellaneous.As mentioned before"
                  +" sales/trades could be anything, so this web application targets everyone willing to"
                  +" sale/buy/trade something that fits in one of the above categories.";
    }]);



     //Car Category Controller
    app.controller('carController', ['$scope','$http','$location', function($scope,$http,$location){
        var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.carCategory="This is the car category page";
      
        $scope.gridOptions1= {
           enableSorting: true,
           columnDefs: [
                {field: 'name'},
                {field: 'description'},
                {field: 'price'}
               ],
           onRegisterApi: function( gridApi){
                  $scope.grid1Api= gridApi;
            }
         };

        $http.get(generalPath+"/DealItSrv/items/cars")
                .then(function(response){
					$scope.gridOptions1.data=response.data;
					$scope.gridOptions1.columnDefs[0].enableHiding=false;
					$scope.gridOptions1.columnDefs[1].enableHiding=false;
					$scope.gridOptions1.columnDefs[2].enableHiding=false;
   				});
            
      

    }]);

    //House Category Controller
    app.controller('houseController', ['$scope','$http','$location', function($scope,$http,$location){
		var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.houseCategory="This is the house category page";

		$scope.gridOptions1= {
           enableSorting: true,
           columnDefs: [
                {field: 'name'},
                {field: 'description'},
                {field: 'price'}
               ],
           onRegisterApi: function( gridApi){
                  $scope.grid1Api= gridApi;
                  $scope.gridOptions1.columnDefs[0].enableHiding=false;
                  $scope.gridOptions1.columnDefs[1].enableHiding=false;
                  $scope.gridOptions1.columnDefs[2].enableHiding=false;
            }
         };

        $http.get(generalPath+"/DealItSrv/items/houses")
                .then(function(response){
					$scope.gridOptions1.data=response.data;
   				});
        
    }]);

    //Technology Category Controller
    app.controller('technologyController', ['$scope','$http','$location', function($scope,$http,$location){
		var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.technologyCategory="This is technology category page";
		
		$scope.gridOptions1= {
           enableSorting: true,
           columnDefs: [
                {field: 'name'},
                {field: 'description'},
                {field: 'price'}
               ],
           onRegisterApi: function( gridApi){
                  $scope.grid1Api= gridApi;
                  $scope.grid1Api= gridApi;
                  $scope.gridOptions1.columnDefs[0].enableHiding=false;
                  $scope.gridOptions1.columnDefs[1].enableHiding=false;
                  $scope.gridOptions1.columnDefs[2].enableHiding=false;
            }
         };

        $http.get(generalPath+"/DealItSrv/items/technology")
                .then(function(response){
					$scope.gridOptions1.data=response.data;
   				});
        
    }]);

    //Furniture Category Controller
    app.controller('furnitureController', ['$scope','$http','$location', function($scope,$http,$location){
		var generalPath = $location.protocol()+"://"+$location.host()+":"+$location.port();
        $scope.furnitureCategory="This is furniture category page";
        
		$scope.gridOptions1= {
           enableSorting: true,
           columnDefs: [
                {field: 'name'},
                {field: 'description'},
                {field: 'price'}
               ],
           onRegisterApi: function( gridApi){
                  $scope.grid1Api= gridApi;
            }
         };

        $http.get(generalPath+"/DealItSrv/items/furniture")
                .then(function(response){
					$scope.gridOptions1.data=response.data;
   				});
    }]);


    // Login , Sign up controller
    app.controller('loginController',['$scope','$http','$location', function($scope,$http,$location){
	
    // Controller Instances
     var currentPath= $location.path(); //the current location is stored on this variable

     $scope.email="";                   //store the email
     $scope.password="";                //store the password
     $scope.name="";                    //store the name of the new user
     $scope.submitedDate="";            //store the Birth date of the new user
     $scope.reEmail="";                 //Use to verify if the email entered is the same
     $scope.rePassword="";              //Use to verify if the password entered is the same

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
            $http.post(currentPath+"/submit",{ email: $scope.email, password: $scope.password})
                .then(function(response){
                      resetFlags();
					  resetFields();
                      alert(response.data);
                      $location.path("/");
               });
          }
          else{
             alert("Login failure");
          }
     };

    /*
     * Call to submit new user credentials
    */
    $scope.signup = function(){

        if(validateSignUp()){
            $http.post(currentPath+"/signup")
            .then(function(response){
                resetFlags();
                resetFields();
                alert(response.data);
                $location.path('/');
            });

        }
        else{
            alert("There is a problem with the form");
        }
    };

   
	$scope.signup2 = function(){
         if(validateSignUp()){
            $http.post(currentPath+"/signup2",{name: $scope.name, bdate: $scope.submitedDate, email: $scope.email, password: $scope.password})
                  .then(function(response){
                       resetFlags();
                       resetFields();
                       alert(response.data);
                       $location.path("/"); 
                  });
          }
          else{
              alert("There is a problem with the form!");
          }
    };
   
    /*
     * Validates that the email field or the password field isn't empty
    */
    var validateLogin = function(){
        if ($scope.email === "" || $scope.password === ""){
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
        if ($scope.name === ""){
            $scope.errorFlag.name = true;
            return true;
        }
        return false;
    }

    /*
     *  Validate sign up
    */
    var validateSignUp = function(){
        return (validateLogin() && emailIsSame() && passwordIsSame()
                && !dateFieldIsEmpty() && !nameIsEmpty());
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

