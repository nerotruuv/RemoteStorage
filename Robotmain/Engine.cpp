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

void Engine::Stop() {
  left.Stop();
  right.Stop();
}


