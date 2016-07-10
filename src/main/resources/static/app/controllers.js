(function(angular) {
  var AppController = function($scope, $rootScope, Login) {
    $scope.profile = {};
    $scope.login = function(username, password) {
      new Login({username: username, password: password})
          .$login(function (profile, headers) {
            $scope.profile = profile;
            $rootScope.jwt = headers().token;
          }, function (error) {
            console.log(error);
          });
    };
  };

  AppController.$inject = ['$scope', '$rootScope', 'Login'];
  angular.module("jwtDemo.controllers").controller("AppController", AppController);
}(angular));