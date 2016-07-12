(function(angular) {
  var AppController = function($scope, $localStorage, $http, Login) {
    $scope.profile = {};
    $scope.login = function(username, password) {
      new Login({username: username, password: password})
          .$login(function (profile, headers) {
            $localStorage.user = profile;
            $http.defaults.headers.common.Authorization = 'Bearer ' + headers().token;
          }, function (error) {
            console.log(error);
          });
    };
  };

  AppController.$inject = ['$scope', '$localStorage', '$http', 'Login'];
  angular.module("jwtDemo.controllers").controller("AppController", AppController);
}(angular));