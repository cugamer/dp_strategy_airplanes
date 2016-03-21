Airplanes strategy pattern
==========================

An implementation of the strategy pattern as applied to an application about airplanes.  The Airplane class holds methods for various 
concrete airplane classes which derive from it.  The AccelerationType and TakePicturesBehavior interfaces are implemented in classes
which create specific behaviors.  These concrete behaviors can be swapped in and out of the various airplane classes as needed.  Default
behavior objects are set when the airplane objects are instantiated,  but these can also be changed at runtime via their setter methods.
This is basic practice with the strategy pattern.

![UML diagram of project](https://github.com/cugamer/dp_strategy_airplanes/blob/master/dp_strategy_airplanes/dp_strategy_airplanes.png)
