#include "Engine.h"
#include "StepMotor.h"

StepMotor left(8,9,10,11);
StepMotor right(4,5,6,7);

Engine broem(left,right);

void setup() {
  
  left.Initialize();
  right.Initialize();

}

void loop() {
  broem.Forward();

}
