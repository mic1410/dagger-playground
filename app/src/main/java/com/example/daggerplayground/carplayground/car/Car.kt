package com.example.daggerplayground.carplayground.car

import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels)