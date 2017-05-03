#ifndef STEP_H
#define STEP_H
#include "Arduino.h"

class StepMotor
{
  public:
    StepMotor(int in1, int in2, int in3, int in4) : IN1(in1), IN2(in2), IN3(in3), IN4(in4) {};
    virtual ~StepMotor();
    void FullStep(bool);
    void Stop();
    void Initialize();
    
  private:
    int IN1;
    int IN2;
    int IN3;
    int IN4;
    int currentStep = 0;
    bool stopped = true;
};

#endif
