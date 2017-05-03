//#include <NewPing.h>


#include "Engine.h"
#include "StepMotor.h"

StepMotor Left(34,32,30,28);
StepMotor Right(44,46,48,50);
Engine Motor(Left,Right);

void setup(){
Serial.begin(9600); 
Left.Initialize();
Right.Initialize(); 
}

void loop(){
  Motor.Forward();
}


/*
// Normal
#define front_trig 3
#define front_echo 6

// Parallax
#define left_trig 5
#define left_echo 5

// Parallax
#define right_trig 4
#define right_echo 4

// Normal
#define bottom_trig 2
#define bottom_echo 7

#define wheel_radius 4

#define beeperPin 8

#define MAX_DISTANCE 200 // Maximum distance we want to ping for (in centimeters). Maximum sensor distance is rated at 400-500cm.
#define   M_2_PI   6.28318530717958647692 /* 2 x pi */
/*
NewPing front(front_trig, front_echo, MAX_DISTANCE); // NewPing setup of pins and maximum distance.
NewPing left(left_trig, left_echo, MAX_DISTANCE); // NewPing setup of pins and maximum distance.
NewPing right(right_trig, right_echo, MAX_DISTANCE); // NewPing setup of pins and maximum distance.
NewPing bottom(bottom_trig, bottom_echo, MAX_DISTANCE); // NewPing setup of pins and maximum distance.

StepMotor stepMotorLeft(48,50,52,54);
x

Engine broem(stepMotorLeft,stepMotorRight);

bool shouldDriveForward = true;
bool triedLeft = false;
bool triedRight = false;

void beep(unsigned char delayms){
  analogWrite(beeperPin, 20);      // Almost any value can be used except 0 and 255
                           // experiment to get the best tone
  delay(delayms);          // wait for a delayms ms
  analogWrite(beeperPin, 0);       // 0 turns it off
  delay(delayms);          // wait for a delayms ms   
}  

void setup() {
  
  stepMotorLeft.Initialize();
  stepMotorRight.Initialize();

}

void loop() {
  broem.Forward();

  unsigned int uS = front.ping(); // Send ping, get ping time in microseconds (uS).
  float front = uS / US_ROUNDTRIP_CM; // Distance to front sensor
  uS = left.ping(); // Send ping, get ping time in microseconds (uS).
  float left = uS / US_ROUNDTRIP_CM;
  uS = right.ping(); // Send ping, get ping time in microseconds (uS).
  float right = uS / US_ROUNDTRIP_CM;
  uS = bottom.ping(); // Send ping, get ping time in microseconds (uS).
  float bottom = uS / US_ROUNDTRIP_CM;

  if(bottom != 0 && bottom >= 3){
      // Go backward here
      shouldDriveForward = false;
      broem.BackwardTo(M_2_PI * wheel_radius * 2048);
  }

  if(front != 0 && front >= 2) {
  
        // Wanneer de ruimte aan de voorkant groter is als 20 cm en de onderkant sensor on der de detectie drempel zit
      
        if(left <= 10 && right <= 10 && shouldDriveForward){
            // Wanneer de linker en de rechterkant kleiner zijn als 10, rechtdoor
            // Rechtdoor
           broem.Forward();
        }else if(left >= 10 && shouldDriveForward){
          // Linksaf
           broem.Left();
        }else if(right >= 10 && shouldDriveForward){
          // Rechtsaf
           broem.Right();
        }else{
          // Achteruit (dit kon niet op deze besturingsmethode, dus hij ging gwn vooruit XD)
           broem.Backward();         
        }
       
        triedLeft = false;
        triedRight = false;
                                       
      }else if(!shouldDriveForward){
        // Stop de robot                     
        broem.Stop();
  
        // Beide keuzes geprobeerd
        if(triedLeft && triedRight){        
          //Beep here
          beep(200);
          // De robot zit vast          
        }
        
        // dit is het punt om andere mogelijkheden te controlleren
        int choice = random(1,3);
        switch(choice){
            case 1:
              if(!triedLeft){
                // Links af
                broem.Left(); 
                delay(1000);  
                triedLeft = true;  
              }
            break;
            
            case 2:
              if(!triedRight){
                // Rechts af
                broem.Right();
                delay(1000);    
                triedRight = true;            
              }          
            break;          
          }   
        }else{
          // Stop de robot
          broem.Stop();
          beep(200);
        }
}
*/

