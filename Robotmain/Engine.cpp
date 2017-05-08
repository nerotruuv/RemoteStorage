#include "Engine.h"
#include "arduino.h"

using namespace std;


Engine::~Engine() {

}

void Engine::Right() {
  left.FullStep(false);
  right.FullStep(false);
}

void Engine::Left() {
  left.FullStep(true);
  right.FullStep(true);
}

void Engine::Forward() {
  left.FullStep(false);
  right.FullStep(true);
}

void Engine::Backward() {

  left.FullStep(true);
  right.FullStep(false);
}

void Engine::Stop() {
  left.Stop();
  right.Stop();
}

void Engine::SetForwardTo(int steps){
  if(busy == false){
    compass = 1;
    busy = true;
    target = steps;
  }
}

void Engine::SetRightTo(int steps){
  if(busy == false){
    compass = 2;
    busy = true;
    target = steps;
  }
}

void Engine::SetBackwardTo(int steps){
  if(busy == false){
    compass = 3;
    busy = true;
    target = steps;
  }
}

void Engine::SetLeftTo(int steps){
  if(busy == false){
    compass = 4;
    busy = true;
    target = steps;
  }
}

void Engine::CheckTask(){
  if(busy == true && target > 0){
    switch(compass){
      case 1:   
          left.FullStep(true);
          right.FullStep(false);
          target--;
          break;
      case 2:   
          left.FullStep(false);
          right.FullStep(false);
          target--;
          break;
      case 3:   
          left.FullStep(false);
          right.FullStep(true);
          target--;
          break;
      case 4:   
          left.FullStep(true);
          right.FullStep(true);
          target--;
          break;
      default :
          Stop();
          
    }else{
      compass = 0;
      busy = false;
    }
  }
}

/*
void Engine::RightTo(int steps) {
  for (int totalSteps = 0; totalSteps <= steps; totalSteps++) {
    left.FullStep(false);
    right.FullStep(false);
  }
  Stop();
}

void Engine::LeftTo(int steps) {
  for (int totalSteps = 0; totalSteps <= steps; totalSteps++) {
    left.FullStep(true);
    right.FullStep(true);
  }
  Stop();
}

void Engine::ForwardTo(int steps) {
  for (int totalSteps = 0; totalSteps <= steps; totalSteps++) {
    left.FullStep(true);
    right.FullStep(false);
  }
  Stop();
}

void Engine::BackwardTo(int steps) {
  for (int totalSteps = 0; totalSteps <= steps; totalSteps++) {
    left.FullStep(false);
    right.FullStep(true);
  }
  Stop();
}
*/





