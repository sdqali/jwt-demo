(function(angular) {
  var LoginController = function($scope, $localStorage, $http, $location, Login) {
    $scope.login = function(username, password) {
      new Login({username: username, password: password})
          .$login(function (profile, headers) {
            $localStorage.user = profile;
            $localStorage.token = headers().token;
            $http.defaults.headers.common.Authorization = 'Bearer ' + headers().token;
            $location.path("/");
          }, function (error) {
            console.log(error);
          });
    };

    $scope.logout = function () {
      delete $localStorage.user;
      delete $localStorage.token;
      $http.defaults.headers.common = {};
    }

    $scope.logout();
  };

  LoginController.$inject = ['$scope', '$localStorage', '$http', '$location','Login'];
  angular.module("jwtDemo.controllers").controller("LoginController", LoginController);


  var ProfileController = function ($scope, $localStorage) {
    $scope.profile = $localStorage.user;
  };
  ProfileController.inject = ['$scope', '$localStorage'];
  angular.module("jwtDemo.controllers").controller("ProfileController", ProfileController);
}(angular));