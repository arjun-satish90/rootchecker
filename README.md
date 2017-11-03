Cordova Root Detection  (root_detector)
======

This plugin is used to detect whether the device is rooted or not .


Installation 

Add the plugin to the project like this 


cordova plugin add LOCATION_OF_PLUGIN 

Inorder to remove plugin 

cordova plugin remove root_detector


Usage


Inorder to invoke the plugin , see the example below 


 window.rootDetector.isRooted(function(rootValue) { alert(rootValue) } )   //This would alert the value


rootValue - Have 2 values 

           true - if the device is rooted 
           false - if the device is not rooted


NB : Manufacturer's of some device rom has left the busybox binary -- Device like Oneplusone , Moto E  . So we have left the binary check when we check for root