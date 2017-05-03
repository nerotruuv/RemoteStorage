#ifndef ENGINE_H
#define ENGINE_H
#include "arduino.h"
#include "StepMotor.h"

class Engine
{
  public:
    Engine(StepMotor& links, StepMotor& rechts) : left(links), right(rechts) {};
    virtual ~Engine();
    void Right();
    void Left();
    void Forward();
    void Backward();

    void RightTo(int);
    void LeftTo(int);
    void ForwardTo(int);
    void BackwardTo(int);
    void Stop();

  private:
    StepMotor left;
    StepMotor right;
    int currentStep = 0;
};

#endif
